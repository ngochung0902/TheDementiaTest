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

public class FrmAuthor extends Fragment {
    private TextView author;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_author, container, false);
        author = (TextView) view.findViewById(R.id.tv_author);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),"fonts/Lato_Bold.ttf");
        author.setTypeface(customFontBold);
        return view;
    }
}
