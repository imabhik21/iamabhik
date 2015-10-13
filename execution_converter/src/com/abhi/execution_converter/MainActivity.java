package com.abhi.execution_converter;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity 
{
	Spinner conv;
	RadioButton radioch1,radioch2;
	Button buttonconvert,buttonclear;
	EditText editviewinsert;
	RadioGroup  selectionradiogroup;
	TextView editvieshwadptr,editvewconvresult;
	String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		conv= (Spinner) findViewById(R.id.spinner1);
		buttonconvert= (Button) findViewById(R.id.buttonconvert);
		radioch1= (RadioButton) findViewById(R.id.radiochoice1);
		radioch2= (RadioButton) findViewById(R.id.radiochoice2);
		editvieshwadptr = (TextView) findViewById(R.id.textViewadaptervie);
		editvewconvresult=  (TextView) findViewById(R.id.textViewshowresultview);
		editviewinsert = (EditText) findViewById(R.id.editTextshowresult);
		selectionradiogroup= (RadioGroup) findViewById(R.id.radioGroup1);
		buttonclear=(Button) findViewById(R.id.buttonclearscreen);

		final String[] conversion ={"CONVERTER","celcius<->farh","km<->mile","kg<->gm","Rupee<->Dollar"};

		ArrayAdapter<String> Adapter =  new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,conversion); 

		conv.setAdapter(Adapter);
		editvewconvresult.setText("");
		conv.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				
				switch (position) {
				case 1:
					editvieshwadptr.setText(conversion[position]);
					editvewconvresult.setText("");
					radioch1.setText("cel->far");
					radioch2.setText("farh->cel");
					selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

						@Override
						public void onCheckedChanged(RadioGroup arg0, int position)
						{ 
							editvewconvresult.setText("");
							switch (position)
							{

							case R.id.radiochoice1:
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{	
										final double cel;
										try
										{
											editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											cel=Double.parseDouble(value);
											double far=(cel*1.8)+32;
											String s1= Double.toString(far);
											editvewconvresult.setText(s1+"far");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;
							case R.id.radiochoice2:
								Toast.makeText(getApplicationContext(), "R.id.radiochoice2:", Toast.LENGTH_SHORT).show();
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{
										final double far;
										try
										{editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											far=Double.parseDouble(value);
											double cel=(far-32)*0.55;
											String s1= Double.toString(cel);
											editvewconvresult.setText(s1+"cel");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;	
							}
						}
					});	
					break;
				case 2:
					editvieshwadptr.setText(conversion[position]);
					editvewconvresult.setText("");
					radioch1.setText("km->mile");
					radioch2.setText("mile->km");
					selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

						@Override
						public void onCheckedChanged(RadioGroup arg0, int position)
						{ 
							switch (position)
							{

							case R.id.radiochoice1:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{
										final double km;
										try
										{editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											km=Double.parseDouble(value);
											double miles=km/1.6;
											String s1= Double.toString(miles);
											editvewconvresult.setText(s1+"miles");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}
								});
								break;
							case R.id.radiochoice2:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{
										final double miles;
										try
										{editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											miles=Double.parseDouble(value);
											double km=miles*1.6;
											String s1= Double.toString(km);
											editvewconvresult.setText(s1+"km");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;	
							}
						}
					});	
					break;
				case 3:
					editvieshwadptr.setText(conversion[position]);
					editvewconvresult.setText("");
					radioch1.setText("kg->gms");
					radioch2.setText("gms->kg");
					selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

						@Override
						public void onCheckedChanged(RadioGroup arg0, int position)
						{ editvewconvresult.setText("");
							switch (position)
							{

							case R.id.radiochoice1:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{	
										final double kg;
										try
										{editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											kg=Double.parseDouble(value);
											double gms=(kg*1000);
											String s1= Double.toString(gms);
											editvewconvresult.setText(s1+"gms");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;
							case R.id.radiochoice2:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{	editvewconvresult.setText("");
										final double gms;
										try
										{
											editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											gms=Double.parseDouble(value);
											double kg=gms/1000;
											String s1= Double.toString(kg);
											editvewconvresult.setText(s1+"kg");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;	
							}
						}
					});	
					break;
				case 4:
					editvieshwadptr.setText(conversion[position]);
					editvewconvresult.setText("");
					radioch1.setText("rupee->dollar");
					radioch2.setText("dollar->rupee");
					selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

						@Override
						public void onCheckedChanged(RadioGroup arg0, int position)
						{ editvewconvresult.setText("");
							switch (position)
							{

							case R.id.radiochoice1:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{
										final double  rupee;
										try
										{
											editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											rupee=Double.parseDouble(value);
											double dollar=(rupee/64.5);
											String s1= Double.toString(dollar);
											editvewconvresult.setText(s1+"dollar");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;
							case R.id.radiochoice2:
								editvewconvresult.setText("");
								buttonconvert.setOnClickListener(new OnClickListener() {
									@Override
									public void onClick(View arg0) 
									{	
										final double dollar;
										try
										{
											editvewconvresult.setText("");
											value=editviewinsert.getText().toString();
											dollar=Double.parseDouble(value);
											double rupee=dollar*64.5;
											String s1= Double.toString(rupee);
											editvewconvresult.setText(s1+"rupee");
										}
										catch(Exception e)
										{
											e.printStackTrace();
										}
									}

								});
								break;	
							}
						}
					});	
					break;
				}
				buttonclear.setOnClickListener(new OnClickListener()
				{
					
					@Override
					public void onClick(View arg0) {
						editvewconvresult.setText("");
					}
				});
				}
			
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}


