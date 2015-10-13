package com.abhi.actionmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {
private static final Menu menu = null;
EditText editmessage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editmessage=(EditText) findViewById(R.id.editTextmsg);
		getMenuInflater().inflate(R.menu.main,menu);

	}

	
	}
	



