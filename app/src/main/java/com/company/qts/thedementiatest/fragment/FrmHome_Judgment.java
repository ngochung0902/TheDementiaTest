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

public class FrmHome_Judgment extends Fragment {
    private TextView tv_next,tv_back,tv_judgment,tv_ww1,tv_ww2,tv_ju;
    private ImageView img_next,img_back;
    private Switch sw_whatwould1,sw_whatwould2;
    private int whatwould1,whatwould2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_judgment, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_judgment = (TextView) view.findViewById(R.id.tv_judgment);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_judgment.setTypeface(customFontBold);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_whatwould1 = (Switch) view.findViewById(R.id.sw_whatwould1);
        sw_whatwould2 = (Switch) view.findViewById(R.id.sw_whatwould2);
        tv_ww1 = (TextView) view.findViewById(R.id.tv_ww1);
        tv_ww2 = (TextView) view.findViewById(R.id.tv_ww2);
        tv_ju = (TextView) view.findViewById(R.id.tv_ju);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_ww1, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_ww2, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_ju, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whatwould1, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whatwould2, QTSConstrains.FONT_LATO_REGULAR);

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

        sw_whatwould1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhatWould1();
            }
        });

        sw_whatwould2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatWould2();
            }
        });

        sw_whatwould2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhatWould2();
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
