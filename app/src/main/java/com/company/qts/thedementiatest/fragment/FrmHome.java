package com.company.qts.thedementiatest.fragment;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSHelp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FrmHome extends Fragment {
    private ImageView img_next;
    private TextView tv_next,tv_dateofbirth,tv_Levelofeducation,tv_sex,tv_ethnicity,tv_work;
    private Switch sw_sex,sw_person;
    private EditText edt_name,edt_age;
    private int sex ,ispeson ;

    private DatePickerDialog fromDatePickerDialog;
    private SimpleDateFormat dateFormatter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home, container, false);
        img_next = (ImageView) view.findViewById(R.id.img_next);
        tv_next = (TextView) view.findViewById(R.id.tv_next);
        tv_dateofbirth = (TextView) view.findViewById(R.id.tv_dateofbirth);
        tv_Levelofeducation = (TextView) view.findViewById(R.id.tv_Levelofeducation);
        tv_sex = (TextView) view.findViewById(R.id.tv_sex);
        sw_sex = (Switch) view.findViewById(R.id.sw_sex);
        sw_person = (Switch) view.findViewById(R.id.sw_person);
        tv_ethnicity = (TextView) view.findViewById(R.id.tv_ethnicity);
        tv_work = (TextView) view.findViewById(R.id.tv_work);
        edt_name = (EditText) view.findViewById(R.id.edt_name);
        edt_age = (EditText) view.findViewById(R.id.edt_age);
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        setDateTimeField();
        tv_dateofbirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fromDatePickerDialog.show();
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
                                        FrmHome1 fragment1 = new FrmHome1();
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
                                        FrmHome1 fragment1 = new FrmHome1();
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

        return view;
    }

    private void setDateTimeField() {
        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                tv_dateofbirth.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }

    private void selectEducation() {
        final CharSequence[] itemEducation = {"Preschool", "Primary education","Middle school","Secondary school","Post-secondary education"};
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
            QTSHelp.showToast(getActivity(),sex+"sex");
        }else if (sw_sex.isChecked()==false){
            tv_sex.setText("Female");
            sex = 0;
            QTSHelp.showToast(getActivity(),sex+"sex");
        }
    }

    private void isPerson(){
        if (sw_person.isChecked()==true){
            ispeson = 1;
            QTSHelp.showToast(getActivity(),ispeson+"ispeson");
        }else if (sw_person.isChecked()==false){
            ispeson = 0;
            QTSHelp.showToast(getActivity(),ispeson+"ispeson");
        }
    }

    private void selectEthnicity(){
        final CharSequence[] itemEthnicity = {"White", "Black", "Yellow"};
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
        final CharSequence[] itemWork= {"Prof", "Tech", "Mgr","Cler","Saled","Skilled","SemiSkilled","Unskilled"};
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
