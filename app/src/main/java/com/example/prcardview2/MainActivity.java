package com.example.prcardview2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        txt6 = (TextView) findViewById(R.id.txt6);
        txt7 = (TextView) findViewById(R.id.txt7);
        txt8 = (TextView) findViewById(R.id.txt8);
        txt9 = (TextView) findViewById(R.id.txt9);
        txt10 = (TextView) findViewById(R.id.txt10);


        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/ml.ttf");
        Typeface customfont2 = Typeface.createFromAsset(getAssets(),"fonts/mm.ttf");
        Typeface customfont3 = Typeface.createFromAsset(getAssets(),"fonts/mr.ttf");

        txt1.setTypeface(customfont3);
        txt2.setTypeface(customfont3);
        txt3.setTypeface(customfont);
        txt4.setTypeface(customfont2);
        txt5.setTypeface(customfont2);
        txt6.setTypeface(customfont2);
        txt7.setTypeface(customfont2);
        txt8.setTypeface(customfont2);
        txt9.setTypeface(customfont);
        txt10.setTypeface(customfont);
    }
}
