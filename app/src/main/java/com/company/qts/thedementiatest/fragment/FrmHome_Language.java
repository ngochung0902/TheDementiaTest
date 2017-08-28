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

public class FrmHome_Language extends Fragment {
    private TextView tv_next,tv_back,tv_language,tv_la,tv_begin,tv_repeat1,tv_repeat2,tv_thecat,tv_steve;
    private ImageView img_next,img_back;
    private Switch sw_beginningwith,sw_thecat,sw_steveis;
    private int beginningwith,thecat,steveis;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_language, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_language = (TextView) view.findViewById(R.id.tv_language);

        tv_la = (TextView) view.findViewById(R.id.tv_la);
        tv_begin = (TextView) view.findViewById(R.id.tv_begin);
        tv_repeat1 = (TextView) view.findViewById(R.id.tv_repeat1);
        tv_repeat2 = (TextView) view.findViewById(R.id.tv_repeat2);
        tv_thecat = (TextView) view.findViewById(R.id.tv_thecat);
        tv_steve = (TextView) view.findViewById(R.id.tv_steve);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_language.setTypeface(customFontBold);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_steveis = (Switch) view.findViewById(R.id.sw_steveis);
        sw_thecat = (Switch) view.findViewById(R.id.sw_thecat);
        sw_beginningwith = (Switch) view.findViewById(R.id.sw_beginningwith);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_la, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_begin, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_repeat1, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_repeat2, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_thecat, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_steve, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_beginningwith, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_steveis, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_thecat, QTSConstrains.FONT_LATO_REGULAR);

//        sw_steveis.setVisibility(View.INVISIBLE);
//        sw_thecat.setVisibility(View.INVISIBLE);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
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
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
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
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
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
//                if (sw_beginningwith.isChecked()==true)
//                {
//                    sw_steveis.setVisibility(View.VISIBLE);
//                    sw_thecat.setVisibility(View.VISIBLE);
//                }
//                else
//                {
//                    if (sw_beginningwith.isChecked()==false)
//                    {
//                        sw_steveis.setChecked(false);
//                        sw_thecat.setChecked(false);
//                        sw_steveis.setVisibility(View.INVISIBLE);
//                        sw_thecat.setVisibility(View.INVISIBLE);
//                        steveis=0;
//                        thecat=0;
//                    }
//                }
            }
        });

        sw_beginningwith.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBeginningWith();
            }
        });

        sw_thecat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTheCat();
            }
        });

        sw_thecat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkTheCat();
            }
        });

        sw_steveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSteveis();
            }
        });

        sw_steveis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkSteveis();
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
//            sw_steveis.setVisibility(View.VISIBLE);
//            sw_thecat.setVisibility(View.VISIBLE);
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
