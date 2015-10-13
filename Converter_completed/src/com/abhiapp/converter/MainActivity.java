package com.abhiapp.converter;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity implements OnClickListener 
{
	Spinner spinnerAdapter;
	TextView textviewselecteditem;
	EditText editTextvalue1,editTextvalue2;
	TextView textviewshowitem;
	String value1,value2;
	Button buttonpressed;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final String[] converter={"select items","Celius to Farhenit","Km to Miles"};
		/* referred to id*/
		spinnerAdapter=(Spinner) findViewById(R.id.spinnerAdapter);
		textviewselecteditem=(TextView) findViewById(R.id.textViewSelectedConverter1);
		textviewshowitem= (TextView) findViewById(R.id.textViewOutput);
		editTextvalue1 = (EditText) findViewById(R.id.editTextInput1);
		buttonpressed= (Button) findViewById(R.id.buttonPressed);
		editTextvalue2 = (EditText) findViewById(R.id.editTextInput2);
		buttonpressed.setOnClickListener(this);




		ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,converter);
		spinnerAdapter.setAdapter(adapter);
		spinnerAdapter.setOnItemSelectedListener(new OnItemSelectedListener() 
		{

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3)
			{	
				textviewselecteditem.setText(converter[position]);
				switch (position) {
				case 1:
					editTextvalue1.setText("");
					editTextvalue2.setText("");
					editTextvalue1.setHint("enter the temp in cel");
					editTextvalue2.setHint("value if farh");
					buttonpressed.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
							final double val1;


							value1=editTextvalue1.getText().toString();
							try
							{
								Toast.makeText(MainActivity.this, "clicked converted", Toast.LENGTH_SHORT).show();

								val1=Double.parseDouble(value1);

								double cel=((val1-32)*5)/9;
								String res1=String.valueOf(cel);
								editTextvalue2.setText("temp in far"+res1);
								Editable a=editTextvalue2.getText();
								textviewshowitem.setText(a);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
					});
					break;
				case 2:
					editTextvalue1.setText("");
					editTextvalue2.setText("");
					editTextvalue1.setHint("enter the value in kms");
					editTextvalue2.setHint("value in miles is =");
					buttonpressed.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) 
						{
							final double kms;


							value1=editTextvalue1.getText().toString();
							try
							{
								Toast.makeText(MainActivity.this, "clicked converted", Toast.LENGTH_SHORT).show();

								kms=Double.parseDouble(value1);

								double miles=(kms/1.60934);
								//miles1 = (float) (kms1/1.60934);
								String res1=String.valueOf(miles);
								editTextvalue2.setText("value in miles is"+res1);
								Editable a=editTextvalue2.getText();
								textviewshowitem.setText(a);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
					});
					break;				
//				case 3:
//					editTextvalue1.setText("");
//					editTextvalue2.setText("");
//					editTextvalue1.setHint("Enter the vale in Kms");
//					editTextvalue2.setHint("Miles");
//					buttonpressed.setOnClickListener(new OnClickListener() {
//						
//						@Override
//						public void onClick(View arg0) {
//							String kms;
//							Float kms1 = null;
//							Float miles1 = null;
//							kms = editTextvalue1.getText().toString();
//							try {
//								kms1 = Float.parseFloat(kms);
//								//Toast.makeText(MainActivity.this,"in try block",Toast.LENGTH_SHORT).show();
//							} catch (NumberFormatException e) {
//								//Toast.makeText(MainActivity.this,"in catch block",Toast.LENGTH_SHORT).show();
//								e.printStackTrace();
//							}
//							try {
//								miles1 = (float) (kms1/1.60934);
//							} catch (NullPointerException e) {
//								editTextvalue2.setText("Enter any value");
//							}
//							String miles;
//							miles = String.valueOf(miles1);
//							editTextvalue2.setText(miles);
//							Editable a=editTextvalue2.getText();
//							textviewshowitem.setText(a);
//						}
//					});
//				default:
//					break;
				}
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}

			
		});
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}

}

