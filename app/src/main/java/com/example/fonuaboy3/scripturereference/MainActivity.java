package com.example.fonuaboy3.scripturereference;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.shareBtn);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getApplicationContext(), showScripture.class);

        EditText textField;
        textField = (EditText) findViewById(R.id.book);
        String book = textField.getText().toString();
        textField = (EditText) findViewById(R.id.chapter);
        int chapter = Integer.parseInt(textField.getText().toString());
        textField = (EditText) findViewById(R.id.verse);
        int verse = Integer.parseInt(textField.getText().toString());

        intent.putExtra("book", book);
        intent.putExtra("chapter", chapter);
        intent.putExtra("verse", verse);

        startActivity(intent);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        button = (Button) findViewById(R.id.shareBtn);
        button.setOnClickListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
