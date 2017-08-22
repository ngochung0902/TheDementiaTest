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

public class FrmHome1 extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Switch sw_whatday,sw_whatmonth,sw_year,sw_whatstate,sw_whois;
    private int whatday,whatmonth,year,whatsate,whois;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home1, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);

        sw_whatday = (Switch) view.findViewById(R.id.sw_whatday);
        sw_whatmonth = (Switch) view.findViewById(R.id.sw_whatmonth);
        sw_year = (Switch) view.findViewById(R.id.sw_year);
        sw_whatstate = (Switch) view.findViewById(R.id.sw_whatstate);
        sw_whois = (Switch) view.findViewById(R.id.sw_whois);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome2 fragment2 = new FrmHome2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();

                QTSHelp.setWhatday(getActivity(),whatday);
                QTSHelp.setWhatMonth(getActivity(),whatmonth);
                QTSHelp.setYear(getActivity(),year);
                QTSHelp.setWhatSate(getActivity(),whatsate);
                QTSHelp.setWhois(getActivity(),whois);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome2 fragment2 = new FrmHome2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();

                QTSHelp.setWhatday(getActivity(),whatday);
                QTSHelp.setWhatMonth(getActivity(),whatmonth);
                QTSHelp.setYear(getActivity(),year);
                QTSHelp.setWhatSate(getActivity(),whatsate);
                QTSHelp.setWhois(getActivity(),whois);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome fragment = new FrmHome();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome fragment = new FrmHome();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment);
                fragmentTransaction.commit();
            }
        });

        sw_whatday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatDay();
            }
        });

        sw_whatmonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatMonth();
            }
        });

        sw_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkYear();
            }
        });

        sw_whatstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatSate();
            }
        });

        sw_whois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhois();
            }
        });
        return view;
    }

    private void checkWhatDay(){
        if (sw_whatday.isChecked()==true){
            whatday = 1;
        }else if (sw_whatday.isChecked()==false){
            whatday = 0;
        }
    }

    private void checkWhatMonth(){
        if (sw_whatmonth.isChecked()==true){
            whatmonth = 1;
        }else if (sw_whatmonth.isChecked()==false){
            whatmonth = 0;
        }
    }

    private void checkYear(){
        if (sw_year.isChecked()==true){
            year = 1;
        }else if (sw_year.isChecked()==false){
            year = 0;
        }
    }

    private void checkWhatSate(){
        if (sw_whatstate.isChecked()==true){
            whatsate = 1;
        }else if (sw_whatstate.isChecked()==false){
            whatsate = 0;
        }
    }

    private void checkWhois(){
        if (sw_whois.isChecked()==true){
            whois = 1;
        }else if (sw_whois.isChecked()==false){
            whois = 0;
        }
    }

    private void backFrm(){

        if (QTSHelp.getWhatday(getActivity())==1)
        {
            sw_whatday.setChecked(true);
            whatday=1;
        }
        if (QTSHelp.getWhatday(getActivity())==0)
        {
            sw_whatday.setChecked(false);
            whatday=0;
        }

        if (QTSHelp.getWhatMonth(getActivity())==1)
        {
            sw_whatmonth.setChecked(true);
            whatmonth=1;
        }
        if (QTSHelp.getWhatMonth(getActivity())==0)
        {
            sw_whatmonth.setChecked(false);
            whatmonth=0;
        }

        if (QTSHelp.getYear(getActivity())==1)
        {
            sw_year.setChecked(true);
            year=1;
        }
        if (QTSHelp.getYear(getActivity())==0)
        {
            sw_year.setChecked(false);
            year=0;
        }

        if (QTSHelp.getWhatSate(getActivity())==1)
        {
            sw_whatstate.setChecked(true);
            whatsate=1;
        }
        if (QTSHelp.getWhatSate(getActivity())==0)
        {
            sw_whatstate.setChecked(false);
            whatsate=0;
        }

        if (QTSHelp.getWhois(getActivity())==1)
        {
            sw_whois.setChecked(true);
            whois=1;
        }
        if (QTSHelp.getWhois(getActivity())==0)
        {
            sw_whois.setChecked(false);
            whois=0;
        }
    }
}
