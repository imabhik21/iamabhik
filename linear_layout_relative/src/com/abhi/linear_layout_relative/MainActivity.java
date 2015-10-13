package com.abhi.linear_layout_relative;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	RelativeLayout reltvlayout;
	LinearLayout linearlayout;
   EditText textto,textsubject;
   Button buttonsend,buttonlinear;
  
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	//	textsubject= (EditText) findViewById(R.id.);
		buttonsend=(Button) findViewById(R.id.buttonRelat);
		reltvlayout=(RelativeLayout) findViewById(R.id.relative1);
		linearlayout=(LinearLayout) findViewById(R.id.linearLayout1);
		buttonlinear= (Button) findViewById(R.id.buttonlinear);
		//final RelativeLayout r1=new RelativeLayout(getApplicationContext());
		
		buttonsend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Toast.makeText(MainActivity.this, "clicked here", Toast.LENGTH_SHORT).show();
			reltvlayout.setBackgroundColor(Color.RED);	
			linearlayout.setBackgroundColor(Color.GREEN);
			}
		});
		buttonlinear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				linearlayout.setBackgroundColor(Color.BLUE);
				reltvlayout.setBackgroundColor(Color.CYAN);
			}
		});
	}
	
	
}
