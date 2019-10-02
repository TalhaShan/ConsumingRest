package com.example.consumingrest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import pojos.Places;

public class MyAdapter extends BaseAdapter {

    MainActivity mactivity;
    Places places_;
    public MyAdapter(MainActivity mainActivity, Places places_) {

        this.mactivity = mainActivity;
        this.places_ =places_;
    }

    @Override
    public int getCount() {
        return places_.getList().size() ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mactivity);
        View view = inflater.inflate(R.layout.idiview,null);

        TextView tv1=  view.findViewById(R.id.tvname);
        TextView tv2 = view.findViewById(R.id.tvVicinity);

        tv1.setText(places_.getList().get(position).getName());
        tv2.setText(places_.getList().get(position).getVinicity());

        return view;
    }
}
