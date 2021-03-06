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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.thedementiatest.R;
import thedementiatest.helper.QTSConstrains;
import thedementiatest.helper.QTSHelp;

public class FrmHome_Abstract_Reasoning extends Fragment {
    private TextView tv_back,tv_abs,tv_ab,tv_quater,tv_awatch,tv_click,tvsw_aqua,tvsw_awatch;
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
        tv_abs = (TextView) view.findViewById(R.id.tv_abs);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        bt_calculatescore.setTypeface(customFontBold);
        tv_abs.setTypeface(customFontBold);
        sw_aqua = (Switch) view.findViewById(R.id.sw_aqua);
        sw_awatch = (Switch) view.findViewById(R.id.sw_awatch);
        tv_ab = (TextView) view.findViewById(R.id.tv_ab);
        tv_quater = (TextView) view.findViewById(R.id.tv_quater);
        tv_awatch = (TextView) view.findViewById(R.id.tv_awatch);
        tv_click = (TextView) view.findViewById(R.id.tv_click);
        tvsw_aqua = (TextView) view.findViewById(R.id.tvsw_aqua);
        tvsw_awatch = (TextView) view.findViewById(R.id.tvsw_awatch);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_ab, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_quater, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_awatch, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_click, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_aqua, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_awatch, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_aqua, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_awatch, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Judgment fragment8 = new FrmHome_Judgment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment8);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),8);

                QTSHelp.setAqua(getActivity(),0);
                QTSHelp.setAwatch(getActivity(),0);
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

                QTSHelp.setNum(getActivity(),8);

                QTSHelp.setAqua(getActivity(),0);
                QTSHelp.setAwatch(getActivity(),0);
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

                QTSHelp.setNum(getActivity(),10);

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

                if (QTSHelp.getBeginningWith(getActivity())==1)
                    dem=dem+1;
                if (QTSHelp.getTheCat(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getSteveis(getActivity())==1)
                    dem = dem +1;

                if (QTSHelp.getAnimals04(getActivity())==1)
                    dem = dem +0;
                if (QTSHelp.getAnimals59(getActivity())==1)
                    dem = dem +1;
                if (QTSHelp.getAnimals1015(getActivity())==1)
                    dem = dem +2;

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
                if (sw_aqua.isChecked()==true)
                {
                    QTSHelp.setAqua(getActivity(),aqua);
                    tvsw_aqua.setText(getResources().getString(R.string.yes));
                }
                if (sw_aqua.isChecked()==false)
                {
                    QTSHelp.setAqua(getActivity(),aqua);
                    tvsw_aqua.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_aqua.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAqua();
                if (sw_aqua.isChecked()==true)
                {
                    QTSHelp.setAqua(getActivity(),aqua);
                    tvsw_aqua.setText(getResources().getString(R.string.yes));
                }
                if (sw_aqua.isChecked()==false)
                {
                    QTSHelp.setAqua(getActivity(),aqua);
                    tvsw_aqua.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_awatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAwatch();
                if (sw_awatch.isChecked()==true)
                {
                    QTSHelp.setAwatch(getActivity(),awatch);
                    tvsw_awatch.setText(getResources().getString(R.string.yes));
                }
                if (sw_awatch.isChecked()==false)
                {
                    QTSHelp.setAwatch(getActivity(),awatch);
                    tvsw_awatch.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_awatch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAwatch();
                if (sw_awatch.isChecked()==true)
                {
                    QTSHelp.setAwatch(getActivity(),awatch);
                    tvsw_awatch.setText(getResources().getString(R.string.yes));
                }
                if (sw_awatch.isChecked()==false)
                {
                    QTSHelp.setAwatch(getActivity(),awatch);
                    tvsw_awatch.setText(getResources().getString(R.string.no));
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
            tvsw_aqua.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAqua(getActivity()) == 0) {
            sw_aqua.setChecked(false);
            aqua = 0;
            tvsw_aqua.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getAwatch(getActivity()) == 1) {
            sw_awatch.setChecked(true);
            awatch = 1;
            tvsw_awatch.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAwatch(getActivity()) == 0) {
            sw_awatch.setChecked(false);
            awatch = 0;
            tvsw_awatch.setText(getResources().getString(R.string.no));
        }
    }

}
