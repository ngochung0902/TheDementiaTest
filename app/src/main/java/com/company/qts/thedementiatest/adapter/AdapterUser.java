package com.company.qts.thedementiatest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.object.User;

import java.util.ArrayList;

/**
 * Created by MyPC on 23/08/2017.
 */
public class AdapterUser extends BaseAdapter {
    private Context context;
    private ArrayList<User> arr;

    public AdapterUser(Context context, ArrayList<User> arr) {
        this.context = context;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long)arr.get(position).id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View rowView = (View)inflater.inflate(R.layout.line_lv, parent, false);

        TextView tv_name = (TextView) rowView.findViewById(R.id.tv_name);

        User model = arr.get(position);
        tv_name.setText(model.getName());

        return rowView;
    }
}
