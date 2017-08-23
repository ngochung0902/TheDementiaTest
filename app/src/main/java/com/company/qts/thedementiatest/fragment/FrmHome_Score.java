package com.company.qts.thedementiatest.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.database.SQLiteSource;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmHome_Score extends Fragment {
    private TextView tv_back,tv_number,tv_showtext;
    private ImageView img_back;
    private Button bt_share,bt_save;
    private SQLiteSource datasource;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_home_score, container, false);
        tv_back = (TextView) view.findViewById(R.id.tv_back);
        img_back = (ImageView) view.findViewById(R.id.img_back);
        bt_save = (Button) view.findViewById(R.id.bt_save);
        bt_share = (Button) view.findViewById(R.id.bt_share);
        tv_number = (TextView) view.findViewById(R.id.tv_number);
        tv_showtext = (TextView) view.findViewById(R.id.tv_showtext);
        datasource = new SQLiteSource(getActivity());
        datasource.open();
        final Resources resources = getContext().getResources();
        tv_number.setText(QTSHelp.getNumberCount(getActivity())+"/30");
        int a = Integer.parseInt(QTSHelp.getNumberCount(getActivity()));
        if (a<=15)
        {

            tv_showtext.setText(resources.getString(R.string.SeriousCognitiveImpairment15));
        }
        else
        {
            if (15< a && a<=20)
            {
                tv_showtext.setText(resources.getString(R.string.ModerateCognitive1520));
            }
            else
            {
                if (20<a && a<=25)
                {
                    tv_showtext.setText(resources.getString(R.string.Personisdiminished2025));
                }
                else
                {
                    if (a>26)
                    {
                        tv_showtext.setText(resources.getString(R.string.NoImpairmentNoted26));
                    }
                }
            }
        }

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Abstract_Reasoning fragment9 = new FrmHome_Abstract_Reasoning();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment9);
                fragmentTransaction.commit();
            }
        });

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrmHome_Abstract_Reasoning fragment9 = new FrmHome_Abstract_Reasoning();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment9);
                fragmentTransaction.commit();
            }
        });

        bt_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Text");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                startActivity(Intent.createChooser(sharingIntent, "Share using"));

                QTSHelp.setName(getActivity(),"");
                QTSHelp.setIsPerSon(getActivity(),-1);
                QTSHelp.setDateOfBirth(getActivity(),"");
                QTSHelp.setLevelOfEducation(getActivity(),"");
                QTSHelp.setSex(getActivity(),-1);
                QTSHelp.setEthnicity(getActivity(),"");
                QTSHelp.setAge(getActivity(),"");
                QTSHelp.setWork(getActivity(),"");

                QTSHelp.setWhatday(getActivity(),-1);
                QTSHelp.setWhatMonth(getActivity(),-1);
                QTSHelp.setYear(getActivity(),-1);
                QTSHelp.setWhatSate(getActivity(),-1);
                QTSHelp.setWhois(getActivity(),-1);

                QTSHelp.setImGoing(getActivity(),-1);
                QTSHelp.setNowSay(getActivity(),-1);
                QTSHelp.set93(getActivity(),-1);
                QTSHelp.set72(getActivity(),-1);
                QTSHelp.set86(getActivity(),-1);
                QTSHelp.set65(getActivity(),-1);
                QTSHelp.set79(getActivity(),-1);

                QTSHelp.setListento(getActivity(),-1);

                QTSHelp.setBeginningWith(getActivity(),-1);
                QTSHelp.setTheCat(getActivity(),-1);
                QTSHelp.setSteveis(getActivity(),-1);

                QTSHelp.setAnimals04(getActivity(),-1);
                QTSHelp.setAnimals59(getActivity(),-1);
                QTSHelp.setAnimals1015(getActivity(),-1);

                QTSHelp.setTamHai(getActivity(),-1);
                QTSHelp.setAdd6(getActivity(),-1);
                QTSHelp.setTake(getActivity(),-1);

                QTSHelp.setLamp(getActivity(),-1);
                QTSHelp.setPhone(getActivity(),-1);
                QTSHelp.setChair(getActivity(),-1);
                QTSHelp.setCar(getActivity(),-1);
                QTSHelp.setHouse(getActivity(),-1);

                QTSHelp.setWhatWould1(getActivity(),-1);
                QTSHelp.setWhatWould2(getActivity(),-1);

                QTSHelp.setAqua(getActivity(),-1);
                QTSHelp.setAwatch(getActivity(),-1);
            }
        });

        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                datasource.add(QTSHelp.getName(getActivity()), QTSHelp.getIsPerSon(getActivity())+"", QTSHelp.getDateOfBirth(getActivity()), QTSHelp.getLevelOfEducation(getActivity()),QTSHelp.getSex(getActivity())+"",QTSHelp.getEthnicity(getActivity()),QTSHelp.getAge(getActivity()),tv_number.getText().toString(),tv_showtext.getText().toString(),QTSHelp.getWork(getActivity()));

                FrmList fragment9 = new FrmList();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container, fragment9);
                fragmentTransaction.commit();

                QTSHelp.setName(getActivity(),"");
                QTSHelp.setIsPerSon(getActivity(),-1);
                QTSHelp.setDateOfBirth(getActivity(),"");
                QTSHelp.setLevelOfEducation(getActivity(),"");
                QTSHelp.setSex(getActivity(),-1);
                QTSHelp.setEthnicity(getActivity(),"");
                QTSHelp.setAge(getActivity(),"");
                QTSHelp.setWork(getActivity(),"");

                QTSHelp.setWhatday(getActivity(),-1);
                QTSHelp.setWhatMonth(getActivity(),-1);
                QTSHelp.setYear(getActivity(),-1);
                QTSHelp.setWhatSate(getActivity(),-1);
                QTSHelp.setWhois(getActivity(),-1);

                QTSHelp.setImGoing(getActivity(),-1);
                QTSHelp.setNowSay(getActivity(),-1);
                QTSHelp.set93(getActivity(),-1);
                QTSHelp.set72(getActivity(),-1);
                QTSHelp.set86(getActivity(),-1);
                QTSHelp.set65(getActivity(),-1);
                QTSHelp.set79(getActivity(),-1);

                QTSHelp.setListento(getActivity(),-1);

                QTSHelp.setBeginningWith(getActivity(),-1);
                QTSHelp.setTheCat(getActivity(),-1);
                QTSHelp.setSteveis(getActivity(),-1);

                QTSHelp.setAnimals04(getActivity(),-1);
                QTSHelp.setAnimals59(getActivity(),-1);
                QTSHelp.setAnimals1015(getActivity(),-1);

                QTSHelp.setTamHai(getActivity(),-1);
                QTSHelp.setAdd6(getActivity(),-1);
                QTSHelp.setTake(getActivity(),-1);

                QTSHelp.setLamp(getActivity(),-1);
                QTSHelp.setPhone(getActivity(),-1);
                QTSHelp.setChair(getActivity(),-1);
                QTSHelp.setCar(getActivity(),-1);
                QTSHelp.setHouse(getActivity(),-1);

                QTSHelp.setWhatWould1(getActivity(),-1);
                QTSHelp.setWhatWould2(getActivity(),-1);

                QTSHelp.setAqua(getActivity(),-1);
                QTSHelp.setAwatch(getActivity(),-1);
            }
        });

        return view;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        datasource.close();
    }
}
