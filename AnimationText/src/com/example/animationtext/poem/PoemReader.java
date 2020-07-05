package com.example.animationtext.poem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;

import com.example.animationtext.R;
import com.example.animationtext.Typewriter;

public class PoemReader {
	public Typewriter mywriter;
	int readeFile;
	Context context;
	
	public PoemReader(Context context, int file)
	{
		
		this.readeFile = file;
		this.context = context;
		mywriter = new Typewriter(context);
		String data = readTextFile(context, readeFile);
		mywriter.animateText(data);
		mywriter.setCharacterDelay(50);
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
}
