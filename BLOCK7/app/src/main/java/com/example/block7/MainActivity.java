package com.example.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.NumberPicker;
import android.view.View;

import static com.example.block7.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    
    NumberPicker possibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);
        String[] possiblitiesStrings = {
                "Android",
                "Checklist text-input feild",
                "Courcera",
                "supelec"
        };
        possibilities.setDisplayedValues(possiblitiesStrings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possiblitiesStrings.length-1);
    }
    public void navigator(View v){
        int choices = possibilities.getValue();
        if(choices==0)
            webView.loadUrl("file:///android_assets/android.html");
        else if (choices==1)
            webView.loadUrl("file:///android_assets/checklist.html");
        else if(choices==2)
            webView.loadUrl("http://www.courcera.org");
        else if (choices==3)
            webView.loadUrl("file:///android_assets/supelec.html");

    }
}

