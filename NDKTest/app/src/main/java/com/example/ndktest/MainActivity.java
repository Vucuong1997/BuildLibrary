package com.example.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    static{
        System.loadLibrary("ndktest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("Value = " + String.valueOf(addInJNI(12,14)));

    }

    public native int addInJNI(int a, int b);



}
