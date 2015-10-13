package com.seconapp.linkedin;



import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	String stUsername="abhishek";
	String stPassword="1234567890";

	String entUsername;
	String entPassword;
	Button loginbutton;
	EditText usernameEdittext,passwordEdittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton = (Button) findViewById(R.id.Login);
        usernameEdittext= (EditText) findViewById(R.id.Textusername);
        passwordEdittext= (EditText) findViewById(R.id.TextPassword);
    }
    public void testusername(View v1)
    {
    	entUsername = usernameEdittext.getText().toString();
    	entPassword = passwordEdittext.getText().toString();
    	if (stUsername.equalsIgnoreCase(entUsername)&&stPassword.equalsIgnoreCase(entPassword))
    	{
    		//Log.d("[Debug]", "login successful");
Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show();
    	}
    	else
    	{
    		//Log.d("[Debug]", "incorrect username or password");
    		Toast.makeText(this, "incorrect username or password", Toast.LENGTH_SHORT).show();
    	}


    }
}
