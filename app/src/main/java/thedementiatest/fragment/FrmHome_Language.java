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

public class FrmHome_Language extends Fragment {
    private TextView tv_next,tv_back,tv_language,tv_la,tv_begin,tv_repeat1,tv_repeat2,tv_thecat,tv_steve,
            tvsw_beginningwith,tvsw_thecat,tvsw_steveis;
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

        tvsw_beginningwith = (TextView) view.findViewById(R.id.tvsw_beginningwith);
        tvsw_thecat = (TextView) view.findViewById(R.id.tvsw_thecat);
        tvsw_steveis = (TextView) view.findViewById(R.id.tvsw_steveis);

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

        QTSHelp.setFontTV(getActivity(),tvsw_thecat, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_beginningwith, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_steveis, QTSConstrains.FONT_LATO_REGULAR);

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

//                QTSHelp.setBeginningWith(getActivity(),beginningwith);
//                QTSHelp.setTheCat(getActivity(),thecat);
//                QTSHelp.setSteveis(getActivity(),steveis);
                QTSHelp.setNum(getActivity(),5);
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

//                QTSHelp.setBeginningWith(getActivity(),beginningwith);
//                QTSHelp.setTheCat(getActivity(),thecat);
//                QTSHelp.setSteveis(getActivity(),steveis);
                QTSHelp.setNum(getActivity(),5);
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

                QTSHelp.setNum(getActivity(),3);

                QTSHelp.setBeginningWith(getActivity(),0);
                QTSHelp.setTheCat(getActivity(),0);
                QTSHelp.setSteveis(getActivity(),0);
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

                QTSHelp.setNum(getActivity(),3);

                QTSHelp.setBeginningWith(getActivity(),0);
                QTSHelp.setTheCat(getActivity(),0);
                QTSHelp.setSteveis(getActivity(),0);
            }
        });

        sw_beginningwith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBeginningWith();
                if (sw_beginningwith.isChecked()==true)
                {
                    QTSHelp.setBeginningWith(getActivity(),beginningwith);
                    tvsw_beginningwith.setText(getResources().getString(R.string.yes));
                }
                if (sw_beginningwith.isChecked()==false)
                {
                    QTSHelp.setBeginningWith(getActivity(),beginningwith);
                    tvsw_beginningwith.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_beginningwith.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBeginningWith();
                if (sw_beginningwith.isChecked()==true)
                {
                    QTSHelp.setBeginningWith(getActivity(),beginningwith);
                    tvsw_beginningwith.setText(getResources().getString(R.string.yes));
                }
                if (sw_beginningwith.isChecked()==false)
                {
                    QTSHelp.setBeginningWith(getActivity(),beginningwith);
                    tvsw_beginningwith.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_thecat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTheCat();
                if (sw_thecat.isChecked()==true)
                {
                    QTSHelp.setTheCat(getActivity(),thecat);
                    tvsw_thecat.setText(getResources().getString(R.string.yes));
                }
                if (sw_thecat.isChecked()==false)
                {
                    QTSHelp.setTheCat(getActivity(),thecat);
                    tvsw_thecat.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_thecat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkTheCat();
                if (sw_thecat.isChecked()==true)
                {
                    QTSHelp.setTheCat(getActivity(),thecat);
                    tvsw_thecat.setText(getResources().getString(R.string.yes));
                }
                if (sw_thecat.isChecked()==false)
                {
                    QTSHelp.setTheCat(getActivity(),thecat);
                    tvsw_thecat.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_steveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSteveis();
                if (sw_steveis.isChecked()==true)
                {
                    QTSHelp.setSteveis(getActivity(),steveis);
                    tvsw_steveis.setText(getResources().getString(R.string.yes));
                }
                if (sw_steveis.isChecked()==false)
                {
                    QTSHelp.setSteveis(getActivity(),steveis);
                    tvsw_steveis.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_steveis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkSteveis();
                if (sw_steveis.isChecked()==true)
                {
                    QTSHelp.setSteveis(getActivity(),steveis);
                    tvsw_steveis.setText(getResources().getString(R.string.yes));
                }
                if (sw_steveis.isChecked()==false)
                {
                    QTSHelp.setSteveis(getActivity(),steveis);
                    tvsw_steveis.setText(getResources().getString(R.string.no));
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
            tvsw_beginningwith.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getBeginningWith(getActivity())==0)
        {
            sw_beginningwith.setChecked(false);
            beginningwith=0;
            tvsw_beginningwith.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getTheCat(getActivity())==1)
        {
            sw_thecat.setChecked(true);
            thecat=1;
            tvsw_thecat.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getTheCat(getActivity())==0)
        {
            sw_thecat.setChecked(false);
            thecat=0;
            tvsw_thecat.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getSteveis(getActivity())==1)
        {
            sw_steveis.setChecked(true);
            steveis=1;
            tvsw_steveis.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getSteveis(getActivity())==0)
        {
            sw_steveis.setChecked(false);
            steveis=0;
            tvsw_steveis.setText(getResources().getString(R.string.no));
        }
    }
}
