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

public class FrmHome_Fluidity extends Fragment {
    private TextView tv_next,tv_back,tv_fluidity,tv_fl,tv_04,tv_59,tv_1015,tvsw_04animals,tvsw_59animals,tvsw_1015animals;
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

        tvsw_04animals = (TextView) view.findViewById(R.id.tvsw_04animals);
        tvsw_59animals = (TextView) view.findViewById(R.id.tvsw_59animals);
        tvsw_1015animals = (TextView) view.findViewById(R.id.tvsw_1015animals);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
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

        QTSHelp.setFontTV(getActivity(),tvsw_1015animals, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_04animals, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tvsw_59animals, QTSConstrains.FONT_LATO_REGULAR);

        backFrm();

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Calculation fragment6 = new FrmHome_Calculation();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment6);
                fragmentTransaction.commit();

//                QTSHelp.setAnimals04(getActivity(),animals04);
//                QTSHelp.setAnimals59(getActivity(),animals59);
//                QTSHelp.setAnimals1015(getActivity(),animals1015);
                QTSHelp.setNum(getActivity(),6);
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

                QTSHelp.setNum(getActivity(),6);
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

                QTSHelp.setNum(getActivity(),4);

                QTSHelp.setAnimals04(getActivity(),0);
                QTSHelp.setAnimals59(getActivity(),0);
                QTSHelp.setAnimals1015(getActivity(),0);
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

                QTSHelp.setNum(getActivity(),4);

                QTSHelp.setAnimals04(getActivity(),0);
                QTSHelp.setAnimals59(getActivity(),0);
                QTSHelp.setAnimals1015(getActivity(),0);
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
                    QTSHelp.setAnimals04(getActivity(),animals04);
                    tvsw_04animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_04animals.isChecked()==false)
                {
                    QTSHelp.setAnimals04(getActivity(),animals04);
                    tvsw_04animals.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_04animals.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAnimals04();
                if (sw_04animals.isChecked()==true)
                {
                    sw_59animals.setChecked(false);
                    sw_1015animals.setChecked(false);
                    animals59 =0;
                    animals1015=0;
                    QTSHelp.setAnimals04(getActivity(),animals04);
                    tvsw_04animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_04animals.isChecked()==false)
                {
                    QTSHelp.setAnimals04(getActivity(),animals04);
                    tvsw_04animals.setText(getResources().getString(R.string.no));
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
                    QTSHelp.setAnimals59(getActivity(),animals59);
                    tvsw_59animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_59animals.isChecked()==false)
                {
                    QTSHelp.setAnimals59(getActivity(),animals59);
                    tvsw_59animals.setText(getResources().getString(R.string.no));
                }
            }
        });

        sw_59animals.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAnimals59();
                if (sw_59animals.isChecked()==true)
                {
                    sw_04animals.setChecked(false);
                    sw_1015animals.setChecked(false);
                    animals04 =0;
                    animals1015=0;
                    QTSHelp.setAnimals59(getActivity(),animals59);
                    tvsw_59animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_59animals.isChecked()==false)
                {
                    QTSHelp.setAnimals59(getActivity(),animals59);
                    tvsw_59animals.setText(getResources().getString(R.string.no));
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
                    QTSHelp.setAnimals1015(getActivity(),animals1015);
                    tvsw_1015animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_1015animals.isChecked()==false)
                {
                    QTSHelp.setAnimals1015(getActivity(),animals1015);
                    tvsw_1015animals.setText(getResources().getString(R.string.no));
                }
            }
        });


        sw_1015animals.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAnimals1015();
                if (sw_1015animals.isChecked()==true)
                {
                    sw_04animals.setChecked(false);
                    sw_59animals.setChecked(false);
                    animals04 =0;
                    animals59=0;
                    QTSHelp.setAnimals1015(getActivity(),animals1015);
                    tvsw_1015animals.setText(getResources().getString(R.string.yes));
                }
                if (sw_1015animals.isChecked()==false)
                {
                    QTSHelp.setAnimals1015(getActivity(),animals1015);
                    tvsw_1015animals.setText(getResources().getString(R.string.no));
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
            tvsw_04animals.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAnimals04(getActivity())==0)
        {
            sw_04animals.setChecked(false);
            animals04=0;
            tvsw_04animals.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getAnimals59(getActivity())==1)
        {
            sw_59animals.setChecked(true);
            animals59=1;
            tvsw_59animals.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAnimals59(getActivity())==0)
        {
            sw_59animals.setChecked(false);
            animals59=0;
            tvsw_59animals.setText(getResources().getString(R.string.no));
        }

        if (QTSHelp.getAnimals1015(getActivity())==1)
        {
            sw_1015animals.setChecked(true);
            animals1015=1;
            tvsw_1015animals.setText(getResources().getString(R.string.yes));
        }
        if (QTSHelp.getAnimals1015(getActivity())==0)
        {
            sw_1015animals.setChecked(false);
            animals1015=0;
            tvsw_1015animals.setText(getResources().getString(R.string.no));
        }
    }
}
