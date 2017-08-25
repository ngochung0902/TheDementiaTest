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

public class FrmTool extends Fragment {
    TextView tv_tool;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_tool, container, false);
        tv_tool = (TextView) view.findViewById(R.id.tv_tool);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),"fonts/Lato_Bold.ttf");
        tv_tool.setTypeface(customFontBold);
        return view;
    }
}
