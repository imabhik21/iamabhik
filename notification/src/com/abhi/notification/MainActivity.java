package com.abhi.notification;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
Button buttonnotify;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonnotify=(Button) findViewById(R.id.button1);
		buttonnotify.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
				builder.setSmallIcon(R.drawable.ic_launcher);
				 builder.setContentTitle("my notify");
				 builder.setContentText("1 new text");
				
				 
				Notification notify= builder.build();
	
				NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				
				Intent intent =new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+"9033492119"));
				//pending intent;
				PendingIntent pendingintent= PendingIntent.getActivity(MainActivity.this, 1, intent, 1);
			
				 builder.addAction(R.drawable.ic_launcher, "call", pendingintent);
				nm.notify(1,notify);
			}
		});
	}



}
