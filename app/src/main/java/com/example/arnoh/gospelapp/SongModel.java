package com.example.arnoh.gospelapp;

import java.net.URL;

/**
 * Created by ARNOH on 1/6/2018.
 */

public class SongModel {
    private String songs,musician,size,length, url;
    private int image;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public SongModel(String songs, String musician, String size, String length, int image, String url) {
        this.songs = songs;
        this.musician = musician;
        this.size = size;
        this.length = length;
        this.image = image;
        this.url= url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }
}
