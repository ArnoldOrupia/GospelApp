package in.thegeekybaniya.GospelSongs2017;

/**
 * Created by ARNOH on 1/6/2018.
 */

public class SongModel {
    private String songs,musician,size,length;

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

    public SongModel(String songs, String musician, String size, String length) {
        this.songs = songs;
        this.musician = musician;
        this.size = size;
        this.length = length;
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
