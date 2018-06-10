package com.example.manju7.android_listview;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ActionBar actionBar=getSupportActionBar();
        TextView textView=findViewById(R.id.textview1);

        Intent intent=getIntent();
        String  actionBarTitle=intent.getStringExtra("actionBarTitle");
        String content=intent.getStringExtra("content");

        actionBar.setTitle(actionBarTitle);
        textView.setText(content);
    }
}
