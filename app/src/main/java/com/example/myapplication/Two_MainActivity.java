package com.example.myapplication;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;

public class Two_MainActivity  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle a) {
        super.onCreate(a);
        LinearLayout linearLayout=new LinearLayout(this);
        TextClock textClock=new TextClock(this);
        linearLayout.addView(textClock);
        setContentView(linearLayout);


    }

}
