package com.example.aci810_control3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class UnActivity extends Activity {

	
	 public final static String NAME_VALUE = "com.example.aci810_control3.NAME_VALUE";
     public final static String EMAIL_VALUE = "com.example.aci810_control3.EMAIL_VALUE";
     public final static String RATING_VALUE = "com.example.aci810_control3.RATING_VALUE";
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_un);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.un, menu);
		return true;
	}

}
