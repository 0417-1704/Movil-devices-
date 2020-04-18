package com.eni.android.customadapter;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class CustomAdapterActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ArrayList<AndroidVersion> androidList = new ArrayList<AndroidVersion>();
		
		initList(androidList);

		AndroidAdapter adapter = new AndroidAdapter(this, R.layout.list_layout, androidList);
		final ListView list = (ListView) findViewById(R.id.myList);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View v, int position,
					long id) {
				AndroidVersion selectedItem = (AndroidVersion) adapter.getItemAtPosition(position);
				Log.v("CustomAdapter", "Elemento seleccionado: " + selectedItem.getVersionName());
			}
		});
	}

	private void initList(ArrayList<AndroidVersion> androidList) {
		AndroidVersion version = new AndroidVersion();
		version.setVersionName("Cupcake");
		version.setVersionNumber("1.5");
		androidList.add(version);

		AndroidVersion versionDonut = new AndroidVersion();
		versionDonut.setVersionName("Donut");
		versionDonut.setVersionNumber("1.6");
		androidList.add(versionDonut);
		
		AndroidVersion versionEclair = new AndroidVersion();
		versionEclair.setVersionName("Eclair");
		versionEclair.setVersionNumber("2.0.x");
		androidList.add(versionEclair);
		
		AndroidVersion versionFroyo = new AndroidVersion();
		versionFroyo.setVersionName("Froyo");
		versionFroyo.setVersionNumber("2.2.x");
		androidList.add(versionFroyo);
		
		AndroidVersion versionGinger = new AndroidVersion();
		versionGinger.setVersionName("Gingerbread");
		versionGinger.setVersionNumber("2.3.x");
		androidList.add(versionGinger);

		AndroidVersion versionHoneycomb = new AndroidVersion();
		versionHoneycomb.setVersionName("Honeycomb");
		versionHoneycomb.setVersionNumber("3.x");
		androidList.add(versionHoneycomb);
		
		AndroidVersion versionIcs = new AndroidVersion();
		versionIcs.setVersionName("Ice Cream Sandwich");
		versionIcs.setVersionNumber("4.0.x");
		androidList.add(versionIcs);

        AndroidVersion versionJellyBean = new AndroidVersion();
        versionJellyBean.setVersionName("Jelly Bean");
        versionJellyBean.setVersionNumber("4.1.x");
        androidList.add(versionJellyBean);

        AndroidVersion versionKitKat = new AndroidVersion();
        versionKitKat.setVersionName("KitKat");
        versionKitKat.setVersionNumber("4.4.x");
        androidList.add(versionKitKat);

        AndroidVersion versionLollipop = new AndroidVersion();
        versionLollipop.setVersionName("Lollipop");
        versionLollipop.setVersionNumber("5.x");
        androidList.add(versionLollipop);
	}
}