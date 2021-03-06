package thedementiatest.fragment;

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

import com.thedementiatest.R;
import thedementiatest.helper.QTSConstrains;
import thedementiatest.helper.QTSHelp;

public class FrmHome_Orientation extends Fragment {
    private TextView tv_next,tv_back,tv_orientation,
            tv_ori,tv_whatday,tv_whatmonth,tv_year,tv_whatstate,tv_whois,
            tvsw_whatday,tvsw_whatmonth,tvsw_year,tvsw_whatstate,tvsw_whois;
    private ImageView img_next,img_back;
    private Switch sw_whatday,sw_whatmonth,sw_year,sw_whatstate,sw_whois;
    private int whatday,whatmonth,year,whatsate,whois;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_orientation, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        tv_orientation = (TextView) view.findViewById(R.id.tv_orientation);
        tv_ori = (TextView) view.findViewById(R.id.tv_ori);
        tv_whatday = (TextView) view.findViewById(R.id.tv_whatday);
        tv_whatmonth = (TextView) view.findViewById(R.id.tv_whatmonth);
        tv_year = (TextView) view.findViewById(R.id.tv_year);
        tv_whatstate = (TextView) view.findViewById(R.id.tv_whatstate);
        tv_whois = (TextView) view.findViewById(R.id.tv_whois);

        tvsw_whatday = (TextView) view.findViewById(R.id.tvsw_whatday);
        tvsw_whatmonth = (TextView) view.findViewById(R.id.tvsw_whatmonth);
        tvsw_year = (TextView) view.findViewById(R.id.tvsw_year);
        tvsw_whatstate = (TextView) view.findViewById(R.id.tvsw_whatstate);
        tvsw_whois = (TextView) view.findViewById(R.id.tvsw_whois);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_orientation.setTypeface(customFontBold);

        sw_whatday = (Switch) view.findViewById(R.id.sw_whatday);
        sw_whatmonth = (Switch) view.findViewById(R.id.sw_whatmonth);
        sw_year = (Switch) view.findViewById(R.id.sw_year);
        sw_whatstate = (Switch) view.findViewById(R.id.sw_whatstate);
        sw_whois = (Switch) view.findViewById(R.id.sw_whois);

        QTSHelp.setFontTV(getActivity(),tv_ori, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_whatday, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_whatmonth, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_year, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_whatstate, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_whois, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whatday, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whatmonth, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whatstate, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_whois, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_year, QTSConstrains.FONT_LATO_REGULAR);

        QTSHelp.setFontTV(getActivity(),tvsw_year, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_whatday, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_whatmonth, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_whatstate, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_whois, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Attention fragment2 = new FrmHome_Attention();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();

//                QTSHelp.setWhatday(getActivity(),whatday);
//                QTSHelp.setWhatMonth(getActivity(),whatmonth);
//                QTSHelp.setYear(getActivity(),year);
//                QTSHelp.setWhatSate(getActivity(),whatsate);
//                QTSHelp.setWhois(getActivity(),whois);

                QTSHelp.setNum(getActivity(),2);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Attention fragment2 = new FrmHome_Attention();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment2);
                fragmentTransaction.commit();

//                QTSHelp.setWhatday(getActivity(),whatday);
//                QTSHelp.setWhatMonth(getActivity(),whatmonth);
//                QTSHelp.setYear(getActivity(),year);
//                QTSHelp.setWhatSate(getActivity(),whatsate);
//                QTSHelp.setWhois(getActivity(),whois);
                QTSHelp.setNum(getActivity(),2);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Examination fragment = new FrmHome_Examination();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),0);

                QTSHelp.setWhatday(getActivity(),0);
                QTSHelp.setWhatMonth(getActivity(),0);
                QTSHelp.setYear(getActivity(),0);
                QTSHelp.setWhatSate(getActivity(),0);
                QTSHelp.setWhois(getActivity(),0);

            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Examination fragment = new FrmHome_Examination();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),0);

                QTSHelp.setWhatday(getActivity(),0);
                QTSHelp.setWhatMonth(getActivity(),0);
                QTSHelp.setYear(getActivity(),0);
                QTSHelp.setWhatSate(getActivity(),0);
                QTSHelp.setWhois(getActivity(),0);
            }
        });

        sw_whatday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatDay();
                if (sw_whatday.isChecked()==true)
                {
                    QTSHelp.setWhatday(getActivity(),whatday);
                    tvsw_whatday.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatday.isChecked()==false)
                {
                    QTSHelp.setWhatday(getActivity(),whatday);
                    tvsw_whatday.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whatday.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhatDay();
                if (sw_whatday.isChecked()==true)
                {
                    QTSHelp.setWhatday(getActivity(),whatday);
                    tvsw_whatday.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatday.isChecked()==false)
                {
                    QTSHelp.setWhatday(getActivity(),whatday);
                    tvsw_whatday.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whatmonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatMonth();
                if (sw_whatmonth.isChecked()==true)
                {
                    QTSHelp.setWhatMonth(getActivity(),whatmonth);
                    tvsw_whatmonth.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatmonth.isChecked()==false)
                {
                    QTSHelp.setWhatMonth(getActivity(),whatmonth);
                    tvsw_whatmonth.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whatmonth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhatMonth();
                if (sw_whatmonth.isChecked()==true)
                {
                    QTSHelp.setWhatMonth(getActivity(),whatmonth);
                    tvsw_whatmonth.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatmonth.isChecked()==false)
                {
                    QTSHelp.setWhatMonth(getActivity(),whatmonth);
                    tvsw_whatmonth.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkYear();
                if (sw_year.isChecked()==true)
                {
                    QTSHelp.setYear(getActivity(),year);
                    tvsw_year.setText(getResources().getString(R.string.yes));
                }
                if (sw_year.isChecked()==false)
                {
                    QTSHelp.setYear(getActivity(),year);
                    tvsw_year.setText(getResources().getString(R.string.no));
                }

            }
        });

        sw_year.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkYear();
                if (sw_year.isChecked()==true)
                {
                    QTSHelp.setYear(getActivity(),year);
                    tvsw_year.setText(getResources().getString(R.string.yes));
                }
                if (sw_year.isChecked()==false)
                {

                    QTSHelp.setYear(getActivity(),year);
                    tvsw_year.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whatstate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhatSate();
                if (sw_whatstate.isChecked()==true)
                {
                    QTSHelp.setWhatSate(getActivity(),whatsate);
                    tvsw_whatstate.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatstate.isChecked()==false)
                {
                    QTSHelp.setWhatSate(getActivity(),whatsate);
                    tvsw_whatstate.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whatstate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhatSate();
                checkWhatSate();
                if (sw_whatstate.isChecked()==true)
                {
                    QTSHelp.setWhatSate(getActivity(),whatsate);
                    tvsw_whatstate.setText(getResources().getString(R.string.yes));
                }
                if (sw_whatstate.isChecked()==false)
                {
                    QTSHelp.setWhatSate(getActivity(),whatsate);
                    tvsw_whatstate.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWhois();
                checkWhatSate();
                if (sw_whois.isChecked()==true)
                {
                    QTSHelp.setWhois(getActivity(),whois);
                    tvsw_whois.setText(getResources().getString(R.string.yes));
                }
                if (sw_whois.isChecked()==false)
                {
                    QTSHelp.setWhois(getActivity(),whois);
                    tvsw_whois.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_whois.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkWhois();
                if (sw_whois.isChecked()==true)
                {
                    QTSHelp.setWhois(getActivity(),whois);
                    tvsw_whois.setText(getResources().getString(R.string.yes));
                }
                if (sw_whois.isChecked()==false)
                {
                    QTSHelp.setWhois(getActivity(),whois);
                    tvsw_whois.setText(getResources().getString(R.string.no));
                }
            }
        });

        img_back.setOnTouchListener(new View.OnTouchListener() {
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
            tvsw_whatday.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getWhatday(getActivity())==0)
        {
            sw_whatday.setChecked(false);
            whatday=0;
            tvsw_whatday.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getWhatMonth(getActivity())==1)
        {
            sw_whatmonth.setChecked(true);
            whatmonth=1;
            tvsw_whatmonth.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getWhatMonth(getActivity())==0)
        {
            sw_whatmonth.setChecked(false);
            whatmonth=0;
            tvsw_whatmonth.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getYear(getActivity())==1)
        {
            sw_year.setChecked(true);
            year=1;
            tvsw_year.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getYear(getActivity())==0)
        {
            sw_year.setChecked(false);
            year=0;
            tvsw_year.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getWhatSate(getActivity())==1)
        {
            sw_whatstate.setChecked(true);
            whatsate=1;
            tvsw_whatstate.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getWhatSate(getActivity())==0)
        {
            sw_whatstate.setChecked(false);
            whatsate=0;
            tvsw_whatstate.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getWhois(getActivity())==1)
        {
            sw_whois.setChecked(true);
            whois=1;
            tvsw_whois.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getWhois(getActivity())==0)
        {
            sw_whois.setChecked(false);
            whois=0;
            tvsw_whois.setText(getResources().getString(R.string.no));
        }
    }


}
