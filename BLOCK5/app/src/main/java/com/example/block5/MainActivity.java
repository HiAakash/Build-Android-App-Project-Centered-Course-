package com.example.block5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences prefrences = getSharedPreferences("COLOR PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefrences.edit();
        final RelativeLayout layout =(RelativeLayout) findViewById(R.id.layout);
            if (prefrences.contains("colorId"))
                layout.setBackgroundColor(prefrences.getInt("colorId", 0));

        RadioGroup radioGroup_colors =(RadioGroup) findViewById(R.id.radioGroup_colors);
        radioGroup_colors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                int colorCode =0;
                switch(checkedId) {
                    case R.id.radioButton_blue:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.radioButton_magenta:
                        colorCode = Color.MAGENTA;
                        break;
                    case R.id.radioButton_yellow:
                        colorCode = Color.YELLOW;
                        break;

                }
                layout.setBackgroundColor(colorCode);
                editor.putInt("colorId",colorCode);
                editor.commit();


            }
        });
    }

    }