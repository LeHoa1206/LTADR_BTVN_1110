package com.example.btvn_ltddd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class TabFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        TextView textView = view.findViewById(R.id.textView);
        textView.setTextColor(getResources().getColor(android.R.color.holo_red_dark)); // Đổi màu chữ thành đỏ

        return view;
    }
}
