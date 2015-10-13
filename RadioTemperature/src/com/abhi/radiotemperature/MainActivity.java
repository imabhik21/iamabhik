package com.abhi.radiotemperature;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner converter;
	TextView textviewseen;
	RadioGroup radioselected;
	Button toconvert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		converter = (Spinner) findViewById(R.id.spinner1);
		toconvert = (Button) findViewById(R.id.buttontoConvert);
		radioselected =(RadioGroup) findViewById(R.id.radioGroup1);
		textviewseen =(TextView) findViewById(R.id.textView1);
		final String[] conversion ={"c2f","km2mtr","kg2gm"};
		ArrayAdapter<String> Adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, conversion);
		converter.setAdapter(Adapter);
		converter.setOnItemClickListener(new OnItemLongClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				textviewseen.setText("you selected "+conversion[arg2]);
			}
		});
	}
	 public void myClickHandler(View view) {
         switch (view.getId()) {
         case R.id.buttontoConvert:
                 RadioButton celsiusButton = (RadioButton) findViewById(R.id.radioGroup1);
                 RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio2);
                /* if (textviewseen.getText().length() == 0) {
                         Toast.makeText(this, "Please enter a valid number",
                                         Toast.LENGTH_LONG).show();
                         return;
                 }*/

                 float inputValue = Float.parseFloat(textviewseen.getText().toString());
                 try{
                 if (celsiusButton.isChecked()) {
                         textviewseen.setText(String
                                         .valueOf(convertFahrenheitToCelsius(inputValue)));
                         celsiusButton.setChecked(false);
                 
                         fahrenheitButton.setChecked(true);
                 }
                 
                 catch (Exception e) {
                	 Log.d("[debug]", "done");
                 }
                 
					
				}
                 } else {
                         textviewseen.setText(String
                                         .valueOf(convertCelsiusToFahrenheit(inputValue)));
                         fahrenheitButton.setChecked(false);
                         celsiusButton.setChecked(true);
                 }
                 break;
         }
 }

 // Converts to celsius
 private float convertFahrenheitToCelsius(float fahrenheit) {
         return ((fahrenheit - 32) * 5 / 9);
 }

 // Converts to fahrenheit
 private float convertCelsiusToFahrenheit(float celsius) {
         return ((celsius * 9) / 5) + 32;
 }
}
 
	


