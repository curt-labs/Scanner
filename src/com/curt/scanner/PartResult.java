package com.curt.scanner;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.curt.parts.Part;
import com.curt.vehicle.Vehicle;

public class PartResult extends Activity {

	public double year;
	public String make;
	public String model;
	public String style;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_list);
		
		
		Bundle extras = getIntent().getExtras();
		this.year = extras.getDouble("year");
		this.make = extras.getString("make");
		this.model = extras.getString("model");
		this.style = extras.getString("style");
		Vehicle vehicle = new Vehicle();
		vehicle.setYear(this.year);
		vehicle.setMake(this.make);
		vehicle.setModel(this.model);
		vehicle.setStyle(this.style);
		
		new GetPartsAsync().execute(vehicle,null,null);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
		getMenuInflater().inflate(R.menu.result, menu);
		
		getActionBar().setDisplayShowTitleEnabled(false);
		
		MenuItem vehicle = menu.findItem(R.id.vehicle);
		vehicle.setTitle(this.year + " " + this.make + " " + this.model + " " + this.style);
		vehicle.setOnMenuItemClickListener(new OnMenuItemClickListener(){

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent intent = new Intent(getApplicationContext(), PartResult.class);
			    intent.putExtra("year", year);
			    intent.putExtra("make", make);
			    intent.putExtra("model", model);
			    intent.putExtra("style", style);
			    startActivity(intent);
				return false;
			}
			
		});
		
		MenuItem scan = menu.findItem(R.id.scan);
		scan.setOnMenuItemClickListener(new OnMenuItemClickListener(){

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent intent = new Intent(getApplicationContext(), Scanner.class);
				startActivity(intent);
				
				return false;
			}
			
		});
		
		
		return super.onCreateOptionsMenu(menu);
	}
	
	public class GetPartsAsync extends AsyncTask<Vehicle, Void, ArrayList<Part>>{

		@Override
		protected ArrayList<Part> doInBackground(Vehicle... params) {
			
			Vehicle vehicle = params[0];
		    
		    return vehicle.GetParts();
		}
		
		protected void onPostExecute(ArrayList<Part> parts){
			
			if(parts != null && parts.size() > 0){
			    Iterator<Part> i = parts.iterator();
			    
			    LinearLayout linear = (LinearLayout)findViewById(R.id.part_list);
			    linear.removeAllViewsInLayout();
			    while(i.hasNext()){
			    	Part part = i.next();
			    	if(part.images.size() > 0){
			    		ImageView img = new ImageView(getApplicationContext());
			    		Uri uri = Uri.parse(part.images.get(0).path);
			    		
			    		// WE NEED TO LOAD THESE IMAGES WITH ANOTHER ASYNCTASK
//						
//		    			img.setImageBitmap(loadBitmap(part.images.get(0).path));
//				    	img.setMinimumHeight(300);
//				    	img.setMinimumWidth(300);
//				    	img.setMaxHeight(301);
//				    	img.setMaxWidth(301);
//				    	
//				    	img.setBackgroundColor(Color.DKGRAY);
//				    	
//				    	linear.addView(img);
				    	
			    	}else{
			    		TextView txt = new TextView(getApplicationContext());
			    		txt.setText(part.shortDesc);
			    		linear.addView(txt);
			    	}
			    }
			}
			
		}
		
	  }
	
	public static Drawable drawable_from_url(String url, String src_name) throws java.net.MalformedURLException, java.io.IOException{
		return Drawable.createFromStream(((java.io.InputStream) new java.net.URL(url).getContent()), src_name);
	}
	
	public static Bitmap loadBitmap(String url){
		Bitmap bitmap = null;
		InputStream in = null;
		BufferedOutputStream out = null;
		try{
			in = new BufferedInputStream(new URL(url).openStream(), 4 * 1024);
			
			final ByteArrayOutputStream dataStream = new ByteArrayOutputStream();
			out = new BufferedOutputStream(dataStream, 4 * 1024);
			//copy(in,out);
			out.flush();
			
			final byte[] data = dataStream.toByteArray();
			BitmapFactory.Options opts = new BitmapFactory.Options();
			
			bitmap = BitmapFactory.decodeByteArray(data, 0, data.length, opts);
		}catch(IOException e){
			Log.e("ImageLoader", "Could not load Bitmap from: " + url);
		}finally{
			
		}
		return bitmap;			
	}
	
}
