package com.elhady.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_songs1);
        btn2 = findViewById(R.id.btn_songs2);
        btn3 = findViewById(R.id.btn_songs3);
        btn4 = findViewById(R.id.btn_songs4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusic();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlaylist();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutube();
            }
        });
    }

    public void openPlaylist() {
        Intent intent = new Intent(this, MusicPlaylist.class);
        startActivity(intent);
    }

    public void openMusic() {
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);
    }

    public void openYoutube() {
        Intent intent = new Intent(this, Youtube.class);
        startActivity(intent);
    }

    public void openSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }


}