package com.example.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonBlue, buttonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBlue = (Button) findViewById(R.id.button_blueInvisible);
        buttonPink = (Button) findViewById(R.id.button_pinkPanther);

    }
    public void todo(View v) {
        if (v.equals(buttonBlue))
            // invisibility

            v.setVisibility(View.INVISIBLE);
        if (v.equals(buttonPink))
            // pop.up
            Toast.makeText(getApplicationContext(), "Subscribe HighSky on Youtube", Toast.LENGTH_SHORT).show();
    }
}