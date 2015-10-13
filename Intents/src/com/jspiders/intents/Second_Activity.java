package com.jspiders.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second_Activity extends Activity {

	TextView displaytextview;
	EditText textsecondview;
	Button buttonback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_);
		
		displaytextview = (TextView) findViewById(R.id.textViewMessage);
		buttonback=(Button) findViewById(R.id.buttonback);
		textsecondview = (EditText) findViewById(R.id.editTextviewSecond);
		buttonback.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String message =textsecondview.getText().toString();
				Intent intent = new Intent(Second_Activity.this, MainActivity.class)	;	
				intent.putExtra("Key2",message);
				setResult(RESULT_OK, intent);
				startActivity(intent);
			}
		});
		Intent i1 = getIntent();
		Bundle b1 = i1.getExtras();
		String recmessage = b1.get("Key1").toString();
		displaytextview.setText(recmessage);
//		//i1.getStringExtra("key1");
		
		
		
	}


}
