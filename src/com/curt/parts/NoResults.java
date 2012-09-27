package com.curt.parts;

import com.curt.scanner.R;

import android.app.Activity;
import android.os.Bundle;

public class NoResults extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.no_parts_found);
	}

	
	
}
