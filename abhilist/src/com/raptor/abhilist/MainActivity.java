package com.raptor.abhilist;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView listphone,listnames;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listphone= (ListView) findViewById(R.id.listViewphone12);
		listnames=(ListView) findViewById(R.id.listView134);
		final String[] phones={"GIONEE","SAMSUNG","NOKIA","MI","HTC","micromax","LAVA","ANDROID-ONE","MOTOG","NEXUS","APPLE","IOS"};
		final String[] names={"ABHI","ANKUR","ANKIT","NISHU","BHAVAN","KUSUM","SINDHU","SHIVA","DARSHAN","AJAY","JYOTI",
				"POOJA","SHRUTI","VYOMA","CHANDANI"};
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, phones);
		listphone.setAdapter(adapter);
		listphone.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "you selected"+phones[position], Toast.LENGTH_SHORT).show();

			}
		});
		ArrayAdapter<String>adapter1=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, names);
		listnames.setAdapter(adapter1);
		listnames.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "you selected"+names[position], Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
