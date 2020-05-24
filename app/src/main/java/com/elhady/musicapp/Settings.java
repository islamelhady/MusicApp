package com.elhady.musicapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ArrayList<String> stringArrayList = new ArrayList<>();


        stringArrayList.add("Home screen lyrics");
        stringArrayList.add("Screen rotation");
        stringArrayList.add("Clear cache");
        stringArrayList.add("Filter settings");
        stringArrayList.add("Timmer");
        stringArrayList.add("About");

        ArrayAdapter<String> songAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, stringArrayList);
        ListView listView = findViewById(R.id.settingsId);
        listView.setAdapter(songAdapter);
    }
}
