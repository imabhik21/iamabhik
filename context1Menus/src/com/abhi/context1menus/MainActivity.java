package com.abhi.context1menus;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView contextlistview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		contextlistview=(ListView) findViewById(R.id.listvieconttext);
		final String[] phones={"HTC","MOTO","MI","LG","SONY","GOOGLE"};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,phones);
		contextlistview.setAdapter(adapter);


		//u need to register if u dont it will nv apper;
		registerForContextMenu(contextlistview);
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
//set the header title
		menu.setHeaderTitle("choose ur option");
		MenuInflater infilater=getMenuInflater();
infilater.inflate(R.menu.context, menu);
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	//	return super.onContextItemSelected(item);
		
		if(item.getItemId()==R.id.item1)
		{
			Toast.makeText(MainActivity.this, "call", Toast.LENGTH_SHORT).show();
		}
		return false;
	}
}


