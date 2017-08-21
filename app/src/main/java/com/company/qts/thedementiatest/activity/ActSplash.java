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
