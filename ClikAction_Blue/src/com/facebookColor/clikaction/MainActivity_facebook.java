package com.facebookColor.clikaction;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_facebook extends Activity {
	
Button buttonpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_facebook);
        viewfbpagecolor();
        
    }

    public void viewfbpagecolor()
    {
    	// get the button id
    	Button presshere = (Button) findViewById(R.id.button1);
    	Button buttonpress= (Button) findViewById(R.id.buttonPress);
    	presshere.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "Button pressed", Toast.LENGTH_SHORT).show();
			}
		}); 
    }
    
    
}
