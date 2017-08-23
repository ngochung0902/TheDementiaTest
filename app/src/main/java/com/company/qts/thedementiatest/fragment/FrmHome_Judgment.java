package com.company.qts.thedementiatest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmHome_Judgment extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Switch sw_whatwould1,sw_whatwould2;
    private int whatwould1,whatwould2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_judgment, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_whatwould1 = (Switch) view.findViewById(R.id.sw_whatwould1);
        sw_whatwould2 = (Switch) view.findViewById(R.id.sw_whatwould2);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Abstract_Reasoning fragment9 = new FrmHome_Abstract_Reasoning();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment9);
                fragmentTransaction.commit();

                QTSHelp.setWhatWould1(getActivity(),whatwould1);
                QTSHelp.setWhatWould2(getActivity(),whatwould2);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Abstract_Reasoning fragment9 = new FrmHome_Abstract_Reasoning();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment9);
                fragmentTransaction.commit();

                QTSHelp.setWhatWould1(getActivity(),whatwould1);
                QTSHelp.setWhatWould2(getActivity(),whatwould2);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();
            }
        });

        sw_whatwould1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatWould1();
            }
        });

        sw_whatwould2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatWould2();
            }
        });

        return view;
    }

    private void checkWhatWould1(){
        if (sw_whatwould1.isChecked()==true){
            whatwould1 = 1;
        }else if (sw_whatwould1.isChecked()==false){
            whatwould1 = 0;
        }
    }

    private void checkWhatWould2(){
        if (sw_whatwould2.isChecked()==true){
            whatwould2 = 1;
        }else if (sw_whatwould2.isChecked()==false){
            whatwould2 = 0;
        }
    }

    private void backFrm() {
        if (QTSHelp.getWhatWould1(getActivity()) == 1) {
            sw_whatwould1.setChecked(true);
            whatwould1 = 1;
        }
        if (QTSHelp.getWhatWould1(getActivity()) == 0) {
            sw_whatwould1.setChecked(false);
            whatwould1 = 0;
        }

        if (QTSHelp.getWhatWould2(getActivity()) == 1) {
            sw_whatwould2.setChecked(true);
            whatwould2 = 1;
        }
        if (QTSHelp.getWhatWould2(getActivity()) == 0) {
            sw_whatwould2.setChecked(false);
            whatwould2 = 0;
        }
    }
}
