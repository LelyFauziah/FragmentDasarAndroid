package com.example.tugasmodul2.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.tugasmodul2.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class FragmentSetting extends Fragment {

    View view;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_content,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FrameLayout frameLayout = view.findViewById(R.id.frame_content);
        textView = view.findViewById(R.id.text_content); // menghubungkan ke teks
        frameLayout.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.menu3)); // mengganti warna fragment3
        textView.setText(getResources().getString(R.string.menu3)); // mengganti teks menuju string menu1 = Home
    }
}

