package com.company.qts.thedementiatest.fragment;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmHome_Delayed_Recall extends Fragment {
    private TextView tv_next,tv_back,tv_delayedrecall,tv_de,tv_lamp,tv_phone,tv_chair,tv_car,tv_house,tv_click;
    private ImageView img_next,img_back;
    private Switch sw_lamp,sw_phone,sw_chair,sw_car,sw_house;
    private int lamp,phone,chair,car,house;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_delayed_recall, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        tv_de = (TextView) view.findViewById(R.id.tv_de);
        tv_lamp = (TextView) view.findViewById(R.id.tv_lamp);
        tv_phone = (TextView) view.findViewById(R.id.tv_phone);
        tv_chair = (TextView) view.findViewById(R.id.tv_chair);
        tv_car = (TextView) view.findViewById(R.id.tv_car);
        tv_house = (TextView) view.findViewById(R.id.tv_house);
        tv_click = (TextView) view.findViewById(R.id.tv_click);
        tv_delayedrecall = (TextView) view.findViewById(R.id.tv_delayedrecall);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_delayedrecall.setTypeface(customFontBold);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_lamp = (Switch) view.findViewById(R.id.sw_lamp);
        sw_phone = (Switch) view.findViewById(R.id.sw_phone);
        sw_chair = (Switch) view.findViewById(R.id.sw_chair);
        sw_car = (Switch) view.findViewById(R.id.sw_car);
        sw_house = (Switch) view.findViewById(R.id.sw_house);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_de, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_lamp, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_phone, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_chair, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_car, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_house, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_click, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_car, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_chair, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_house, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_lamp, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_phone, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Judgment fragment8 = new FrmHome_Judgment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment8);
                fragmentTransaction.commit();

                QTSHelp.setLamp(getActivity(),lamp);
                QTSHelp.setPhone(getActivity(),phone);
                QTSHelp.setChair(getActivity(),chair);
                QTSHelp.setCar(getActivity(),car);
                QTSHelp.setHouse(getActivity(),house);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Judgment fragment8 = new FrmHome_Judgment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment8);
                fragmentTransaction.commit();

                QTSHelp.setLamp(getActivity(),lamp);
                QTSHelp.setPhone(getActivity(),phone);
                QTSHelp.setChair(getActivity(),chair);
                QTSHelp.setCar(getActivity(),car);
                QTSHelp.setHouse(getActivity(),house);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Calculation fragment6 = new FrmHome_Calculation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment6);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Calculation fragment6 = new FrmHome_Calculation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment6);
                fragmentTransaction.commit();
            }
        });

        sw_lamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLamp();
            }
        });

        sw_lamp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkLamp();
            }
        });

        sw_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPhone();
            }
        });

        sw_phone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkPhone();
            }
        });

        sw_chair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkChair();
            }
        });

        sw_chair.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkChair();
            }
        });

        sw_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCar();
            }
        });

        sw_car.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkCar();
            }
        });

        sw_house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkHouse();
            }
        });

        sw_house.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkHouse();
            }
        });

        img_back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        img_back.setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        img_back.clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });

        tv_back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        int color = Color.parseColor("#A8A8A8");
                        img_back.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        img_back.clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });

        img_next.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        img_next.setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        img_next.clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });

        tv_next.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        int color = Color.parseColor("#A8A8A8");
                        img_next.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        img_next.clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });

        return view;
    }

    private void checkLamp(){
        if (sw_lamp.isChecked()==true){
            lamp = 1;
        }else if (sw_lamp.isChecked()==false){
            lamp = 0;
        }
    }

    private void checkPhone(){
        if (sw_phone.isChecked()==true){
            phone = 1;
        }else if (sw_phone.isChecked()==false){
            phone = 0;
        }
    }

    private void checkChair(){
        if (sw_chair.isChecked()==true){
            chair = 1;
        }else if (sw_chair.isChecked()==false){
            chair = 0;
        }
    }

    private void checkCar(){
        if (sw_car.isChecked()==true){
            car = 1;
        }else if (sw_car.isChecked()==false){
            car = 0;
        }
    }

    private void checkHouse(){
        if (sw_house.isChecked()==true){
            house = 1;
        }else if (sw_house.isChecked()==false){
            house = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getLamp(getActivity())==1)
        {
            sw_lamp.setChecked(true);
            lamp=1;
        }
        if (QTSHelp.getLamp(getActivity())==0)
        {
            sw_lamp.setChecked(false);
            lamp=0;
        }

        if (QTSHelp.getPhone(getActivity())==1)
        {
            sw_phone.setChecked(true);
            phone=1;
        }
        if (QTSHelp.getPhone(getActivity())==0)
        {
            sw_phone.setChecked(false);
            phone=0;
        }

        if (QTSHelp.getChair(getActivity())==1)
        {
            sw_chair.setChecked(true);
            chair=1;
        }
        if (QTSHelp.getChair(getActivity())==0)
        {
            sw_chair.setChecked(false);
            chair=0;
        }

        if (QTSHelp.getCar(getActivity())==1)
        {
            sw_car.setChecked(true);
            car=1;
        }
        if (QTSHelp.getCar(getActivity())==0)
        {
            sw_car.setChecked(false);
            car=0;
        }

        if (QTSHelp.getHouse(getActivity())==1)
        {
            sw_house.setChecked(true);
            house=1;
        }
        if (QTSHelp.getHouse(getActivity())==0)
        {
            sw_house.setChecked(false);
            house=0;
        }
    }
}
