package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*TextView view = new TextView(this);
        view.setText("Ejemplo de texto en Android");*/

        setContentView(R.layout.activity_main);
        //setContentView(view);
    }
}
