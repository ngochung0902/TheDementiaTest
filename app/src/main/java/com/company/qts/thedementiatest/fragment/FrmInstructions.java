package com.company.qts.thedementiatest.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.company.qts.thedementiatest.R;
import com.company.qts.thedementiatest.helper.QTSConstrains;
import com.company.qts.thedementiatest.helper.QTSHelp;

public class FrmInstructions extends Fragment{
    private TextView tv_in,tv_instructions;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_instructions, container, false);
        tv_in = (TextView) view.findViewById(R.id.tv_in);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        tv_in.setTypeface(customFontBold);
        tv_instructions = (TextView) view.findViewById(R.id.tv_instructions);
        QTSHelp.setFontTV(getActivity(),tv_instructions, QTSConstrains.FONT_LATO_REGULAR);
        return view;
    }
}
