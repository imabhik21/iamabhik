package com.abhi.permission_app;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
Button buttonclickhere;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonclickhere=(Button) findViewById(R.id.buttonclickhere);
		buttonclickhere.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0)
			{
			Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent, 1313);
			}
		});
	}




}
