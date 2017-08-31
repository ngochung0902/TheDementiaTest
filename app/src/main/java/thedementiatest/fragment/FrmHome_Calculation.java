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

public class FrmHome_Calculation extends Fragment {
    private TextView tv_next,tv_back,tv_calculation,tv_iam,tv_82,tv_add6,tv_take,tv_click,tvsw_tamhai,tvsw_add6,tvsw_take;
    private ImageView img_next,img_back;
    private Switch sw_tamhai,sw_add6,sw_take;
    private int tamhai,add6,take;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_calculation, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_calculation = (TextView) view.findViewById(R.id.tv_calculation);
        tv_iam = (TextView) view.findViewById(R.id.tv_iam);
        tv_82 = (TextView) view.findViewById(R.id.tv_82);
        tv_add6 = (TextView) view.findViewById(R.id.tv_add6);
        tv_take = (TextView) view.findViewById(R.id.tv_take);
        tv_click = (TextView) view.findViewById(R.id.tv_click);

        tvsw_tamhai = (TextView) view.findViewById(R.id.tvsw_tamhai);
        tvsw_add6 = (TextView) view.findViewById(R.id.tvsw_add6);
        tvsw_take = (TextView) view.findViewById(R.id.tvsw_take);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_calculation.setTypeface(customFontBold);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_tamhai = (Switch) view.findViewById(R.id.sw_tamhai);
        sw_add6 = (Switch) view.findViewById(R.id.sw_add6);
        sw_take = (Switch) view.findViewById(R.id.sw_take);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_iam, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_82, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_add6, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_take, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_click, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_add6, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_take, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_tamhai, QTSConstrains.FONT_LATO_REGULAR);

        QTSHelp.setFontTV(getActivity(),tvsw_add6, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_take, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_tamhai, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();

//                QTSHelp.setTamHai(getActivity(),tamhai);
//                QTSHelp.setAdd6(getActivity(),add6);
//                QTSHelp.setTake(getActivity(),take);
                QTSHelp.setNum(getActivity(),7);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Delayed_Recall fragment7 = new FrmHome_Delayed_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment7);
                fragmentTransaction.commit();
                QTSHelp.setNum(getActivity(),7);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),5);

                QTSHelp.setTamHai(getActivity(),0);
                QTSHelp.setAdd6(getActivity(),0);
                QTSHelp.setTake(getActivity(),0);
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Fluidity fragment5 = new FrmHome_Fluidity();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment5);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),5);

                QTSHelp.setTamHai(getActivity(),0);
                QTSHelp.setAdd6(getActivity(),0);
                QTSHelp.setTake(getActivity(),0);
            }
        });

        sw_tamhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTamHai();
                if (sw_tamhai.isChecked()==true)
                {
                    QTSHelp.setTamHai(getActivity(),tamhai);
                    tvsw_tamhai.setText(getResources().getString(R.string.yes));
                }
                if (sw_tamhai.isChecked()==false)
                {
                    QTSHelp.setTamHai(getActivity(),tamhai);
                    tvsw_tamhai.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_tamhai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkTamHai();
                if (sw_tamhai.isChecked()==true)
                {
                    QTSHelp.setTamHai(getActivity(),tamhai);
                    tvsw_tamhai.setText(getResources().getString(R.string.yes));
                }
                if (sw_tamhai.isChecked()==false)
                {
                    QTSHelp.setTamHai(getActivity(),tamhai);
                    tvsw_tamhai.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_add6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAdd6();
                if (sw_add6.isChecked()==true)
                {
                    QTSHelp.setAdd6(getActivity(),add6);
                    tvsw_add6.setText(getResources().getString(R.string.yes));
                }
                if (sw_add6.isChecked()==false)
                {
                    QTSHelp.setAdd6(getActivity(),add6);
                    tvsw_add6.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_add6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAdd6();
                if (sw_add6.isChecked()==true)
                {
                    QTSHelp.setAdd6(getActivity(),add6);
                    tvsw_add6.setText(getResources().getString(R.string.yes));
                }
                if (sw_add6.isChecked()==false)
                {
                    QTSHelp.setAdd6(getActivity(),add6);
                    tvsw_add6.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTake();
                if (sw_take.isChecked()==true)
                {
                    QTSHelp.setTake(getActivity(),take);
                    tvsw_take.setText(getResources().getString(R.string.yes));
                }
                if (sw_take.isChecked()==false)
                {
                    QTSHelp.setTake(getActivity(),take);
                    tvsw_take.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_take.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkTake();
                if (sw_take.isChecked()==true)
                {
                    QTSHelp.setTake(getActivity(),take);
                    tvsw_take.setText(getResources().getString(R.string.yes));
                }
                if (sw_take.isChecked()==false)
                {
                    QTSHelp.setTake(getActivity(),take);
                    tvsw_take.setText(getResources().getString(R.string.no));
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

    private void checkTamHai(){
        if (sw_tamhai.isChecked()==true){
            tamhai = 1;
        }else if (sw_tamhai.isChecked()==false){
            tamhai = 0;
        }
    }

    private void checkAdd6(){
        if (sw_add6.isChecked()==true){
            add6 = 1;
        }else if (sw_add6.isChecked()==false){
            add6 = 0;
        }
    }

    private void checkTake(){
        if (sw_take.isChecked()==true){
            take = 1;
        }else if (sw_take.isChecked()==false){
            take = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getTamHai(getActivity())==1)
        {
            sw_tamhai.setChecked(true);
            tamhai=1;
            tvsw_tamhai.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getTamHai(getActivity())==0)
        {
            sw_tamhai.setChecked(false);
            tamhai=0;
            tvsw_tamhai.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getAdd6(getActivity())==1)
        {
            sw_add6.setChecked(true);
            add6=1;
            tvsw_add6.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAdd6(getActivity())==0)
        {
            sw_add6.setChecked(false);
            add6=0;
            tvsw_add6.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getTake(getActivity())==1)
        {
            sw_take.setChecked(true);
            take=1;
            tvsw_take.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getTake(getActivity())==0)
        {
            sw_take.setChecked(false);
            take=0;
            tvsw_take.setText(getResources().getString(R.string.no));
        }
    }
}
