package com.firstapp.facebook_login_main;



import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity_fb extends Activity {
	String stUsername="abhishek";
	String stPassword="1234567890";

	String entUsername;
	String entPassword;
	Button loginbutton;
	EditText usernameEdittext,passwordEdittext;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_fb);
        /* getting the id or reference for the view from r.java class*/
        loginbutton = (Button) findViewById(R.id.Log_in);
        usernameEdittext= (EditText) findViewById(R.id.textUsername);
        passwordEdittext= (EditText) findViewById(R.id.textPassword);
    }
    /* method to handle the click of login button the name of the method is 
     * defined in activity_main.xml field inside the button tag with the attributes andriod:onclick = testusername */
        public void testusername(View v1)
        {
        	entUsername = usernameEdittext.getText().toString();
        	entPassword = passwordEdittext.getText().toString();
        	if (stUsername.equalsIgnoreCase(entUsername)&&stPassword.equalsIgnoreCase(entPassword))
        	{
        		Log.d("[Debug]", "login successful");
        	}
        	else
        	{
        		Log.d("[Debug]", "incorrect username or password");
        	}
        }

    
    }
    

