package com.rahmat;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String Name;
    private String Artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.Name = name;
        this.Artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public  boolean addSong(String name, double duration){
        if(findSong(name) == null){
            this.songs.add(new Song(name, duration ));
            return true;
        }

            return false;
    }
    private Song findSong(String name){
        for (Song checkedSong: this.songs){
            if(checkedSong.getSongName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPl(int Number, LinkedList<Song> pl){
        int index =Number-1;
        if((index>=0)&& (index< this.songs.size())){
            pl.add(this.songs.get(index));
            return true;
        }
        else{
            System.out.println("Denne album har ikke spor nummer: " + Number);
            return false;
        }
    }

    public boolean addToPl(String name, LinkedList<Song> pl){
        Song checkedSong = findSong(name);
        if(checkedSong!=null){
            pl.add(checkedSong);
            return true;
        }else{
            System.out.println("Denne sang '"+ name+"' finnes ikke i albumet");
            return false;
        }
    }
}
