package thedementiatest.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.thedementiatest.R;
import thedementiatest.activity.ActList_ShowDetial;
import thedementiatest.adapter.AdapterUser;
import thedementiatest.database.SQLiteSource;
import thedementiatest.helper.QTSConstrains;
import thedementiatest.helper.QTSHelp;
import thedementiatest.object.User;

import java.util.ArrayList;

public class FrmList extends Fragment {
    private ListView lv_list;
    private TextView tv_noitem,tv_list;
    private SQLiteSource datasource;
    private ArrayList<User> arr = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_list, container, false);
        lv_list = (ListView) view.findViewById(R.id.lv_list);
        tv_noitem = (TextView) view.findViewById(R.id.tv_noitem);
        tv_list = (TextView) view.findViewById(R.id.tv_list);
        datasource = new SQLiteSource(getActivity());
        QTSHelp.setFontTV(getActivity(),tv_list, QTSConstrains.FONT_LATO_BOLD);
        datasource.open();

        lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ActList_ShowDetial.class);
                intent.putExtra("id", arr.get(position).id);
                intent.putExtra("name", arr.get(position).name);
                intent.putExtra("person", arr.get(position).person);
                intent.putExtra("dateofbirth", arr.get(position).dateofbirth);
                intent.putExtra("levelofeducation", arr.get(position).levelofeducation);
                intent.putExtra("sex", arr.get(position).sex);
                intent.putExtra("ethnicity", arr.get(position).ethnicity);
                intent.putExtra("age", arr.get(position).age);
                intent.putExtra("count", arr.get(position).count);
                intent.putExtra("textcount", arr.get(position).textcount);
                intent.putExtra("work", arr.get(position).work);
                Log.e("database",arr.get(position).id +"");
                Log.e("database",arr.get(position).name+"");
                Log.e("database",arr.get(position).person+"");
                Log.e("database",arr.get(position).dateofbirth+"");
                Log.e("database",arr.get(position).levelofeducation+"");
                Log.e("database",arr.get(position).sex+"");
                Log.e("database",arr.get(position).ethnicity+"");
                Log.e("database",arr.get(position).age+"");
                Log.e("database",arr.get(position).count+"");
                Log.e("database",arr.get(position).textcount+"");
                Log.e("database",arr.get(position).work+"");
                getActivity().startActivity(intent);
            }
        });

        lv_list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, final long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("The Dementia Test");
                builder.setMessage("Are you sure you want to delete?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        datasource.deleteNote(arr.get(position).id);
                        viewAllNotes();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
                return true;
            }
        });

        return view;
    }
    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            // update UI - display notes on listview
            if(arr != null && arr.size() > 0)
            {
                tv_noitem.setVisibility(View.GONE);
                lv_list.setVisibility(View.VISIBLE);
                // view all note to listview
                AdapterUser adapter = new AdapterUser(getActivity(),arr);
                lv_list.setAdapter(adapter);

            }else {
                lv_list.setVisibility(View.GONE);
                tv_noitem.setVisibility(View.VISIBLE);
            }
        }
    };

    private void viewAllNotes()
    {
        // create new thread to get all notes in background task
        new Thread(new Runnable() {
            @Override
            public void run() {
                // read all notes form DB
                arr = datasource.getAllContacts();
                handler.sendEmptyMessage(0);
            }
        }).start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //datasource.close();
    }

    @Override
    public void onResume() {
        super.onResume();
        // read data from DB
        viewAllNotes();
    }
}
