package com.elhady.musicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MusicPlaylist extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playlist);

        btn = findViewById(R.id.create_album_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Create a new Playlist", Toast.LENGTH_SHORT).show();
    }
}
