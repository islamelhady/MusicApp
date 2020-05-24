package com.elhady.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeAdapter.YoutubeViewHolder> {
    private ArrayList<ModelLinks> modelLinks;
    private Context context;


    public YoutubeAdapter(ArrayList<ModelLinks> modelLinks) {
        this.modelLinks = modelLinks;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewOne = LayoutInflater.from(parent.getContext()).inflate(R.layout.youtube_item, parent, false);
        YoutubeViewHolder youtubeViewHolderOne = new YoutubeViewHolder(viewOne);
        return youtubeViewHolderOne;
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeViewHolder youtubeViewHolder, final int position) {
        final ModelLinks currentModelLinks = modelLinks.get(position);

        youtubeViewHolder.textViewName.setText(currentModelLinks.getSongName());
        youtubeViewHolder.textViewLink.setText(currentModelLinks.getUrl());
    }

    @Override
    public int getItemCount() {
        return modelLinks.size();
    }

    public static class YoutubeViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout itemYoutube;
        public TextView textViewLink;
        public TextView textViewName;

        public YoutubeViewHolder(View itemView) {
            super(itemView);
            itemYoutube = itemView.findViewById(R.id.item_youtube_id);
            textViewLink = itemView.findViewById(R.id.song_link);
            textViewName = itemView.findViewById(R.id.song_name);
        }
    }
}
