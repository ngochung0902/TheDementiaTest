package com.company.qts.thedementiatest.fragment;

import android.graphics.Typeface;
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
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmHome_Immediate_Recall extends Fragment {
    private TextView tv_next,tv_back,tv_recall,tv_listen;
    private ImageView img_next,img_back;
    private Switch sw_listento;
    private int listento;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_immediate_recall, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_recall = (TextView) view.findViewById(R.id.tv_recall);
        tv_listen = (TextView) view.findViewById(R.id.tv_listen);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),"fonts/Lato_Bold.ttf");
        tv_recall.setTypeface(customFontBold);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_listento = (Switch) view.findViewById(R.id.sw_listento);

        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_listen, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_listento, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Language fragment4 = new FrmHome_Language();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment4);
                fragmentTransaction.commit();

                QTSHelp.setListento(getActivity(),listento);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Language fragment4 = new FrmHome_Language();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment4);
                fragmentTransaction.commit();

                QTSHelp.setListento(getActivity(),listento);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Attention fragment2 = new FrmHome_Attention();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Attention fragment2 = new FrmHome_Attention();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();

            }
        });

        sw_listento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkListento();
            }
        });
        return view;
    }
    private void checkListento(){
        if (sw_listento.isChecked()==true){
            listento = 1;
        }else if (sw_listento.isChecked()==false){
            listento = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getListento(getActivity())==1)
        {
            sw_listento.setChecked(true);
            listento=1;
        }
        if (QTSHelp.getListento(getActivity())==0)
        {
            sw_listento.setChecked(false);
            listento=0;
        }
    }
}
