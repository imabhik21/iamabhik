package com.Comrades.conversionapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView indicator,outputindi,inindi;
	EditText input,output;
	Button convert;
	Spinner select;
	String[] items = {"Select","Currency Conversion","Length Conversion","Temperature Conversion"};
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inindi = (TextView) findViewById(R.id.textViewinputindi);
        outputindi = (TextView) findViewById(R.id.textView2);
        indicator = (TextView) findViewById(R.id.textViewdisp);
        input = (EditText) findViewById(R.id.editTextfirst);
        output = (EditText) findViewById(R.id.editTextoutput);
        convert = (Button) findViewById(R.id.buttonresult);
        select = (Spinner) findViewById(R.id.spinneritems);
        
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line, items);
        select.setAdapter(adapter);
        
        select.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				indicator.setText(items[position]);
				switch (position) {
				case 1:
					input.setText("");
					output.setText("");
					input.setHint("Enter the vale in INR");
					output.setHint("Dollars $");
					convert.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							
							String inr;
							Float inr1 = null;
							Float doll1 = null;
							inr = input.getText().toString();
							try {
								inr1 = Float.parseFloat(inr);
								//Toast.makeText(MainActivity.this,"in try block",Toast.LENGTH_SHORT).show();
							} catch (NumberFormatException e) {
								//Toast.makeText(MainActivity.this,"in catch block",Toast.LENGTH_SHORT).show();
								e.printStackTrace();
							}
							try {
								doll1 = inr1/65;
							} catch (NullPointerException e) {
								output.setText("Enter any value");
							}
							String doll;
							doll = String.valueOf(doll1);
							output.setText(doll);
						}
					});
					break;
				case 2:
					input.setText("");
					output.setText("");
					input.setHint("Enter the vale in Kms");
					output.setHint("Miles");
					convert.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							String kms;
							Float kms1 = null;
							Float miles1 = null;
							kms = input.getText().toString();
							try {
								kms1 = Float.parseFloat(kms);
								//Toast.makeText(MainActivity.this,"in try block",Toast.LENGTH_SHORT).show();
							} catch (NumberFormatException e) {
								//Toast.makeText(MainActivity.this,"in catch block",Toast.LENGTH_SHORT).show();
								e.printStackTrace();
							}
							try {
								miles1 = (float) (kms1/1.60934);
							} catch (NullPointerException e) {
								output.setText("Enter any value");
							}
							String miles;
							miles = String.valueOf(miles1);
							output.setText(miles);
						}
					});
					break;
				case 3:
					input.setText("");
					output.setText("");
					input.setHint("Enter vale in Celsius");
					output.setHint("Fahrenheit");
					convert.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							String cel;
							Float cel1 = null;
							Float fah1 = null;
							cel = input.getText().toString();
							try {
								cel1 = Float.parseFloat(cel);
								//Toast.makeText(MainActivity.this,"in try block",Toast.LENGTH_SHORT).show();
							} catch (NumberFormatException e) {
								//Toast.makeText(MainActivity.this,"in catch block",Toast.LENGTH_SHORT).show();
								e.printStackTrace();
							}
							try {
								fah1 = (float) (cel1*9/5+32);
							} catch (NullPointerException e) {
								output.setText("Enter any value");
							}
							String fah;
							fah = String.valueOf(fah1);
							output.setText(fah);
						}
					});
					break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				output.setText("Click on select");
			}
		});
    }
}
