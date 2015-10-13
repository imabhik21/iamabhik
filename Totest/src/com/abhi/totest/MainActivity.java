package com.abhi.totest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onCreate Method",Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onStart Method",Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onResume Method",Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onPause Method",Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onStop Method",Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this,"in onDestroy Method",Toast.LENGTH_SHORT).show();
	}

	

}
