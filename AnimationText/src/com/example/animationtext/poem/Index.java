package com.example.animationtext.poem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.animationtext.R;


public class Index extends Activity {
	//private InterstitialAd interstitial;

	// Array of String storing poem title
	String[] poemTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);

		poemTitle = getResources().getStringArray(R.array.poem_title);

		Drawable layout_index = findViewById(R.id.layout_index).getBackground();
		layout_index.setAlpha(200);

		// Each row in list have poem title and image
		List<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>();

		for (int i = 0; i < 30; i ++){
			HashMap<String,String> hashMap = new HashMap<String,String>();
			hashMap.put("txt_item", " " + poemTitle[i]);
			aList.add(hashMap);
		}

		// Keys used in Hashmap
		String[] from = {"txt_item"};

		// Ids of views in ListView layout
		int[] to = {R.id.txt_item};

		// Instantiating an adapter to store each item
		SimpleAdapter myAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.poem_item, from, to);

		// Getting a reference to ListView of activity_index.xml layout
		ListView myList = (ListView) findViewById(R.id.lv_index);

		// Setting an adapter to ListView
		myList.setAdapter(myAdapter);
		
		myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if(position == 0){
					Intent int0 = new Intent(getApplicationContext(), Anath.class);
					startActivity(int0);
				}
				
			}
			
		}) ;

		/*myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if(position == 0){
					Intent int0 = new Intent(getApplicationContext(), PiyaKaPyar.class);
					startActivity(int0);
				} else if(position == 1){
					Intent int1 = new Intent(getApplicationContext(), Jeevan.class);
					startActivity(int1);
				} else if(position == 2){
					Intent int2 = new Intent(getApplicationContext(), Pyar.class);
					startActivity(int2);
				} else if(position == 3){
					Intent int3 = new Intent(getApplicationContext(), KachchiKali.class);
					startActivity(int3);
				} else if(position == 4){
					Intent int4 = new Intent(getApplicationContext(), PremKiGali.class);
					startActivity(int4);
				} else if(position == 5){
					Intent int5 = new Intent(getApplicationContext(), Rasta.class);
					startActivity(int5);
				} else if(position == 6){
					Intent int6 = new Intent(getApplicationContext(), PyarKaMausam.class);
					startActivity(int6);
				} else if(position == 7){
					Intent int7 = new Intent(getApplicationContext(), Yadein.class);
					startActivity(int7);
				} else if(position == 8){
					Intent int8 = new Intent(getApplicationContext(), TujheMeriKasam.class);
					startActivity(int8);
				} else if(position == 9){
					Intent int9 = new Intent(getApplicationContext(), DilKiDhadkan.class);
					startActivity(int9);
				} else if(position == 10){
					Intent int10 = new Intent(getApplicationContext(), Moh.class);
					startActivity(int10);
				} else if(position == 11){
					Intent int11 = new Intent(getApplicationContext(), DharmAurNaitikta.class);
					startActivity(int11);
				} else if(position == 12){
					Intent int12 = new Intent(getApplicationContext(), Neta.class);
					startActivity(int12);
				} else if(position == 13){
					Intent int13 = new Intent(getApplicationContext(), PapaKiKalam.class);
					startActivity(int13);
				} else if(position == 14){
					Intent int14 = new Intent(getApplicationContext(), NayeArth.class);
					startActivity(int14);
				} else if(position == 15){
					Intent int15 = new Intent(getApplicationContext(), PurushAurNari.class);
					startActivity(int15);
				} else if(position == 16){
					Intent int16 = new Intent(getApplicationContext(), PyarSeJeLoJara.class);
					startActivity(int16);
				} else if(position == 17){
					Intent int17 = new Intent(getApplicationContext(), Prakrati.class);
					startActivity(int17);
				} else if(position == 18){
					Intent int18 = new Intent(getApplicationContext(), PriyatamKiYaadMein.class);
					startActivity(int18);
				} else if(position == 19){
					Intent int19 = new Intent(getApplicationContext(), BaadhKaSailab.class);
					startActivity(int19);
				} else if(position == 20){
					Intent int20 = new Intent(getApplicationContext(), ManavtaKaSwagatKaro.class);
					startActivity(int20);
				} else if(position == 21){
					Intent int21 = new Intent(getApplicationContext(), MujhkoKaroBaichene.class);
					startActivity(int21);
				} else if(position == 22){
					Intent int22 = new Intent(getApplicationContext(), MeraJeevan.class);
					startActivity(int22);
				} else if(position == 23){
					Intent int23 = new Intent(getApplicationContext(), YehHumNahiJante.class);
					startActivity(int23);
				} else if(position == 24){
					Intent int24 = new Intent(getApplicationContext(), WohMazdoorHai.class);
					startActivity(int24);
				} else if(position == 25){
					Intent int25 = new Intent(getApplicationContext(), VishdharManushya.class);
					startActivity(int25);
				} else if(position == 26){
					Intent int26 = new Intent(getApplicationContext(), SarkarBanamKisan.class);
					startActivity(int26);
				} else if(position == 27){
					Intent int27 = new Intent(getApplicationContext(), HumAzadHain.class);
					startActivity(int27);
				} else if(position == 28){
					Intent int28 = new Intent(getApplicationContext(), AmbedkarKiKalam.class);
					startActivity(int28);
				} else if(position == 29){
					Intent int29 = new Intent(getApplicationContext(), NanhiPari.class);
					startActivity(int29);
				} 

			}
		});*/

		/*// Prepare the Interstitial Ad
		interstitial = new InterstitialAd(Index.this);
		// Insert the Ad Unit ID
		interstitial.setAdUnitId("ca-app-pub-8158315839737160/8584495333");

		//Locate the Banner Ad in activity_index.xml
		AdView adView = (AdView) this.findViewById(R.id.adView);

		// Request for Ads
		AdRequest adRequest = new AdRequest.Builder()
		// Add a test device to show Test Ads
		// Comment below two lines to show the real ads across all devices
		.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
     	  .addTestDevice("C7F0291F92C207DC2EF481EC4BF9F984")
     				.build();

				// Load ads into Banner Ads
				adView.loadAd(adRequest);

				// Load ads into Interstitial Ads
				interstitial.loadAd(adRequest);

				// Prepare an Interstitial Ad Listener
				interstitial.setAdListener(new AdListener() {
					public void onAdLoaded() {
						// Call displayInterstitial() function
						displayInterstitial();
					}
				});
	}
	public void displayInterstitial() {
		// If Ads are loaded, show Interstitial else show nothing.
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}*/
	}
}
