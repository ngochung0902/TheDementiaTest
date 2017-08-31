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

public class FrmHome_Immediate_Recall extends Fragment {
    private TextView tv_next,tv_back,tv_recall,tv_listen,tvsw_listento;
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
        tvsw_listento = (TextView) view.findViewById(R.id.tvsw_listento);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_recall.setTypeface(customFontBold);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_listento = (Switch) view.findViewById(R.id.sw_listento);

        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_listen, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_listento, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_listento, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Language fragment4 = new FrmHome_Language();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment4);
                fragmentTransaction.commit();

//                QTSHelp.setListento(getActivity(),listento);
                QTSHelp.setNum(getActivity(),4);
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

//                QTSHelp.setListento(getActivity(),listento);
                QTSHelp.setNum(getActivity(),4);
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

                QTSHelp.setNum(getActivity(),2);

                QTSHelp.setListento(getActivity(),0);
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

                QTSHelp.setNum(getActivity(),2);

                QTSHelp.setListento(getActivity(),0);
            }
        });

        sw_listento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkListento();
                if (sw_listento.isChecked()==true)
                {
                    QTSHelp.setListento(getActivity(),listento);
                    tvsw_listento.setText(getResources().getString(R.string.yes));
                }
                if (sw_listento.isChecked()==false)
                {
                    QTSHelp.setListento(getActivity(),listento);
                    tvsw_listento.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_listento.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkListento();
                if (sw_listento.isChecked()==true)
                {
                    QTSHelp.setListento(getActivity(),listento);
                    tvsw_listento.setText(getResources().getString(R.string.yes));
                }
                if (sw_listento.isChecked()==false)
                {
                    QTSHelp.setListento(getActivity(),listento);
                    tvsw_listento.setText(getResources().getString(R.string.no));
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
            tvsw_listento.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getListento(getActivity())==0)
        {
            sw_listento.setChecked(false);
            listento=0;
            tvsw_listento.setText(getResources().getString(R.string.no));
        }
    }
}
