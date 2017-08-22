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

public class FrmHome4 extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Switch sw_beginningwith,sw_thecat,sw_steveis;
    private int beginningwith,thecat,steveis;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home4, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_steveis = (Switch) view.findViewById(R.id.sw_steveis);
        sw_thecat = (Switch) view.findViewById(R.id.sw_thecat);
        sw_beginningwith = (Switch) view.findViewById(R.id.sw_beginningwith);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome5 fragment5 = new FrmHome5();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();

                QTSHelp.setBeginningWith(getActivity(),beginningwith);
                QTSHelp.setTheCat(getActivity(),thecat);
                QTSHelp.setSteveis(getActivity(),steveis);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome5 fragment5 = new FrmHome5();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();

                QTSHelp.setBeginningWith(getActivity(),beginningwith);
                QTSHelp.setTheCat(getActivity(),thecat);
                QTSHelp.setSteveis(getActivity(),steveis);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome3 fragment3 = new FrmHome3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome3 fragment3 = new FrmHome3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();
            }
        });

        sw_beginningwith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBeginningWith();
            }
        });

        sw_thecat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTheCat();
            }
        });

        sw_steveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSteveis();
            }
        });

        return view;
    }
    private void checkBeginningWith(){
        if (sw_beginningwith.isChecked()==true){
            beginningwith = 1;
        }else if (sw_beginningwith.isChecked()==false){
            beginningwith = 0;
        }
    }
    private void checkTheCat(){
        if (sw_thecat.isChecked()==true){
            thecat = 1;
        }else if (sw_thecat.isChecked()==false){
            thecat = 0;
        }
    }
    private void checkSteveis(){
        if (sw_steveis.isChecked()==true){
            steveis = 1;
        }else if (sw_steveis.isChecked()==false){
            steveis = 0;
        }
    }
    private void backFrm(){
        if (QTSHelp.getBeginningWith(getActivity())==1)
        {
            sw_beginningwith.setChecked(true);
            beginningwith=1;
        }
        if (QTSHelp.getBeginningWith(getActivity())==0)
        {
            sw_beginningwith.setChecked(false);
            beginningwith=0;
        }

        if (QTSHelp.getTheCat(getActivity())==1)
        {
            sw_thecat.setChecked(true);
            thecat=1;
        }
        if (QTSHelp.getTheCat(getActivity())==0)
        {
            sw_thecat.setChecked(false);
            thecat=0;
        }

        if (QTSHelp.getSteveis(getActivity())==1)
        {
            sw_steveis.setChecked(true);
            steveis=1;
        }
        if (QTSHelp.getSteveis(getActivity())==0)
        {
            sw_steveis.setChecked(false);
            steveis=0;
        }
    }
}
