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

public class FrmHome_Attention extends Fragment {
    private TextView tv_next,tv_back,tv_attention,tv_imgoing,tv_nowsay,tv_serial,
            tvsw_imgoing,tvsw_nowsay,tvsw_93,tvsw_79,tvsw_65,tvsw_86,tvsw_72;
    private ImageView img_next,img_back;
    private Switch sw_imgoing,sw_nowsay,sw_93,sw_72,sw_86,sw_65,sw_79;
    private int imgoing,nowsay,chinba,bayhai,tamsau,saulam,baychin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_attention, container, false);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        tv_attention = (TextView) view.findViewById(R.id.tv_attention);
        tv_imgoing = (TextView) view.findViewById(R.id.tv_imgoing);
        tv_nowsay = (TextView) view.findViewById(R.id.tv_nowsay);
        tv_serial = (TextView) view.findViewById(R.id.tv_serial);

        tvsw_imgoing = (TextView) view.findViewById(R.id.tvsw_imgoing);
        tvsw_nowsay = (TextView) view.findViewById(R.id.tvsw_nowsay);
        tvsw_93 = (TextView) view.findViewById(R.id.tvsw_93);
        tvsw_79 = (TextView) view.findViewById(R.id.tvsw_79);
        tvsw_65 = (TextView) view.findViewById(R.id.tvsw_65);
        tvsw_86 = (TextView) view.findViewById(R.id.tvsw_86);
        tvsw_72 = (TextView) view.findViewById(R.id.tvsw_72);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_attention.setTypeface(customFontBold);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        sw_imgoing = (Switch) view.findViewById(R.id.sw_imgoing);
        sw_nowsay = (Switch) view.findViewById(R.id.sw_nowsay);
        sw_93 = (Switch) view.findViewById(R.id.sw_93);
        sw_72 = (Switch) view.findViewById(R.id.sw_72);
        sw_86 = (Switch) view.findViewById(R.id.sw_86);
        sw_65 = (Switch) view.findViewById(R.id.sw_65);
        sw_79 = (Switch) view.findViewById(R.id.sw_79);

        QTSHelp.setFontTV(getActivity(),tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_imgoing, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_nowsay, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_serial, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_65, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_72, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_79, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_86, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_93, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_imgoing, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_nowsay, QTSConstrains.FONT_LATO_REGULAR);

        QTSHelp.setFontTV(getActivity(),tvsw_65, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_72, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_79, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_86, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_93, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_imgoing, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_nowsay, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();

//                QTSHelp.setImGoing(getActivity(),imgoing);
//                QTSHelp.setNowSay(getActivity(),nowsay);
//                QTSHelp.set93(getActivity(),chinba);
//                QTSHelp.set72(getActivity(),bayhai);
//                QTSHelp.set86(getActivity(),tamsau);
//                QTSHelp.set65(getActivity(),saulam);
//                QTSHelp.set79(getActivity(),baychin);

                QTSHelp.setNum(getActivity(),3);
            }
        });

        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Immediate_Recall fragment3 = new FrmHome_Immediate_Recall();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment3);
                fragmentTransaction.commit();

//                QTSHelp.setImGoing(getActivity(),imgoing);
//                QTSHelp.setNowSay(getActivity(),nowsay);
//                QTSHelp.set93(getActivity(),chinba);
//                QTSHelp.set72(getActivity(),bayhai);
//                QTSHelp.set86(getActivity(),tamsau);
//                QTSHelp.set65(getActivity(),saulam);
//                QTSHelp.set79(getActivity(),baychin);

                QTSHelp.setNum(getActivity(),3);
            }
        });

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment1);
                fragmentTransaction.commit();

                QTSHelp.setNum(getActivity(),1);

                QTSHelp.setImGoing(getActivity(),0);
                QTSHelp.setNowSay(getActivity(),0);
                QTSHelp.set93(getActivity(),0);
                QTSHelp.set72(getActivity(),0);
                QTSHelp.set86(getActivity(),0);
                QTSHelp.set65(getActivity(),0);
                QTSHelp.set79(getActivity(),0);
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment1);
                fragmentTransaction.commit();
                QTSHelp.setNum(getActivity(),1);

                QTSHelp.setImGoing(getActivity(),0);
                QTSHelp.setNowSay(getActivity(),0);
                QTSHelp.set93(getActivity(),0);
                QTSHelp.set72(getActivity(),0);
                QTSHelp.set86(getActivity(),0);
                QTSHelp.set65(getActivity(),0);
                QTSHelp.set79(getActivity(),0);
            }
        });

        sw_imgoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkImGoing();
                if (sw_imgoing.isChecked()==true)
                {
                    QTSHelp.setImGoing(getActivity(),imgoing);
                    tvsw_imgoing.setText(getResources().getString(R.string.yes));
                }
                if (sw_imgoing.isChecked()==false)
                {
                    QTSHelp.setImGoing(getActivity(),imgoing);
                    tvsw_imgoing.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_imgoing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkImGoing();
                if (sw_imgoing.isChecked()==true)
                {
                    QTSHelp.setImGoing(getActivity(),imgoing);
                    tvsw_imgoing.setText(getResources().getString(R.string.yes));
                }
                if (sw_imgoing.isChecked()==false)
                {
                    QTSHelp.setImGoing(getActivity(),imgoing);
                    tvsw_imgoing.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_nowsay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNowSay();
                if (sw_nowsay.isChecked()==true)
                {
                    QTSHelp.setNowSay(getActivity(),nowsay);
                    tvsw_nowsay.setText(getResources().getString(R.string.yes));
                }
                if (sw_nowsay.isChecked()==false)
                {
                    QTSHelp.setNowSay(getActivity(),nowsay);
                    tvsw_nowsay.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_nowsay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkNowSay();
                if (sw_nowsay.isChecked()==true)
                {
                    QTSHelp.setNowSay(getActivity(),nowsay);
                    tvsw_nowsay.setText(getResources().getString(R.string.yes));
                }
                if (sw_nowsay.isChecked()==false)
                {
                    QTSHelp.setNowSay(getActivity(),nowsay);
                    tvsw_nowsay.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkChinBa();
                if (sw_93.isChecked()==true)
                {
                    QTSHelp.set93(getActivity(),chinba);
                    tvsw_93.setText(getResources().getString(R.string.yes));
                }
                if (sw_93.isChecked()==false)
                {
                    QTSHelp.set93(getActivity(),chinba);
                    tvsw_93.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_93.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkChinBa();
                if (sw_93.isChecked()==true)
                {
                    QTSHelp.set93(getActivity(),chinba);
                    tvsw_93.setText(getResources().getString(R.string.yes));
                }
                if (sw_93.isChecked()==false)
                {
                    QTSHelp.set93(getActivity(),chinba);
                    tvsw_93.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBayHai();
                if (sw_72.isChecked()==true)
                {
                    QTSHelp.set72(getActivity(),bayhai);
                    tvsw_72.setText(getResources().getString(R.string.yes));
                }
                if (sw_72.isChecked()==false)
                {
                    QTSHelp.set72(getActivity(),bayhai);
                    tvsw_72.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_72.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBayHai();
                if (sw_72.isChecked()==true)
                {
                    QTSHelp.set72(getActivity(),bayhai);
                    tvsw_72.setText(getResources().getString(R.string.yes));
                }
                if (sw_72.isChecked()==false)
                {
                    QTSHelp.set72(getActivity(),bayhai);
                    tvsw_72.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTamSau();
                if (sw_86.isChecked()==true)
                {
                    QTSHelp.set86(getActivity(),tamsau);
                    tvsw_86.setText(getResources().getString(R.string.yes));
                }
                if (sw_86.isChecked()==false)
                {
                    QTSHelp.set86(getActivity(),tamsau);
                    tvsw_86.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_86.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkTamSau();
                if (sw_86.isChecked()==true)
                {
                    QTSHelp.set86(getActivity(),tamsau);
                    tvsw_86.setText(getResources().getString(R.string.yes));
                }
                if (sw_86.isChecked()==false)
                {
                    QTSHelp.set86(getActivity(),tamsau);
                    tvsw_86.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSauLam();
                if (sw_65.isChecked()==true)
                {
                    QTSHelp.set65(getActivity(),saulam);
                    tvsw_65.setText(getResources().getString(R.string.yes));
                }
                if (sw_65.isChecked()==false)
                {
                    QTSHelp.set65(getActivity(),saulam);
                    tvsw_65.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_65.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkSauLam();
                if (sw_65.isChecked()==true)
                {
                    QTSHelp.set65(getActivity(),saulam);
                    tvsw_65.setText(getResources().getString(R.string.yes));
                }
                if (sw_65.isChecked()==false)
                {
                    QTSHelp.set65(getActivity(),saulam);
                    tvsw_65.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBayChin();
                if (sw_79.isChecked()==true)
                {
                    QTSHelp.set79(getActivity(),baychin);
                    tvsw_79.setText(getResources().getString(R.string.yes));
                }
                if (sw_79.isChecked()==false)
                {
                    QTSHelp.set79(getActivity(),baychin);
                    tvsw_79.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_79.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBayChin();
                if (sw_79.isChecked()==true)
                {
                    QTSHelp.set79(getActivity(),baychin);
                    tvsw_79.setText(getResources().getString(R.string.yes));
                }
                if (sw_79.isChecked()==false)
                {
                    QTSHelp.set79(getActivity(),baychin);
                    tvsw_79.setText(getResources().getString(R.string.no));
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

    private void checkImGoing(){
        if (sw_imgoing.isChecked()==true){
            imgoing = 1;
        }else if (sw_imgoing.isChecked()==false){
            imgoing = 0;
        }
    }

    private void checkNowSay(){
        if (sw_nowsay.isChecked()==true){
            nowsay = 1;
        }else if (sw_nowsay.isChecked()==false){
            nowsay = 0;
        }
    }

    private void checkChinBa(){
        if (sw_93.isChecked()==true){
            chinba = 1;
        }else if (sw_93.isChecked()==false){
            chinba = 0;
        }
    }

    private void checkBayHai(){
        if (sw_72.isChecked()==true){
            bayhai = 1;
        }else if (sw_72.isChecked()==false){
            bayhai = 0;
        }
    }

    private void checkTamSau(){
        if (sw_86.isChecked()==true){
            tamsau = 1;
        }else if (sw_86.isChecked()==false){
            tamsau = 0;
        }
    }

    private void checkSauLam(){
        if (sw_65.isChecked()==true){
            saulam = 1;
        }else if (sw_65.isChecked()==false){
            saulam = 0;
        }
    }

    private void checkBayChin(){
        if (sw_79.isChecked()==true){
            baychin = 1;
        }else if (sw_79.isChecked()==false){
            baychin = 0;
        }
    }

    private void backFrm(){
        if (QTSHelp.getImGoing(getActivity())==1)
        {
            sw_imgoing.setChecked(true);
            imgoing=1;
            tvsw_imgoing.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getImGoing(getActivity())==0)
        {
            sw_imgoing.setChecked(false);
            imgoing=0;
            tvsw_imgoing.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getNowSay(getActivity())==1)
        {
            sw_nowsay.setChecked(true);
            nowsay=1;
            tvsw_nowsay.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getNowSay(getActivity())==0)
        {
            sw_nowsay.setChecked(false);
            nowsay=0;
            tvsw_nowsay.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.get93(getActivity())==1)
        {
            sw_93.setChecked(true);
            chinba=1;
            tvsw_93.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.get93(getActivity())==0)
        {
            sw_93.setChecked(false);
            chinba=0;
            tvsw_93.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.get72(getActivity())==1)
        {
            sw_72.setChecked(true);
            bayhai=1;
            tvsw_72.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.get72(getActivity())==0)
        {
            sw_72.setChecked(false);
            bayhai=0;
            tvsw_72.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.get86(getActivity())==1)
        {
            sw_86.setChecked(true);
            tamsau=1;
            tvsw_86.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.get86(getActivity())==0)
        {
            sw_86.setChecked(false);
            tamsau=0;
            tvsw_86.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.get65(getActivity())==1)
        {
            sw_65.setChecked(true);
            saulam=1;
            tvsw_65.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.get65(getActivity())==0)
        {
            sw_65.setChecked(false);
            saulam=0;
            tvsw_65.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.get79(getActivity())==1)
        {
            sw_79.setChecked(true);
            baychin=1;
            tvsw_79.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.get79(getActivity())==0)
        {
            sw_79.setChecked(false);
            baychin=0;
            tvsw_79.setText(getResources().getString(R.string.no));
        }
    }
}
