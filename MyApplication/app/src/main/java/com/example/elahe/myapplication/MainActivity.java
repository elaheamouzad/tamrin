package com.example.elahe.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface d=Typeface.createFromAsset(getAssets(),"fonts/digital7.otf");
        TextView txt1=(TextView)findViewById(R.id.txt1);
        txt1.setTypeface(d);

    }
}
