package thedementiatest.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thedementiatest.R;
import thedementiatest.helper.QTSConstrains;
import thedementiatest.helper.QTSHelp;

public class FrmAuthor extends Fragment {
    private TextView author,tv_au;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_author, container, false);
        author = (TextView) view.findViewById(R.id.tv_author);
        tv_au = (TextView) view.findViewById(R.id.tv_au);
        Typeface customFontBold= Typeface.createFromAsset(getActivity().getAssets(),QTSConstrains.FONT_LATO_BOLD);
        author.setTypeface(customFontBold);
        QTSHelp.setFontTV(getActivity(),tv_au, QTSConstrains.FONT_LATO_REGULAR);
        return view;
    }
}
