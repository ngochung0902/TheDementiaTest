package thedementiatest.activity;

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

import com.thedementiatest.R;

import java.lang.reflect.Field;

import thedementiatest.fragment.FrmAuthor;
import thedementiatest.fragment.FrmHome_Abstract_Reasoning;
import thedementiatest.fragment.FrmHome_Attention;
import thedementiatest.fragment.FrmHome_Calculation;
import thedementiatest.fragment.FrmHome_Delayed_Recall;
import thedementiatest.fragment.FrmHome_Examination;
import thedementiatest.fragment.FrmHome_Fluidity;
import thedementiatest.fragment.FrmHome_Immediate_Recall;
import thedementiatest.fragment.FrmHome_Judgment;
import thedementiatest.fragment.FrmHome_Language;
import thedementiatest.fragment.FrmHome_Orientation;
import thedementiatest.fragment.FrmHome_Score;
import thedementiatest.fragment.FrmInstructions;
import thedementiatest.fragment.FrmList;
import thedementiatest.fragment.FrmTool;
import thedementiatest.helper.QTSHelp;

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
                        if (QTSHelp.getNum(ActHome.this)==0 )
                        {
                            fragment = new FrmHome_Examination();
                        }
                        if (QTSHelp.getNum(ActHome.this)==1 )
                        {
                            fragment = new FrmHome_Orientation();
                        }
                        if (QTSHelp.getNum(ActHome.this)==2 )
                        {
                            fragment = new FrmHome_Attention();
                        }
                        if (QTSHelp.getNum(ActHome.this)==3 )
                        {
                            fragment = new FrmHome_Immediate_Recall();
                        }
                        if (QTSHelp.getNum(ActHome.this)==4 )
                        {
                            fragment = new FrmHome_Language();
                        }
                        if (QTSHelp.getNum(ActHome.this)==5 )
                        {
                            fragment = new FrmHome_Fluidity();
                        }
                        if (QTSHelp.getNum(ActHome.this)==6 )
                        {
                            fragment = new FrmHome_Calculation();
                        }
                        if (QTSHelp.getNum(ActHome.this)==7 )
                        {
                            fragment = new FrmHome_Delayed_Recall();
                        }
                        if (QTSHelp.getNum(ActHome.this)==8 )
                        {
                            fragment = new FrmHome_Judgment();
                        }
                        if (QTSHelp.getNum(ActHome.this)==9 )
                        {
                            fragment = new FrmHome_Abstract_Reasoning();
                        }
                        if (QTSHelp.getNum(ActHome.this)==10 )
                        {
                            fragment = new FrmHome_Score();
                        }
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
