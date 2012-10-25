package com.curt.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.curt.images.ImageHelper;
import com.curt.parts.InstallSheetView;
import com.curt.parts.Part;
import com.curt.parts.PartAttribute;
import com.curt.parts.PartImage;
import com.curt.vehicle.DecodeResponse;
import com.curt.vehicle.VinDecoder;

import curt.android.history.HistoryActivity;
import curt.android.share.ShareActivity;

public class PartResult extends FragmentActivity implements OnClickListener {

	private static final int SCAN_ID = Menu.FIRST;
	private static final int SHARE_ID = Menu.FIRST + 1;
    private static final int HISTORY_ID = Menu.FIRST + 2;
    private static final int SETTINGS_ID = Menu.FIRST + 3;
    private static final int HELP_ID = Menu.FIRST + 4;
    private static final int ABOUT_ID = Menu.FIRST + 5;
    
    public static final int HISTORY_REQUEST_CODE = 0x0000bacc;
	
	public CollectionPagerAdapter pagerAdapter;
	public FragmentManager fManager;
	public ViewPager viewPager;
	//public static ArrayList<Part> parts;
	public DecodeResponse vinResponse;

	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.pager_main);
		LoadResults();
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onResume(){
		LoadResults();
		super.onResume();
	}
	
	public void LoadResults(){
		if(vinResponse == null){
			Bundle extras = getIntent().getExtras();
			VinDecoder.DataWrapper vinWrap = new VinDecoder.DataWrapper();
			String json = extras.getString("vin_response");
			vinResponse = vinWrap.fromJson(json);
			if(vinResponse == null || vinResponse.Parts == null || vinResponse.Parts.size() == 0){
				Intent intent = new Intent(getApplicationContext(), Scanner.class);
				startActivity(intent);
			}else{
				pagerAdapter = new CollectionPagerAdapter(getSupportFragmentManager());
				pagerAdapter.parts = vinResponse.Parts;
				
				viewPager = (ViewPager)findViewById(R.id.pager);
				viewPager.setAdapter(pagerAdapter);
				viewPager.setCurrentItem(0);
			}
		}else{
			
			pagerAdapter = new CollectionPagerAdapter(getSupportFragmentManager());
			pagerAdapter.parts = vinResponse.Parts;
			
			viewPager = (ViewPager)findViewById(R.id.pager);
			viewPager.setAdapter(pagerAdapter);
			viewPager.setCurrentItem(0);
		}
	}
	
	@Override
	public void onClick(View v){
		if(v.getId() == R.id.pdf_button){
			String sheet = (String)v.getTag();
			Intent intent = new Intent(getApplicationContext(), InstallSheetView.class);
			intent.putExtra("url", sheet);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			try{
				startActivity(intent);
			}catch(ActivityNotFoundException e){
				Toast.makeText(v.getContext(), "No Application Available to View PDF", Toast.LENGTH_SHORT).show();
			}catch(Exception e){
				e.printStackTrace();
				Toast.makeText(v.getContext(), "Failed to load the install sheet", Toast.LENGTH_SHORT).show();
			}
		}else if(v.getId() == R.id.video_button){
			String url = (String)v.getTag();
			try{
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + url)));
			}catch(ActivityNotFoundException e){
				Toast.makeText(v.getContext(), "No Application Available to View Install Video", Toast.LENGTH_SHORT).show();
			}catch(Exception e){
				e.printStackTrace();
				Toast.makeText(v.getContext(), "Failed to load the install video", Toast.LENGTH_SHORT).show();
			}
		}else if(v.getId() == R.id.details_button){
			Toast.makeText(v.getContext(), "Not implemented", Toast.LENGTH_SHORT).show();
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		
		getMenuInflater().inflate(R.menu.result, menu);
		
		if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
			getActionBar().setDisplayShowTitleEnabled(false);
		}else{
			getActionBar().setDisplayShowTitleEnabled(true);
		}
		

		MenuItem vehicle = menu.findItem(R.id.vehicle);
		vehicle.setTitle(vinResponse.GetYear() + " " + vinResponse.GetMake() + " " + vinResponse.GetModel() + " " + vinResponse.GetTrim());
		vehicle.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent intent = new Intent(getApplicationContext(),
						PartResult.class);
				startActivity(intent);
				return false;
			}

		});
		
		menu.add(Menu.NONE, SCAN_ID, Menu.NONE, R.string.menu_scan).setIcon(android.R.drawable.ic_menu_camera);
		//menu.add(Menu.NONE, SHARE_ID, Menu.NONE, R.string.menu_share).setIcon(android.R.drawable.ic_menu_share);
	    menu.add(Menu.NONE, HISTORY_ID, Menu.NONE, R.string.menu_history).setIcon(android.R.drawable.ic_menu_recent_history);
	    menu.add(Menu.NONE, SETTINGS_ID, Menu.NONE, R.string.menu_settings).setIcon(android.R.drawable.ic_menu_preferences);
	    menu.add(Menu.NONE, HELP_ID, Menu.NONE, R.string.menu_help).setIcon(android.R.drawable.ic_menu_help);
	    menu.add(Menu.NONE, ABOUT_ID, Menu.NONE, R.string.menu_about).setIcon(android.R.drawable.ic_menu_info_details);

		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
		switch(item.getItemId()){
			case SCAN_ID:
				intent.setClassName(this, Scanner.class.getName());
				startActivity(intent);
				break;
			case SHARE_ID:
				intent.setClassName(this, ShareActivity.class.getName());
				startActivity(intent);
				break;
			case HISTORY_ID:
				intent.setClassName(this, HistoryActivity.class.getName());
				startActivityForResult(intent, HISTORY_REQUEST_CODE);
				break;
			case SETTINGS_ID:
				intent.setClassName(this, PreferencesActivity.class.getName());
				startActivity(intent);
				break;
			case HELP_ID:
				intent.setClassName(this, HelpActivity.class.getName());
				startActivity(intent);
				break;
			case ABOUT_ID:
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
		        builder.setTitle("CURT Laser");
		        builder.setMessage("VIN Scanner built by CURT Manufacturing, LLC.\n\n Custom Development by Alex Ninneman");
		        builder.setIcon(R.drawable.ic_action);
		        builder.show();
				break;
		}
		return true;
	}
	
	public class CollectionPagerAdapter extends FragmentStatePagerAdapter{

		ArrayList<Part> parts = null;
		
		public CollectionPagerAdapter(FragmentManager fm) {
			super(fm);
		}
		
		@Override
		public Fragment getItem(int i){
			PartObjectFragment frag = new PartObjectFragment();
			frag.SetPart(parts.get(i));

			return frag;
		}
		
		@Override
		public int getCount(){
			if(parts == null){
				return 0;
			}
			return parts.size();
		}
		
		@Override
		public CharSequence getPageTitle(int pos){
			Part part = parts.get(pos);
			return "CURT #" + part.PartId;
		}
		
	}
	
	public static class PartObjectFragment extends Fragment{

		public static final String ARG_OBJECT = "part";
		private Part part = null;
		
		
		public PartObjectFragment(){
			setRetainInstance(true);
		}
		
		public void SetPart(Part p){
			this.part = p;
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){
			/*PagerTitleStrip strip = (PagerTitleStrip)container.findViewById(R.id.pager_title_strip);
			if(strip != null){
				Category cat = part.Categories.get(0);
				if(cat != null){
					String hex = cat.ColorCode;
					int first = Integer.parseInt(hex.substring(0,3));
					int second = Integer.parseInt(hex.substring(3,6));
					int third = Integer.parseInt(hex.substring(6,9));
					
					strip.setTextColor(Color.rgb(first,second,third));
				}
			}*/
			View layout = inflater.inflate(R.layout.pager_collection_object, container,false);
			if(part == null){
				return layout;
			}
			
			TextView title = (TextView)layout.findViewById(R.id.partResultDesc);
			title.setText(part.ShortDesc);
			if (part.Images.size() > 0) {
				ImageView img = (ImageView)layout.findViewById(R.id.partResultImage);

				Iterator<PartImage> imgIter = part.Images.iterator();
				String imgPath = null;
				while(imgIter.hasNext() && imgPath == null ){
					PartImage pImg = imgIter.next();
					if(pImg.Sort == 'a' && pImg.Width == 300){
						imgPath = pImg.Path;
					}
				}
				if(imgPath == null){
					imgPath = part.Images.get(0).Path;
				}
				
				img.setTag(imgPath);
				img.setMinimumHeight(300);
				img.setMinimumWidth(300);
				img.setMaxHeight(301);
				img.setMaxWidth(301);
				DownloadImagesAsync imgLoader = new DownloadImagesAsync();
				ProgressBar bar = (ProgressBar)layout.findViewById(R.id.image_loader);
				imgLoader.bar = bar;
				imgLoader.execute(img);
			}
			
			// Load the install sheet
			String installSheet = null;
			TextView pdfButton = (TextView)layout.findViewById(R.id.pdf_button);
			if(pdfButton != null){
				Iterator<PartAttribute> conIter = part.Content.iterator();
				while(conIter.hasNext() && installSheet == null){
					PartAttribute content = conIter.next();
					if(content.Key.toUpperCase().equals("INSTALLATIONSHEET")){
						installSheet = content.Value;
						break;
					}
				}
				if(installSheet != null){
					pdfButton.setTag(installSheet);
					pdfButton.setVisibility(View.VISIBLE);
				}
			}
			
			// Load the video
			TextView videoButton = (TextView)layout.findViewById(R.id.video_button);
			if(videoButton != null){
				String vidUrl = part.GenerateVideoUrl();
				if(vidUrl != null && vidUrl.length() > 0){
					videoButton.setTag(vidUrl);
					videoButton.setVisibility(View.VISIBLE);
				}
			}
			
			// Ok let's throw up some part attributes
			Iterator<PartAttribute> attrIter = part.Attributes.iterator();
			TableLayout table = (TableLayout)layout.findViewById(R.id.part_attribute_table);
			if(table != null){
				while(attrIter.hasNext()){
					PartAttribute attr = attrIter.next();
					TableRow row = new TableRow(layout.getContext());
					TextView keyCell = new TextView(layout.getContext());
					keyCell.setTypeface(null, Typeface.BOLD);
					keyCell.setText(attr.Key);
					TextView valCell = new TextView(layout.getContext());
					valCell.setText(attr.Value);
					valCell.setGravity(Gravity.RIGHT);
					row.addView(keyCell);
					row.addView(valCell);
					table.addView(row);
				}
			}
			
			
			return layout;
		}
	}

	public static class DownloadImagesAsync extends
			AsyncTask<ImageView, Void, Bitmap> {
		ImageView imageView = null;
		ProgressBar bar = null;

		@Override
		protected Bitmap doInBackground(ImageView... imageViews) {
			this.imageView = imageViews[0];
			String url = (String) imageView.getTag();
			try {
				return download_image(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Bitmap result) {
			imageView.setImageBitmap(result);
			bar.setVisibility(View.INVISIBLE);
			imageView.setVisibility(View.VISIBLE);
			//imageView.setBackgroundDrawable(result);
		}

		private Bitmap download_image(String u) throws IOException {
			URL url = new URL(u);
			URLConnection conn = url.openConnection();
			conn.setUseCaches(true);
			return ImageHelper.getRoundedCornerBitmap(BitmapFactory.decodeStream((InputStream)conn.getContent()), 6);
			
		}
	}
}
