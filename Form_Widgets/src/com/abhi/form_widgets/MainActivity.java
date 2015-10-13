package com.abhi.form_widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	
	RadioButton option1radiobutton,option2radiobutton;
	RadioGroup selectionradiogroup;
	ToggleButton togglebutton;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        option1radiobutton= (RadioButton) findViewById(R.id.radioButtonOption1);
        option2radiobutton = (RadioButton) findViewById(R.id.radioButtonOption2);
        selectionradiogroup= (RadioGroup) findViewById(R.id.radioGroup1);
        togglebutton = (ToggleButton) findViewById(R.id.toggleButton1);
       /* togglebutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if (arg1== true)
				{
					Toast.makeText(MainActivity.this,"toogle is on", Toast.LENGTH_SHORT).show();
				}
				else if(arg1==false) 
				{
					Toast.makeText(MainActivity.this,"toogle is off", Toast.LENGTH_SHORT).show();
				}
				
			}
		});*/ {
			
			
        
        togglebutton.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View v1) 
			{
			if((boolean)v1.isClickable())
			{
				Toast.makeText(MainActivity.this,"toogle is on", Toast.LENGTH_SHORT).show();
			}
			}
		});
        
        
/*        selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int selected) {
				
				switch (selected)
				{
				case R.id.radioelect1:
					Toast.makeText(MainActivity.this, "selected 1", Toast.LENGTH_SHORT).show();
					
					break;
				case R.id.radioSelect2:
					Toast.makeText(MainActivity.this, "selected 2", Toast.LENGTH_SHORT).show();
					
					break;
				case R.id.radioSelect3:
					Toast.makeText(MainActivity.this, "selected 3", Toast.LENGTH_SHORT).show();
					
					break;
				case R.id.radioSelect4:
					Toast.makeText(MainActivity.this, "selected 4", Toast.LENGTH_SHORT).show();
					
					break;

				default:
					break;
				}
			}
		});*/
        
    }


    
    
    }}
