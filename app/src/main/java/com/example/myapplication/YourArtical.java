package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class YourArtical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_artical);
        String title=getIntent().getStringExtra("title");
        TextView textView=findViewById(R.id.textView2);
        textView.setText(title);
    }
}