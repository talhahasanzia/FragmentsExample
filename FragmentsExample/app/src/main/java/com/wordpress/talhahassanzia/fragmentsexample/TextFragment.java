package com.wordpress.talhahassanzia.fragmentsexample;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Me on 22-Feb-16.
 */
public class TextFragment extends Fragment {

    private static TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment,
                container, false);
        textView=(TextView) view.findViewById(R.id.textView1);
        return view;
    }


    public static void changeTextProperties(int fontsize, String text)
    {
        textView.setTextSize(fontsize);
        textView.setText(text);
    }
}
