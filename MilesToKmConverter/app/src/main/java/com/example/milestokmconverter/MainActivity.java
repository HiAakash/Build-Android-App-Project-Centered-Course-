package com.example.milestokmconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvertMilesToKm =(Button) findViewById(R.id.buttonConvertMilesToKm);
        buttonConvertMilesToKm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));

            }

            });
        Button buttonConvertKmToMiles =(Button) findViewById(R.id.buttonConvertKmToMiles);
        buttonConvertKmToMiles.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vKm = Double.valueOf(textBoxKm.getText().toString());
                double vMiles= vKm/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));

            }

        });


}}