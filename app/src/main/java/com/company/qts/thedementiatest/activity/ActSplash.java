package com.company.qts.thedementiatest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class ActSplash extends AppCompatActivity {
    private ImageView img_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        getWidthHeight();
        QTSHelp.setLayoutView(img_logo,QTSHelp.GetWidthDevice(this),QTSHelp.GetWidthDevice(this)/2);
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                            wait(QTSConstrains.Splash_Time);
                            Intent intent = new Intent(ActSplash.this, ActHome.class);
                            startActivity(intent);
                        QTSHelp.setName(ActSplash.this,"");
                        QTSHelp.setIsPerSon(ActSplash.this,-1);
                        QTSHelp.setDateOfBirth(ActSplash.this,"");
                        QTSHelp.setLevelOfEducation(ActSplash.this,"");
                        QTSHelp.setSex(ActSplash.this,-1);
                        QTSHelp.setEthnicity(ActSplash.this,"");
                        QTSHelp.setAge(ActSplash.this,"");
                        QTSHelp.setWork(ActSplash.this,"");

                        QTSHelp.setWhatday(ActSplash.this,-1);
                        QTSHelp.setWhatMonth(ActSplash.this,-1);
                        QTSHelp.setYear(ActSplash.this,-1);
                        QTSHelp.setWhatSate(ActSplash.this,-1);
                        QTSHelp.setWhois(ActSplash.this,-1);

                        QTSHelp.setImGoing(ActSplash.this,-1);
                        QTSHelp.setNowSay(ActSplash.this,-1);
                        QTSHelp.set93(ActSplash.this,-1);
                        QTSHelp.set72(ActSplash.this,-1);
                        QTSHelp.set86(ActSplash.this,-1);
                        QTSHelp.set65(ActSplash.this,-1);
                        QTSHelp.set79(ActSplash.this,-1);

                        QTSHelp.setListento(ActSplash.this,-1);

                        QTSHelp.setBeginningWith(ActSplash.this,-1);
                        QTSHelp.setTheCat(ActSplash.this,-1);
                        QTSHelp.setSteveis(ActSplash.this,-1);

                        QTSHelp.setAnimals04(ActSplash.this,-1);
                        QTSHelp.setAnimals59(ActSplash.this,-1);
                        QTSHelp.setAnimals1015(ActSplash.this,-1);

                        QTSHelp.setTamHai(ActSplash.this,-1);
                        QTSHelp.setAdd6(ActSplash.this,-1);
                        QTSHelp.setTake(ActSplash.this,-1);

                        QTSHelp.setLamp(ActSplash.this,-1);
                        QTSHelp.setPhone(ActSplash.this,-1);
                        QTSHelp.setChair(ActSplash.this,-1);
                        QTSHelp.setCar(ActSplash.this,-1);
                        QTSHelp.setHouse(ActSplash.this,-1);

                        QTSHelp.setWhatWould1(ActSplash.this,-1);
                        QTSHelp.setWhatWould2(ActSplash.this,-1);

                        QTSHelp.setAqua(ActSplash.this,-1);
                        QTSHelp.setAwatch(ActSplash.this,-1);
                            finish();
                    }
                } catch (InterruptedException ex) {

                }

            }

        };
        splashTread.start();
    }

    private void initUI() {
        img_logo = (ImageView) findViewById(R.id.img_logo);
    }

    private void getWidthHeight() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int wwidth = displaymetrics.widthPixels;
        QTSHelp.SetHeightDevice(this,height);
        QTSHelp.SetWidthDevice(this,wwidth);
    }
}
