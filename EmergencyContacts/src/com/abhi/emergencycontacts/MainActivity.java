package com.abhi.emergencycontacts;

import java.net.URI;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog.Calls;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.text.method.DialerKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView emergencylist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		emergencylist=(ListView) findViewById(R.id.listView1);
		final String[] phoneNumber={"POLICE","AMBULANCE","FIRE STATION","WOMAN HELPLINE","customer care","Hoysala","Water Supply Complaints","Electricity Breakdown",
				"City Railway Station","Streetlight complaints(South)","Streetlight complaints (East)", " Streetlight complaints(West)","JET AIRWAYS "};
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,phoneNumber);
		emergencylist.setAdapter(adapter);


		//		Ambulance pager	9624 252316
		//		Fire	101
		//		Hoysala	103
		//		Accident	103
		//		,"Streetlight complaints	26566299(South), 2532 5697(East), 2346 8376 (West)
		//		People for Animals	2860 3653, 2860 3989
		//		Water Supply Complaints	2227 5170
		//		,"2225 2035
		//		City Railway Station	2287 0068
		//		JET AIRWAYS :	25586977, 25588354 25266898(AIRPORT)

		emergencylist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// use this permission for call;
				//				<uses-permission android:name="android.permission.CALL_PHONE"/>
				//				<uses-feature android:name="android.hardware.telephony" android:required="false" />
				switch (position) {
				case 0:
					try {
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "100"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 1:
					try {
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "108"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "101"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try {
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1509"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "121"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						//Hoysala	103
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "103"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 6:
					try { //Water Supply Complaints	2227 5170
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2227 5170"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 7:
					try {//Electricity Breakdown
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2225 2035"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 8:
					try {//City Railway Station	2287 0068
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2287 0068"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 9:
					try {//Streetlight complaints	(South)
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "26566299"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 10:
					try {//Streetlight complaints	(East)
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2532 5697"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 11:
					try {  //Streetlight complaints  (West)
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2346 8376"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 12:
					try {//JET AIRWAYS :	(AIRPORT)
						Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "25586977"));
						startActivity(intent);

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			AlertDialog.Builder builder = new Builder(MainActivity.this);
			builder.setTitle("This is alert dialog");
			builder.setMessage("Do You Wnat to exit?");
			builder.setPositiveButton("YES", new OnClickListener() {

				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					finish();					
				}
			});
			builder.setNegativeButton("NO", new OnClickListener() {

				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					arg0.dismiss();	
				}
			});
			AlertDialog  dialog = builder.create();
			dialog.show();
		}
		return false;
	}
}
