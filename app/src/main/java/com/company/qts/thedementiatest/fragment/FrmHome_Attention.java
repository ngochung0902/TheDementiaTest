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

public class FrmHome_Attention extends Fragment {
    private TextView tv_next,tv_back;
    private ImageView img_next,img_back;
    private Switch sw_imgoing,sw_nowsay,sw_93,sw_72,sw_86,sw_65,sw_79;
    private int imgoing,nowsay,chinba,bayhai,tamsau,saulam,baychin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_attention, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_imgoing = (Switch) view.findViewById(R.id.sw_imgoing);
        sw_nowsay = (Switch) view.findViewById(R.id.sw_nowsay);
        sw_93 = (Switch) view.findViewById(R.id.sw_93);
        sw_72 = (Switch) view.findViewById(R.id.sw_72);
        sw_86 = (Switch) view.findViewById(R.id.sw_86);
        sw_65 = (Switch) view.findViewById(R.id.sw_65);
        sw_79 = (Switch) view.findViewById(R.id.sw_79);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();

                QTSHelp.setImGoing(getActivity(),imgoing);
                QTSHelp.setNowSay(getActivity(),nowsay);
                QTSHelp.set93(getActivity(),chinba);
                QTSHelp.set72(getActivity(),bayhai);
                QTSHelp.set86(getActivity(),tamsau);
                QTSHelp.set65(getActivity(),saulam);
                QTSHelp.set79(getActivity(),baychin);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();

                QTSHelp.setImGoing(getActivity(),imgoing);
                QTSHelp.setNowSay(getActivity(),nowsay);
                QTSHelp.set93(getActivity(),chinba);
                QTSHelp.set72(getActivity(),bayhai);
                QTSHelp.set86(getActivity(),tamsau);
                QTSHelp.set65(getActivity(),saulam);
                QTSHelp.set79(getActivity(),baychin);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment1);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment1);
                fragmentTransaction.commit();
            }
        });

        sw_imgoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkImGoing();
            }
        });

        sw_nowsay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNowSay();
            }
        });

        sw_93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkChinBa();
            }
        });

        sw_72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBayHai();
            }
        });

        sw_86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTamSau();
            }
        });

        sw_65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSauLam();
            }
        });

        sw_79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBayChin();
            }
        });

        return view;
    }

    private void checkImGoing(){
        if (sw_imgoing.isChecked()==true){
            imgoing = 1;
        }else if (sw_imgoing.isChecked()==false){
            imgoing = 0;
        }
    }

    private void checkNowSay(){
        if (sw_nowsay.isChecked()==true){
            nowsay = 1;
        }else if (sw_nowsay.isChecked()==false){
            nowsay = 0;
        }
    }

    private void checkChinBa(){
        if (sw_93.isChecked()==true){
            chinba = 1;
        }else if (sw_93.isChecked()==false){
            chinba = 0;
        }
    }

    private void checkBayHai(){
        if (sw_72.isChecked()==true){
            bayhai = 1;
        }else if (sw_72.isChecked()==false){
            bayhai = 0;
        }
    }

    private void checkTamSau(){
        if (sw_86.isChecked()==true){
            tamsau = 1;
        }else if (sw_86.isChecked()==false){
            tamsau = 0;
        }
    }

    private void checkSauLam(){
        if (sw_65.isChecked()==true){
            saulam = 1;
        }else if (sw_65.isChecked()==false){
            saulam = 0;
        }
    }

    private void checkBayChin(){
        if (sw_79.isChecked()==true){
            baychin = 1;
        }else if (sw_79.isChecked()==false){
            baychin = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getImGoing(getActivity())==1)
        {
            sw_imgoing.setChecked(true);
            imgoing=1;
        }
        if (QTSHelp.getImGoing(getActivity())==0)
        {
            sw_imgoing.setChecked(false);
            imgoing=0;
        }

        if (QTSHelp.getNowSay(getActivity())==1)
        {
            sw_nowsay.setChecked(true);
            nowsay=1;
        }
        if (QTSHelp.getNowSay(getActivity())==0)
        {
            sw_nowsay.setChecked(false);
            nowsay=0;
        }

        if (QTSHelp.get93(getActivity())==1)
        {
            sw_93.setChecked(true);
            chinba=1;
        }
        if (QTSHelp.getWhatday(getActivity())==0)
        {
            sw_93.setChecked(false);
            chinba=0;
        }

        if (QTSHelp.get72(getActivity())==1)
        {
            sw_72.setChecked(true);
            bayhai=1;
        }
        if (QTSHelp.get72(getActivity())==0)
        {
            sw_72.setChecked(false);
            bayhai=0;
        }

        if (QTSHelp.get86(getActivity())==1)
        {
            sw_86.setChecked(true);
            tamsau=1;
        }
        if (QTSHelp.get86(getActivity())==0)
        {
            sw_86.setChecked(false);
            tamsau=0;
        }

        if (QTSHelp.get65(getActivity())==1)
        {
            sw_65.setChecked(true);
            saulam=1;
        }
        if (QTSHelp.get65(getActivity())==0)
        {
            sw_65.setChecked(false);
            saulam=0;
        }

        if (QTSHelp.get79(getActivity())==1)
        {
            sw_79.setChecked(true);
            baychin=1;
        }
        if (QTSHelp.get79(getActivity())==0)
        {
            sw_79.setChecked(false);
            baychin=0;
        }
    }
}
