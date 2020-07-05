package com.example.animationtext;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Typewriter writer = new Typewriter(this);
		Typewriter writer = (Typewriter)findViewById(R.id.typewriter);
		
		/*Show the text in horizontally center*/
		//writer.setGravity(Gravity.CENTER_HORIZONTAL);
		
//TextView textView = (TextView)findViewById(R.id.textview_data);
        
        String data = readTextFile(this, R.raw.anath);
        writer.animateText(data);
        //textView.setText(data);
        //Typeface hindiHeader = Typeface.createFromAsset(getAssets(), "fonts/DroidHindi.ttf");
        //data.setTypeface(hindiHeader);
		//setContentView(writer);

		//Add a character every 150ms
		writer.setCharacterDelay(50);
		//writer.animateText("Simple String"); //Simple example to get the text
		
		/* One method to get the characters from String*/ 
		//writer.animateText(getString(R.string.poem_one)); //get the text from string.xml
		
		/* One more method to retrieve the character from String*/
		//CharSequence  cs = getText(R.string.mujhkoKareBaichene);
		//writer.animateText(cs);

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
    }
	
	
	/*public class Typewriter extends TextView {

		private CharSequence mText;
		private int mIndex;
		private long mDelay = 500; //Default 500ms delay


		public Typewriter(Context context) {
			super(context);
		}

		public Typewriter(Context context, AttributeSet attrs) {
			super(context, attrs);
		}

		private Handler mHandler = new Handler();
		private Runnable characterAdder = new Runnable() {
			@Override
			public void run() {
				setText(mText.subSequence(0, mIndex++));
				if(mIndex <= mText.length()) {
					mHandler.postDelayed(characterAdder, mDelay);
				}
			}
		};

		public void animateText(CharSequence text) {
			mText = text;
			mIndex = 0;

			setText("");
			mHandler.removeCallbacks(characterAdder);
			mHandler.postDelayed(characterAdder, mDelay);
		}

		public void setCharacterDelay(long millis) {
			mDelay = millis;
		}
	}*/
}
