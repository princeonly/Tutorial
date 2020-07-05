package com.example.animationtext.poem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.example.animationtext.R;
import com.example.animationtext.Typewriter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Anath extends Activity{
	
	int raw[] = new int[]{R.raw.anath,R.raw.ambedkar_ki_kalam,R.raw.aise_sanskar_do,R.raw.ambedkar_ki_kalam,R.raw.anath,};
	MyAdapter adapter;
    PoemReader poemReader;
    ListView listview;
    String poemTitle[];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);
		listview=(ListView) findViewById(R.id.lv_index);
		poemTitle = getResources().getStringArray(R.array.poem_title);
		adapter=new MyAdapter(getApplicationContext(), poemTitle);
		listview.setAdapter(adapter);
		
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				switch (position) {
				case 0:
					poemReader=new PoemReader(getApplicationContext(), raw[position]);
					break;
				case 1:
					poemReader=new PoemReader(getApplicationContext(), raw[position]);
					break;
				case 2:
					poemReader=new PoemReader(getApplicationContext(), raw[position]);
					break;
				case 3:
					poemReader=new PoemReader(getApplicationContext(), raw[position]);
					break;
				case 4:
					poemReader=new PoemReader(getApplicationContext(), raw[position]);
					break;
				}
				
			}
		});
		
		
		
		
		//poemReader=new PoemReader(getApplicationContext(), raw);
		/*Typewriter writer = (Typewriter)findViewById(R.id.typewriter);
		String data = readTextFile(this, R.raw.anath);
		//String data = readTextFile(this, raw);
        writer.animateText(data);
        writer.setCharacterDelay(50);
        
	}
	
	public static String readTextFile(Context ctx, int resId)
    {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader bufferedreader = new BufferedReader(inputreader);
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try 
        {
            while (( line = bufferedreader.readLine()) != null) 
            {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
        } 
        catch (IOException e) 
        {
            return null;
        }
        return stringBuilder.toString();
    }*/

	}
}
