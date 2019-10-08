package com.example.tugasmodul2;


import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.tugasmodul2.fragment.FragmentHome;
import com.example.tugasmodul2.fragment.FragmentNotif;
import com.example.tugasmodul2.fragment.FragmentSetting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    FrameLayout container1,container2,container3; // deklarasi variable
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container1 = findViewById(R.id.fragment1); // pemanggilan Fragment1 di xml
        container1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new FragmentHome(); //inisiasi dari fragmentHome.java
                loadFragment(fragment,1); // untuk logika di bawah
            }
        });

        container2 = findViewById(R.id.fragment2);  // pemanggilan Fragment2 di xml
        container2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                fragment = new FragmentNotif(); // inisiasi dari fragmentNotif.java
                loadFragment(fragment,2); // untuk logika di bawah
            }
        });

        container3 = findViewById(R.id.fragment3);      // pemanggilan Fragment3 di xml
        container3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new FragmentSetting(); // inisiasi dari fragmentSetting.java
                loadFragment(fragment,3);   // untuk logika di bawahnya
            }
        });
    }

    private void loadFragment(Fragment fragment,int foo){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction(); //
        if (foo == 1)
            transaction.replace(R.id.fragment1,fragment);  // id fragment1 dari activity_main.xml
        else if (foo == 2)
            transaction.replace(R.id.fragment2,fragment);   // id fragment2 dari activity_main.xml
        else
            transaction.replace(R.id.fragment3,fragment);   // id fragment3 dari activity_main.xml

        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        finish();   // kalau di back close
        super.onBackPressed();
    }

}

