package com.rahmat;

public class Song {
    private String SongName;
    private double SongDuration;

    public Song(String songName, double songDuration) {
        this.SongName = songName;
        this.SongDuration = songDuration;
    }

    public String getSongName() {
        return SongName;
    }

    @Override
    public String toString() {
        return this.SongName +" : "+ this.SongDuration;
    }
}
