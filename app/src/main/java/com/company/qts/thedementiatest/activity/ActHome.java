package com.company.qts.thedementiatest.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.fragment.FrmAuthor;
import com.company.qts.thedementiatest.fragment.FrmHome_Examination;
import com.company.qts.thedementiatest.fragment.FrmInstructions;
import com.company.qts.thedementiatest.fragment.FrmList;
import com.company.qts.thedementiatest.fragment.FrmTool;

import java.lang.reflect.Field;

public class ActHome extends AppCompatActivity {
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private static final String TAG = ActHome.class.getSimpleName();
    private BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_home);


        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        TextView textView = (TextView) bottomNavigation.findViewById(R.id.action_home).findViewById(R.id.largeLabel);
        textView.setTextSize(12);
        TextView textView1 = (TextView) bottomNavigation.findViewById(R.id.action_author).findViewById(R.id.largeLabel);
        textView1.setTextSize(12);
        TextView textView2 = (TextView) bottomNavigation.findViewById(R.id.action_tool).findViewById(R.id.largeLabel);
        textView2.setTextSize(12);
        TextView textView3 = (TextView) bottomNavigation.findViewById(R.id.action_instruction).findViewById(R.id.largeLabel);
        textView3.setTextSize(12);
        TextView textView4 = (TextView) bottomNavigation.findViewById(R.id.action_list).findViewById(R.id.largeLabel);
        textView4.setTextSize(12);


        disableShiftMode(bottomNavigation);
        fragmentManager = getSupportFragmentManager();
        fragment = new FrmHome_Examination();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_container, fragment).commit();
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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

    public void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e(TAG, "Unable to get shift mode field");
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Unable to change value of shift mode");
        }
    }
}
