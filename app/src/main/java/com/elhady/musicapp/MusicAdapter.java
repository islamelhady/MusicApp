package com.elhady.musicapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private ArrayList<ModelMusic> modelMusics;
    private Context context;


    public MusicAdapter(ArrayList<ModelMusic> modelMusics, Context context) {
        this.modelMusics = modelMusics;
        this.context = context;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_item, parent, false);
        MusicViewHolder musicViewHolder = new MusicViewHolder(view);
        return musicViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, final int position) {
        final ModelMusic currentMusic = modelMusics.get(position);

        musicViewHolder.imageView.setImageResource(currentMusic.getArtistLogo(position));
        musicViewHolder.textView.setText(currentMusic.getArtistName(position));

        musicViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayMusic.class);
                intent.putExtra("songName1", currentMusic.getArtistName(position));
                intent.putExtra("imageArtist1", currentMusic.getArtistLogo(position));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return modelMusics.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout relativeLayout;
        private TextView textView;
        private ImageView imageView;

        public MusicViewHolder(View itemView) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.relativeId);
            textView = itemView.findViewById(R.id.txt_music);
            imageView = itemView.findViewById(R.id.img_music);

        }
    }
}
