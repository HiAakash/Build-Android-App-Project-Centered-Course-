package com.example.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer filhallMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filhallMusic= MediaPlayer.create(this, R.raw.filhall);
        Switch switch_looping = (Switch) findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                filhallMusic.setLooping(isChecked);
            }
        });
    }
    public void playMusic(View v) {
        filhallMusic.start();

    }
    public void pauseMusic(View v) {
        if(filhallMusic.isPlaying())
            filhallMusic.pause();

    }
}