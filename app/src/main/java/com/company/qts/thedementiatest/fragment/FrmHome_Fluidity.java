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

public class FrmHome_Fluidity extends Fragment {
    private TextView tv_next,tv_back,tv_fluidity,tv_fl,tv_04,tv_59,tv_1015;
    private ImageView img_next,img_back;
    private Switch sw_04animals,sw_59animals,sw_1015animals;
    private int animals04,animals59,animals1015;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_fluidity, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        tv_fluidity = (TextView) view.findViewById(R.id.tv_fluidity);
        tv_fl = (TextView) view.findViewById(R.id.tv_fl);
        tv_04 = (TextView) view.findViewById(R.id.tv_04);
        tv_59 = (TextView) view.findViewById(R.id.tv_59);
        tv_1015 = (TextView) view.findViewById(R.id.tv_1015);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),"fonts/Lato_Bold.ttf");
        tv_fluidity.setTypeface(customFontBold);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_04animals = (Switch) view.findViewById(R.id.sw_04animals);
        sw_59animals = (Switch) view.findViewById(R.id.sw_59animals);
        sw_1015animals = (Switch) view.findViewById(R.id.sw_1015animals);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_fl, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_04, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_59, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_1015, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_04animals, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_59animals, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_1015animals, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Calculation fragment6 = new FrmHome_Calculation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment6);
                fragmentTransaction.commit();

                QTSHelp.setAnimals04(getActivity(),animals04);
                QTSHelp.setAnimals59(getActivity(),animals59);
                QTSHelp.setAnimals1015(getActivity(),animals1015);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Calculation fragment6 = new FrmHome_Calculation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment6);
                fragmentTransaction.commit();
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Language fragment4 = new FrmHome_Language();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment4);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Language fragment4 = new FrmHome_Language();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment4);
                fragmentTransaction.commit();
            }
        });

        sw_04animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnimals04();
                if (sw_04animals.isChecked()==true)
                {
                    sw_59animals.setChecked(false);
                    sw_1015animals.setChecked(false);
                    animals59 =0;
                    animals1015=0;
                }
            }
        });

        sw_59animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnimals59();
                if (sw_59animals.isChecked()==true)
                {
                    sw_04animals.setChecked(false);
                    sw_1015animals.setChecked(false);
                    animals04 =0;
                    animals1015=0;
                }
            }
        });

        sw_1015animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnimals1015();
                if (sw_1015animals.isChecked()==true)
                {
                    sw_04animals.setChecked(false);
                    sw_59animals.setChecked(false);
                    animals04 =0;
                    animals59=0;
                }
            }
        });
        return view;
    }

    private void checkAnimals04(){
        if (sw_04animals.isChecked()==true){
            animals04 = 1;
        }else if (sw_04animals.isChecked()==false){
            animals04 = 0;
        }
    }

    private void checkAnimals59(){
        if (sw_59animals.isChecked()==true){
            animals59 = 1;
        }else if (sw_59animals.isChecked()==false){
            animals59 = 0;
        }
    }

    private void checkAnimals1015(){
        if (sw_1015animals.isChecked()==true){
            animals1015 = 1;
        }else if (sw_1015animals.isChecked()==false){
            animals1015 = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getAnimals04(getActivity())==1)
        {
            sw_04animals.setChecked(true);
            animals04=1;
        }
        if (QTSHelp.getAnimals04(getActivity())==0)
        {
            sw_04animals.setChecked(false);
            animals04=0;
        }

        if (QTSHelp.getAnimals59(getActivity())==1)
        {
            sw_59animals.setChecked(true);
            animals59=1;
        }
        if (QTSHelp.getAnimals59(getActivity())==0)
        {
            sw_59animals.setChecked(false);
            animals59=0;
        }

        if (QTSHelp.getAnimals1015(getActivity())==1)
        {
            sw_1015animals.setChecked(true);
            animals1015=1;
        }
        if (QTSHelp.getAnimals1015(getActivity())==0)
        {
            sw_1015animals.setChecked(false);
            animals1015=0;
        }
    }
}
