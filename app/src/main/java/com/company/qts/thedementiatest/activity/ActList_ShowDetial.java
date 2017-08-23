package com.company.qts.thedementiatest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.database.SQLiteSource;

public class ActList_ShowDetial extends AppCompatActivity {
    private TextView tv_name,tv_isperson,tv_dateofbirth,tv_education,tv_sex,tv_ethnicity,tv_age,tv_work,tv_back,tv_textcount;
    private ImageView img_back;
    private SQLiteSource datasource;
    private int ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_list_show_detial);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_isperson = (TextView) findViewById(R.id.tv_isperson);
        tv_dateofbirth = (TextView) findViewById(R.id.tv_dateofbirth);
        tv_education = (TextView) findViewById(R.id.tv_education);
        tv_sex = (TextView) findViewById(R.id.tv_sex);
        tv_ethnicity = (TextView) findViewById(R.id.tv_ethnicity);
        tv_age = (TextView) findViewById(R.id.tv_age);
        tv_work = (TextView) findViewById(R.id.tv_work);
        tv_back = (TextView) findViewById(R.id.tv_back);
        img_back = (ImageView) findViewById(R.id.img_back);
        tv_textcount = (TextView) findViewById(R.id.tv_textcount);
        datasource = new SQLiteSource(this);
        datasource.open();

        ID = getIntent().getExtras().getInt("id");
        tv_name.setText(getIntent().getExtras().get("name").toString());
        tv_isperson.setText(getIntent().getExtras().get("person").toString());
        tv_dateofbirth.setText(getIntent().getExtras().get("dateofbirth").toString());
        tv_education.setText(getIntent().getExtras().get("levelofeducation").toString());
        tv_sex.setText(getIntent().getExtras().get("sex").toString());
        tv_ethnicity.setText(getIntent().getExtras().get("ethnicity").toString());
        tv_age.setText(getIntent().getExtras().get("age").toString());
        tv_textcount.setText(getIntent().getExtras().get("count").toString()+"\n"+getIntent().getExtras().get("textcount").toString());
        tv_work.setText(getIntent().getExtras().get("textcount").toString());

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        }
    }

