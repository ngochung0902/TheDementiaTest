package com.company.qts.thedementiatest.fragment;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FrmHome_Examination extends Fragment {
    private ImageView img_next;
    private TextView tv_next,tv_dateofbirth,tv_Levelofeducation,tv_sex,tv_ethnicity,tv_work,edt_age,
            tv_examination,tv_ex,
            tv_showname,tv_showisperson,tv_showdate,tv_showlovel,tv_showsex,tv_showethnicity,tv_showage,work;
    private Switch sw_sex,sw_person;
    private EditText edt_name;
    private int sex ,ispeson, myyear,yearmy;
    private final int yearnow = Calendar.getInstance().get(Calendar.YEAR);

    private DatePickerDialog fromDatePickerDialog;
    private SimpleDateFormat dateFormatter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_examination, container, false);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_examination = (TextView) view.findViewById(R.id.tv_examination);

        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        Typeface customFontR= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_REGULAR);
        tv_examination.setTypeface(customFontBold);

        tv_showname = (TextView) view.findViewById(R.id.tv_showname);
        tv_showisperson = (TextView) view.findViewById(R.id.tv_showisperson);
        tv_showdate = (TextView) view.findViewById(R.id.tv_showdate);
        tv_showlovel = (TextView) view.findViewById(R.id.tv_showlovel);
        tv_showsex = (TextView) view.findViewById(R.id.tv_showsex);
        tv_showethnicity = (TextView) view.findViewById(R.id.tv_showethnicity);
        tv_showage = (TextView) view.findViewById(R.id.tv_showage);
        work = (TextView) view.findViewById(R.id.tv_showwork);




        tv_next = (TextView) view.findViewById(R.id.tv_next);
        tv_dateofbirth = (TextView) view.findViewById(R.id.tv_dateofbirth);
        tv_Levelofeducation = (TextView) view.findViewById(R.id.tv_Levelofeducation);
        tv_sex = (TextView) view.findViewById(R.id.tv_sex);
        sw_sex = (Switch) view.findViewById(R.id.sw_sex);
        sw_person = (Switch) view.findViewById(R.id.sw_person);
        tv_ethnicity = (TextView) view.findViewById(R.id.tv_ethnicity);
        tv_work = (TextView) view.findViewById(R.id.tv_work);
        edt_name = (EditText) view.findViewById(R.id.edt_name);
        edt_age = (TextView) view.findViewById(R.id.edt_age);
        dateFormatter = new SimpleDateFormat("MM-dd-yyyy", Locale.US);
        tv_ex = (TextView) view.findViewById(R.id.tv_ex);
        setDateTimeField();

        tv_dateofbirth.setTypeface(customFontR);
        tv_ethnicity.setTypeface(customFontR);
        tv_Levelofeducation.setTypeface(customFontR);
        tv_next.setTypeface(customFontR);
        tv_sex.setTypeface(customFontR);
        tv_work.setTypeface(customFontR);
        tv_ex.setTypeface(customFontR);
        edt_age.setTypeface(customFontR);
        edt_name.setTypeface(customFontR);
        sw_person.setTypeface(customFontR);
        sw_sex.setTypeface(customFontR);

        QTSHelp.setFontTV(getActivity(),tv_showname, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showisperson, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showdate, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showlovel, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showsex, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showethnicity, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_showage, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),work, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_next, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),tv_ex,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_person,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(getActivity(),sw_sex,QTSConstrains.FONT_LATO_REGULAR);


        tv_dateofbirth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                fromDatePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                fromDatePickerDialog.show();
                yearmy =fromDatePickerDialog.getDatePicker().getYear();
            }
        });

        tv_sex.setText("Female");


        backFrm();
        img_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_name.getText().toString().trim().length()==0)
                {
                    QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.nameerror));
                }
                else
                {
                    if(tv_dateofbirth.getText().toString().trim().length()==0)
                    {
                        QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.dateofbirtherror));
                    }
                    else
                    {
                        if (tv_Levelofeducation.getText().toString().trim().length()==0)
                        {
                            QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.LevelofEducationerror));
                        }
                        else
                        {
                            if (tv_ethnicity.getText().toString().trim().length()==0)
                            {
                                QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.Ethnicityerror));
                            }
                            else
                            {
                                if (tv_work.getText().toString().trim().length()==0)
                                {
                                    QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.workerror));
                                }
                                else
                                {
                                    if (edt_age.getText().toString().trim().length()==0)
                                    {
                                        QTSHelp.showpPopupMessage(getActivity(), String.valueOf(R.string.ageerror));
                                    }
                                    else
                                    {
                                        FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                                        FragmentManager fragmentManager = getFragmentManager();
                                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                        fragmentTransaction.replace(R.id.main_container, fragment1);
                                        fragmentTransaction.commit();

                                        QTSHelp.setName(getActivity(),edt_name.getText().toString());
                                        QTSHelp.setIsPerSon(getActivity(),ispeson);
                                        QTSHelp.setDateOfBirth(getActivity(),tv_dateofbirth.getText().toString());
                                        QTSHelp.setLevelOfEducation(getActivity(),tv_Levelofeducation.getText().toString());
                                        QTSHelp.setSex(getActivity(),sex);
                                        QTSHelp.setEthnicity(getActivity(),tv_ethnicity.getText().toString());
                                        QTSHelp.setAge(getActivity(),edt_age.getText().toString());
                                        QTSHelp.setWork(getActivity(),tv_work.getText().toString());
                                    }
                                }
                            }
                        }
                    }

                }
            }
        });

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("DateTime",myyear+"myyear");
                Log.e("DateTime",yearmy+"yearmy");
                if (edt_name.getText().toString().trim().length()==0)
                {
                    QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.nameerror));
                }
                else
                {
                    if(tv_dateofbirth.getText().toString().trim().length()==0)
                    {
                        QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.dateofbirtherror));
                    }
                    else
                    {
                        if (tv_Levelofeducation.getText().toString().trim().length()==0)
                        {
                            QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.LevelofEducationerror));
                        }
                        else
                        {
                            if (tv_ethnicity.getText().toString().trim().length()==0)
                            {
                                QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.Ethnicityerror));
                            }
                            else
                            {
                                if (tv_work.getText().toString().trim().length()==0)
                                {
                                    QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.workerror));
                                }
                                else
                                {
                                    if (edt_age.getText().toString().trim().length()==0)
                                    {
                                        QTSHelp.showpPopupMessage(getActivity(), getResources().getString(R.string.ageerror));
                                    }
                                    else
                                    {
                                        FrmHome_Orientation fragment1 = new FrmHome_Orientation();
                                        FragmentManager fragmentManager = getFragmentManager();
                                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                        fragmentTransaction.replace(R.id.main_container, fragment1);
                                        fragmentTransaction.commit();

                                        QTSHelp.setName(getActivity(),edt_name.getText().toString());
                                        QTSHelp.setIsPerSon(getActivity(),ispeson);
                                        QTSHelp.setDateOfBirth(getActivity(),tv_dateofbirth.getText().toString());
                                        QTSHelp.setLevelOfEducation(getActivity(),tv_Levelofeducation.getText().toString());
                                        QTSHelp.setSex(getActivity(),sex);
                                        QTSHelp.setEthnicity(getActivity(),tv_ethnicity.getText().toString());
                                        QTSHelp.setAge(getActivity(),edt_age.getText().toString());
                                        QTSHelp.setWork(getActivity(),tv_work.getText().toString());
                                    }
                                }
                            }
                        }
                    }

                }
            }
        });

        tv_Levelofeducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectEducation();
            }
        });

        sw_sex.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                selectSex();
            }
        });

        sw_sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectSex();
            }
        });
        sw_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPerson();
            }
        });
        sw_person.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isPerson();
            }
        });

        tv_ethnicity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectEthnicity();
            }
        });

        tv_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectWork();
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

    private void setDateTimeField() {
        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                tv_dateofbirth.setText(dateFormatter.format(newDate.getTime()));
                myyear = year;
                int b = yearnow - year;
                edt_age.setText(b+"");
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }

    private void selectEducation() {
        final CharSequence[] itemEducation = {"Less than High School", "High School","Some College and Technical","College Degree","Profestional Degree"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("SELECT EDUCATION");
        builder.setItems(itemEducation, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                tv_Levelofeducation.setText(itemEducation[item]);
            }
        });
        builder.show();
    }

    private void selectSex(){
        if (sw_sex.isChecked()==true){
            tv_sex.setText("Male");
            sex = 1;
        }else if (sw_sex.isChecked()==false){
            tv_sex.setText("Female");
            sex = 0;
        }
    }

    private void isPerson(){
        if (sw_person.isChecked()==true){
            ispeson = 1;
        }else if (sw_person.isChecked()==false){
            ispeson = 0;
        }
    }

    private void selectEthnicity(){
        final CharSequence[] itemEthnicity = {"Black","White","Hispanic","Asian/parafic Islander", "Native American","Other"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("SELECT ETHNICITY");
        builder.setItems(itemEthnicity, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                tv_ethnicity.setText(itemEthnicity[item]);
            }
        });
        builder.show();
    }

    private void selectWork(){
        final CharSequence[] itemWork= {"Profesion/Technical", "Managemnt", "Clerical","Sales","Skilled","Semi-Skilled","Unskilled"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("SELECT WORK");
        builder.setItems(itemWork, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                tv_work.setText(itemWork[item]);
            }
        });
        builder.show();
    }

    private void backFrm(){
        if (QTSHelp.getName(getActivity())!="null")
        {
            edt_name.setText(QTSHelp.getName(getActivity()));
        }
        if (QTSHelp.getIsPerSon(getActivity())==1)
        {
            sw_person.setChecked(true);
            ispeson=1;
        }
        if (QTSHelp.getIsPerSon(getActivity())==0)
        {
            sw_person.setChecked(false);
            ispeson=0;
        }
        if (QTSHelp.getDateOfBirth(getActivity())!="null")
        {
            tv_dateofbirth.setText(QTSHelp.getDateOfBirth(getActivity()));
        }
        if (QTSHelp.getLevelOfEducation(getActivity())!="null")
        {
            tv_Levelofeducation.setText(QTSHelp.getLevelOfEducation(getActivity()));
        }
        if (QTSHelp.getSex(getActivity())==1)
        {
            sw_sex.setChecked(true);
            tv_sex.setText("Male");
            sex=1;
        }
        if (QTSHelp.getSex(getActivity())==0)
        {
            sw_sex.setChecked(false);
            tv_sex.setText("Female");
            sex=0;
        }
        if (QTSHelp.getEthnicity(getActivity())!="null")
        {
            tv_ethnicity.setText(QTSHelp.getEthnicity(getActivity()));
        }
        if (QTSHelp.getAge(getActivity())!="null")
        {
            edt_age.setText(QTSHelp.getAge(getActivity()));
        }
        if (QTSHelp.getWork(getActivity())!="null")
        {
            tv_work.setText(QTSHelp.getWork(getActivity()));
        }
    }
}