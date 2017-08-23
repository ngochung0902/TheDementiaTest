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

public class FrmHome_Calculation extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Switch sw_tamhai,sw_add6,sw_take;
    private int tamhai,add6,take;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_calculation, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_tamhai = (Switch) view.findViewById(R.id.sw_tamhai);
        sw_add6 = (Switch) view.findViewById(R.id.sw_add6);
        sw_take = (Switch) view.findViewById(R.id.sw_take);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();

                QTSHelp.setTamHai(getActivity(),tamhai);
                QTSHelp.setAdd6(getActivity(),add6);
                QTSHelp.setTake(getActivity(),take);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();
            }
        });

        sw_tamhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTamHai();
            }
        });

        sw_add6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAdd6();
            }
        });

        sw_take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTake();
            }
        });

        return view;
    }

    private void checkTamHai(){
        if (sw_tamhai.isChecked()==true){
            tamhai = 1;
        }else if (sw_tamhai.isChecked()==false){
            tamhai = 0;
        }
    }

    private void checkAdd6(){
        if (sw_add6.isChecked()==true){
            add6 = 1;
        }else if (sw_add6.isChecked()==false){
            add6 = 0;
        }
    }

    private void checkTake(){
        if (sw_take.isChecked()==true){
            take = 1;
        }else if (sw_take.isChecked()==false){
            take = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getTamHai(getActivity())==1)
        {
            sw_tamhai.setChecked(true);
            tamhai=1;
        }
        if (QTSHelp.getTamHai(getActivity())==0)
        {
            sw_tamhai.setChecked(false);
            tamhai=0;
        }

        if (QTSHelp.getAdd6(getActivity())==1)
        {
            sw_add6.setChecked(true);
            add6=1;
        }
        if (QTSHelp.getAdd6(getActivity())==0)
        {
            sw_add6.setChecked(false);
            add6=0;
        }

        if (QTSHelp.getTake(getActivity())==1)
        {
            sw_take.setChecked(true);
            take=1;
        }
        if (QTSHelp.getTake(getActivity())==0)
        {
            sw_take.setChecked(false);
            take=0;
        }
    }
}
