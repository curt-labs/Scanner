package com.curt.scanner;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.curt.images.ImageHelper;
import com.curt.parts.Part;
import com.curt.parts.PartAttribute;
import com.curt.parts.PartImage;
import com.curt.vehicle.DecodeResponse;
import com.curt.vehicle.VinDecoder;

public class PartResult extends FragmentActivity implements OnClickListener {

	public CollectionPagerAdapter pagerAdapter;
	public FragmentManager fManager;
	public ViewPager viewPager;
	//public static ArrayList<Part> parts;
	public DecodeResponse vinResponse;

	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.pager_main);
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
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onResume(){
		
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
		
		super.onResume();
	}
	
	@Override
	public void onClick(View v){
		if(v.getId() == R.id.pdf_button){
			String sheet = (String)v.getTag();
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(Uri.parse(sheet), "application/pdf");
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			try{
				startActivity(intent);
			}catch(ActivityNotFoundException e){
				Toast.makeText(v.getContext(), "No Application Available to View PDF", Toast.LENGTH_SHORT).show();
			}
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

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

		MenuItem scan = menu.findItem(R.id.scan);
		scan.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent intent = new Intent(getApplicationContext(),
						Scanner.class);
				startActivity(intent);

				return false;
			}

		});

		return super.onCreateOptionsMenu(menu);
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
			
			String installSheet = null;
			TextView pdfButton = (TextView)layout.findViewById(R.id.pdf_button);
			if(pdfButton != null){
				pdfButton.setVisibility(View.INVISIBLE);
				Iterator<PartAttribute> conIter = part.Content.iterator();
				while(conIter.hasNext() && installSheet == null){
					PartAttribute content = conIter.next();
					if(content.key.toUpperCase() == "INSTALLATIONSHEET"){
						installSheet = content.value;
						break;
					}
				}
				if(installSheet != null){
					pdfButton.setTag(installSheet);
					pdfButton.setVisibility(View.VISIBLE);
				}
			}
			
			
			return layout;
		}
	}

	/*public class GetPartsAsync extends
			AsyncTask<String, Void, ArrayList<Part>> {

		@Override
		protected ArrayList<Part> doInBackground(String... params) {

			String vin = params[0];
			VinDecoder decoder = new VinDecoder(vin);
			try{
				DecodeResponse resp = decoder.Decode();
				if(resp == null || resp.Parts == null || resp.Parts.size() == 0){
					Toast.makeText(getApplicationContext(), "Check your network connection and retry", Toast.LENGTH_LONG).show();
					return null;
				}
				return resp.Parts;
			}catch(UnknownHostException e){
				Toast.makeText(getApplicationContext(), "Check your network connection and retry", Toast.LENGTH_LONG).show();
			}catch(Exception e){
				Toast.makeText(getApplicationContext(), "Check your network connection and retry", Toast.LENGTH_LONG).show();
			}
			return null;
		}

		protected void onPostExecute(ArrayList<Part> parts) {
			try{
				if(parts == null || parts.size() == 0){
					Toast.makeText(getApplicationContext(), "No parts found", Toast.LENGTH_LONG).show();
					Intent intent = new Intent(getApplicationContext(), Scanner.class);
					startActivity(intent);
				}else{
					pagerAdapter = new CollectionPagerAdapter(getSupportFragmentManager());
					pagerAdapter.parts = parts;
					
					viewPager = (ViewPager)findViewById(R.id.pager);
					viewPager.setAdapter(pagerAdapter);
					viewPager.setCurrentItem(0);
				}
			}catch(Exception e){
				e.printStackTrace();
				Bundle bundle = getIntent().getExtras();
				Bundle extras = getIntent().getExtras();
				
				
				//new GetPartsAsync().execute(vehicle, null, null);
			}
		}

	}*/

	public static class DownloadImagesAsync extends
			AsyncTask<ImageView, Void, Bitmap> {
		ImageView imageView = null;
		ProgressBar bar = null;

		@Override
		protected Bitmap doInBackground(ImageView... imageViews) {
			this.imageView = imageViews[0];
			String url = (String) imageView.getTag();
			Log.e("ImageURL", url);
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
			Log.e("Image URL", u);
			URL url = new URL(u);
			URLConnection conn = url.openConnection();
			conn.setUseCaches(true);
			return ImageHelper.getRoundedCornerBitmap(BitmapFactory.decodeStream((InputStream)conn.getContent()), 6);
			
		}
	}
}
