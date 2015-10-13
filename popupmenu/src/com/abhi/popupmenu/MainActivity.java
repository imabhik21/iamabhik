package com.abhi.popupmenu;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends Activity {
	Button popupbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		popupbtn=(Button) findViewById(R.id.button1);
		popupbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				PopupMenu popupmenu = new PopupMenu(MainActivity.this, popupbtn);
				MenuInflater inflate= getMenuInflater();
				inflate.inflate(R.menu.popup, popupmenu.getMenu());
				popupmenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					
					@Override
					public boolean onMenuItemClick(MenuItem item) 
					{
						
						if (item.getItemId()==R.id.item1)
						{
							Toast.makeText(MainActivity.this, "title", Toast.LENGTH_SHORT).show();
						}
						
						return false;
					}
				});
				popupmenu.show();


			}
		});
	}

}


