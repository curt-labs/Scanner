package com.curt.parts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class InstallSheetView extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		String url = getIntent().getExtras().getString("url");
		WebView wView = new WebView(InstallSheetView.this);
		
		wView.getSettings().setJavaScriptEnabled(true);
		wView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);
		setContentView(wView);
		
	}
	
}
