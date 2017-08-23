package com.company.qts.thedementiatest.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TabHost;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.fragment.FrmAuthor;
import com.company.qts.thedementiatest.fragment.FrmHome_Examination;
import com.company.qts.thedementiatest.fragment.FrmInstructions;
import com.company.qts.thedementiatest.fragment.FrmList;
import com.company.qts.thedementiatest.fragment.FrmTool;

public class ActHome extends AppCompatActivity {
    private TabHost tabHost;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_home);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        fragmentManager = getSupportFragmentManager();
        fragment = new FrmHome_Examination();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_container, fragment).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        fragment = new FrmHome_Examination();
                        break;
                    case R.id.action_author:
                        fragment = new FrmAuthor();
                        break;
                    case R.id.action_tool:
                        fragment = new FrmTool();
                        break;
                    case R.id.action_instruction:
                        fragment = new FrmInstructions();
                        break;
                    case R.id.action_list:
                        fragment = new FrmList();
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}
