package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonOne,buttonThree,buttonSeven,buttonFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonThree =(Button) findViewById(R.id.button3);
        buttonFive= (Button) findViewById(R.id.button5);
        buttonSeven=(Button) findViewById(R.id.button7);
    }
    int guess = 5;
    public void todo(View v) {
        if (v.equals(buttonOne))
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonThree))
            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonFive))
            Toast.makeText(getApplicationContext(),
                    "Corret Guess," +
                            "isse baat pe Youtube me Xpert YT" +
                            "ko Subscribe karo " ,
                    Toast.LENGTH_LONG).show();
        if (v.equals(buttonSeven))
            v.setVisibility(View.INVISIBLE);
            //


    }
}