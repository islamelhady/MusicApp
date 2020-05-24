package com.elhady.musicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PlayMusic extends AppCompatActivity implements View.OnClickListener {
    Button play_Song;
    Button next_song;
    Button previous_song;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        play_Song = findViewById(R.id.play_btn);
        next_song = findViewById(R.id.next_btn);
        previous_song = findViewById(R.id.previous_btn);

        play_Song.setOnClickListener(this);
        next_song.setOnClickListener(this);
        previous_song.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.previous_btn:
                Toast.makeText(this, "Play previous Song", Toast.LENGTH_LONG).show();
                break;
            case R.id.play_btn:
                Toast.makeText(this, "Play song", Toast.LENGTH_LONG).show();
                break;
            case R.id.next_btn:
                Toast.makeText(this, "Play next song", Toast.LENGTH_LONG).show();
                break;
        }
    }
}

