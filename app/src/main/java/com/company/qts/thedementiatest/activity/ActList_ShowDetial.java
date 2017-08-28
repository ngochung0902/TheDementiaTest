package com.company.qts.thedementiatest.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.database.SQLiteSource;
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class ActList_ShowDetial extends AppCompatActivity {
    private TextView tv_name,tv_isperson,tv_dateofbirth,tv_education,tv_sex,tv_score,tv_ethnicity,tv_age,tv_work,tv_back,tv_textcount,tv_share,
    tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9;
    private ImageView img_back;
    private SQLiteSource datasource;
    private int ID,gt,pe;
    private String w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_list_show_detial);
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
        tv_score = (TextView) findViewById(R.id.tv_score);
        tv_textcount = (TextView) findViewById(R.id.tv_textcount);
        tv_share = (TextView) findViewById(R.id.tv_share);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_5 = (TextView) findViewById(R.id.tv_5);
        tv_6 = (TextView) findViewById(R.id.tv_6);
        tv_7 = (TextView) findViewById(R.id.tv_7);
        tv_8 = (TextView) findViewById(R.id.tv_8);
        tv_9 = (TextView) findViewById(R.id.tv_9);
        datasource = new SQLiteSource(this);
        datasource.open();

        ID = getIntent().getExtras().getInt("id");
        tv_name.setText(getIntent().getExtras().get("name").toString());
//        tv_isperson.setText(getIntent().getExtras().get("person").toString());
        pe = Integer.parseInt(getIntent().getExtras().get("person").toString());
        if (pe==0)
        {
            tv_isperson.setText("No");
        }
        else
        {
            tv_isperson.setText("Yes");
        }
        tv_dateofbirth.setText(getIntent().getExtras().get("dateofbirth").toString());
        tv_education.setText(getIntent().getExtras().get("levelofeducation").toString());
//        tv_sex.setText(getIntent().getExtras().get("sex").toString());

        gt = Integer.parseInt(getIntent().getExtras().get("sex").toString());
        if (pe==0)
        {
            tv_sex.setText("Female");
        }
        else
        {
            tv_sex.setText("Male");
        }

        tv_ethnicity.setText(getIntent().getExtras().get("ethnicity").toString());
        tv_age.setText(getIntent().getExtras().get("age").toString());
        tv_score.setText(getIntent().getExtras().get("work").toString());
        tv_textcount.setText(getIntent().getExtras().get("count").toString());
        tv_work.setText(getIntent().getExtras().get("textcount").toString());
        w = getIntent().getExtras().get("work").toString();

        QTSHelp.setFontTV(this,tv_name, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_isperson, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_dateofbirth, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_education, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_sex, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_ethnicity, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_age, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_textcount, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_work, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_share, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_back, QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_1,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_2,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_3,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_4,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_5,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_6,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_7,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_8,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_9,QTSConstrains.FONT_LATO_REGULAR);
        QTSHelp.setFontTV(this,tv_score,QTSConstrains.FONT_LATO_REGULAR);

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

        img_back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        img_back.setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
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

        tv_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,"Name: "+tv_name.getText().toString()+"\nIs Person Alert? "+tv_isperson.getText().toString() +"\nDate of birth: "+tv_dateofbirth.getText().toString()+"\nLevel of Education "+tv_education.getText().toString()+"\nSex: "+tv_sex.getText().toString()+"\nEthnicity: "+tv_ethnicity.getText().toString()+"\nAge: "+tv_age.getText().toString()+"\nWork:"+tv_work.getText().toString()+"\n "+tv_textcount.getText().toString());
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        }
    }

