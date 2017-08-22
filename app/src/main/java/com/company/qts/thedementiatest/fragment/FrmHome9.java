package com.company.qts.thedementiatest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;

public class FrmHome9 extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Button bt_calculatescore;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home9, container, false);
        bt_calculatescore = (Button) view.findViewById(R.id.bt_calculatescore);
        bt_calculatescore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome10 fragment10 = new FrmHome10();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment10);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
