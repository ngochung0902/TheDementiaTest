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
import android.widget.Switch;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmHome_Abstract_Reasoning extends Fragment {
    private TextView tv_back;
    private ImageView img_back;
    private Button bt_calculatescore;
    private Switch sw_awatch,sw_aqua;
    private int aqua,awatch;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_abstract_reasoning, container, false);
        bt_calculatescore = (Button) view.findViewById(R.id.bt_calculatescore);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_aqua = (Switch) view.findViewById(R.id.sw_aqua);
        sw_awatch = (Switch) view.findViewById(R.id.sw_awatch);

        backFrm();

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Judgment fragment8 = new FrmHome_Judgment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment8);
                fragmentTransaction.commit();

            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Judgment fragment8 = new FrmHome_Judgment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment8);
                fragmentTransaction.commit();
            }
        });

        bt_calculatescore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Score fragment10 = new FrmHome_Score();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment10);
                fragmentTransaction.commit();

                QTSHelp.setAqua(getActivity(),aqua);
                QTSHelp.setAwatch(getActivity(),awatch);
                int dem=0;
                if (QTSHelp.getWhatday(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getWhatMonth(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getYear(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getWhatSate(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getWhois(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getImGoing(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getNowSay(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.get93(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.get72(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.get86(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.get65(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.get79(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getListento(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getTheCat(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getSteveis(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getAnimals04(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getAnimals59(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getAnimals1015(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getTamHai(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getAdd6(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getTake(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getLamp(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getPhone(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getChair(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getCar(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getHouse(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getWhatWould1(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getWhatWould2(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getAqua(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getAwatch(getActivity())==1)
                    dem = dem +1;

                QTSHelp.setNumberCount(getActivity(),dem+"");
            }
        });

        sw_aqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAqua();
            }
        });

        sw_awatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAwatch();
            }
        });

        return view;
    }

    private void checkAqua(){
        if (sw_aqua.isChecked()==true){
            aqua = 1;
        }else if (sw_aqua.isChecked()==false){
            aqua = 0;
        }
    }

    private void checkAwatch(){
        if (sw_awatch.isChecked()==true){
            awatch = 1;
        }else if (sw_awatch.isChecked()==false){
            awatch = 0;
        }
    }

    private void backFrm() {
        if (QTSHelp.getAqua(getActivity()) == 1) {
            sw_aqua.setChecked(true);
            aqua = 1;
        }
        if (QTSHelp.getAqua(getActivity()) == 0) {
            sw_aqua.setChecked(false);
            aqua = 0;
        }

        if (QTSHelp.getAwatch(getActivity()) == 1) {
            sw_awatch.setChecked(true);
            awatch = 1;
        }
        if (QTSHelp.getAwatch(getActivity()) == 0) {
            sw_awatch.setChecked(false);
            awatch = 0;
        }
    }

}
