package com.example.animationtext.poem;

import com.example.animationtext.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{
	int raw[];
	Context context;
	String poemTitle[];
	
	public MyAdapter(Context context,String[] strTitle){
		this.context = context;
		this.poemTitle=strTitle;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return poemTitle.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater=LayoutInflater.from(context);
		View view=inflater.inflate(R.layout.poem_item,parent,false);
		TextView title=(TextView) view.findViewById(R.id.txt_item);
		title.setText(poemTitle[position]);
		return view;
	}

}
