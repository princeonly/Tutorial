package com.example.animationtext;

import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Test extends ActionBarActivity {
	
	/*private CharSequence mText;
    private int mIndex;
    private long mDelay = 500; 
    TextView tv;*/
	
	View display;
	int index;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ScrollView sv = new ScrollView(this);
	    sv.setLayoutParams(new LinearLayout.LayoutParams((int)display.getWidth()/2, (int)((display.getHeight()/4))*3));
	    
	    //sv.setPadding(0, px2DP(10), px2DP(10), px2DP(10));
	    sv.setPadding(0, 10, 10, 10);

	    final CharSequence text = getResources().getText(R.string.hello_world);

	    final TextView content = new TextView(this);
	    content.setBackgroundColor(getResources().getColor(Color.BLACK));
	    content.setTextColor(getResources().getColor(Color.WHITE));
	    content.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
	    content.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));

	    sv.addView(content);

	    content.postDelayed(new Runnable(){
	        @Override
	        public void run() {
	            content.append(text.subSequence(0, index++));
	            sv.fullScroll(View.FOCUS_DOWN);     
	        }

	    },70);
}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}