package com.example.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	Spinner convertspinner;
	EditText entered,result;
	Button convert;
	String value;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		entered=(EditText) findViewById(R.id.editTextenter);
		result=(EditText) findViewById(R.id.editTextresult);
		convert=(Button) findViewById(R.id.convert);
		convertspinner=(Spinner) findViewById(R.id.spinnerconvert);
		final String[] menu={"TOUCH HERE TO SELECT","faranheit to cel","meter to cm"," dollar to rupees "};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,menu);
		convertspinner.setAdapter(adapter);


		convertspinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3)
			{
				switch (position)
				{
			case 1:
				entered.setHint("enter the temp in faranheit");
				
				
				convert.setOnClickListener(new OnClickListener() 
				{
					@Override
					public void onClick(View arg0) 
					{
						value=entered.getText().toString();
						final double val;
						try
						{
						val=Double.parseDouble(value);
						if(val>0)
						{
						double cel=((val-32)*5)/9;
						 String res1=String.valueOf(cel);
						result.setText("Temp in Celcius "+res1);
						}
						else{
							Toast.makeText(MainActivity.this, "invalid input", Toast.LENGTH_LONG).show();
						}
						}
						catch(Exception e)
						{
							Toast.makeText(MainActivity.this, "please enter only numeric value", Toast.LENGTH_LONG).show();
							e.printStackTrace();
						}
					}
				});
				break;
			case 2:
				entered.setHint("enter the length in meter");
				convert.setOnClickListener(new OnClickListener() 
				{
					@Override
					public void onClick(View arg0) 
					{
						value=entered.getText().toString();
						final double val;
						Toast.makeText(MainActivity.this, "clicked convert", Toast.LENGTH_LONG).show();
						try
						{
						val=Double.parseDouble(value);
						if(val>0)
						{
						double cm=(val*100);
						 String res1=String.valueOf(cm);
						result.setText("length in centimeter "+res1);
						}
						else
						{
							Toast.makeText(MainActivity.this, "invalid input", Toast.LENGTH_LONG).show();
						}
						}
						catch(Exception e)
						{
							Toast.makeText(MainActivity.this, "please enter only numeric value", Toast.LENGTH_LONG).show();
							e.printStackTrace();
						}
					}
				});
				break;
			case 3:
				entered.setHint("enter the dollar value");
				convert.setOnClickListener(new OnClickListener() 
				{
					@Override
					public void onClick(View arg0) 
					{
						value=entered.getText().toString();
						final double val;
						//Toast.makeText(MainActivity.this, "clicked convert", Toast.LENGTH_LONG).show();
						try
						{
						val=Double.parseDouble(value);
						if(val>0)
						{
						double rs=(val*66.1);
						 String res1=String.valueOf(rs);
						result.setText("equalent rupees "+res1);
						}
						else
						{
							Toast.makeText(MainActivity.this, "invalid input", Toast.LENGTH_LONG).show();	
						}
						}
						catch(Exception e)
						{
							Toast.makeText(MainActivity.this, "please enter only numeric value", Toast.LENGTH_LONG).show();
							e.printStackTrace();
						}
					}
				});
				break;

			default:
				break;
	        	}
			}

		/*	private void convertTempToCel(String val)
			{
			double cel=((val-32)*5)/9;
			//Double res=cel;
			 String res1=String.valueOf(cel);
			result.setText("Temp in Celcius "+res1);
			}  */

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
		

	}
}
