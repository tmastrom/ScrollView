package com.esightcorp.hmd.comp.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void relativeView(View view) {
        setContentView(R.layout.relative);
    }

    public void constraintView(View view) {

        setContentView(R.layout.constraint);
    }

    public void home(View view) {

        setContentView(R.layout.activity_main);
    }


}
