package com.example.android.korterapp;


import android.os.Bundle;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FeedPage extends AppCompatActivity{

    LinearLayout page;
    TextView text= new TextView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_feed);
        page = (LinearLayout) findViewById(R.id.page);
        text.setText("sdasda");
        page.addView(text);
    }






}
