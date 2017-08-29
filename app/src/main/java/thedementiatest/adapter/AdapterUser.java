package thedementiatest.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.thedementiatest.R;
import thedementiatest.helper.QTSConstrains;
import thedementiatest.object.User;

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
        ImageView img = (ImageView) rowView.findViewById(R.id.img);
        int color = Color.parseColor("#A8A8A8"); //The color u want
        img.setColorFilter(color);
        Typeface customFontBold= Typeface.createFromAsset(context.getAssets(), QTSConstrains.FONT_LATO_REGULAR);
        tv_name.setTypeface(customFontBold);
        User model = arr.get(position);
        tv_name.setText(model.getName());

        return rowView;
    }
}
