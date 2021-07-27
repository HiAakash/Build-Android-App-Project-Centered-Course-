package com.example.block2;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    @Override


    @SuppressLint("ResourceType")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewAnimals = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<CharSequence>adapterAnimals;
        adapterAnimals = ArrayAdapter.createFromResource(this,
                R.array.animalsArray,
                android.R.layout.simple_list_item_1);
        listViewAnimals.setAdapter(adapterAnimals);
        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            String message = getString(R.string.toastMessage) + adapterAnimals.getItem(position);
            Toast.makeText(getApplicationContext(),
                    message,
                    Toast.LENGTH_SHORT).show();


            }

        });

    }
}