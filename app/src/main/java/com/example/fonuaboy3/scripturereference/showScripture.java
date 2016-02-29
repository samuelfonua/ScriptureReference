package com.example.fonuaboy3.scripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class showScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_scripture);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent =getIntent();

        String book = intent.getStringExtra("book");
        Integer chapter = intent.getIntExtra("chapter", 0);
        Integer verse = intent.getIntExtra("verse", 0);

        String reference = book + " " + chapter + ":" + verse;

        ((TextView)findViewById(R.id.scripture)).setText(reference);
        }
}


