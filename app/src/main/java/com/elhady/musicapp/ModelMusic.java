package com.elhady.musicapp;

public class ModelMusic {
    private String artist_name;
    private int artist_logo;

    public ModelMusic(String artist_name, int artist_logo) {
        this.artist_name = artist_name;
        this.artist_logo = artist_logo;
    }

    public int getArtistLogo(int position) {
        return artist_logo;
    }

    public String getArtistName(int position) {
        return artist_name;
    }
}
