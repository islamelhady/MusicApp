package com.elhady.musicapp;

public class ModelLinks {

    private String songName;
    private String url;

    public ModelLinks(String songName, String url) {
        this.songName = songName;
        this.url = url;
    }

    public String getSongName() {
        return songName;
    }

    public String getUrl() {
        return url;
    }
}

