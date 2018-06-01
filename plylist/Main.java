package com.rahmat;

import sun.awt.geom.AreaOp;
import sun.awt.image.ImageWatched;

import java.util.*;

public class Main {
private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        Album album = new Album("Boble", "Artist");
        album.addSong("Kenu", 3.34);
        album.addSong("Lonia", 5.42);
        album.addSong("Lenid", 4.42);
        album.addSong("komenda", 4.2);
        albums.add(album);
    album = new Album("SingSong", "Chill");
    album.addSong("Soe", 3.33);
    album.addSong("koloe", 4.5);
    album.addSong("ilile", 3.9);
    album.addSong("jooi", 3.8);
    albums.add(album);
        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPl("Lonia", playlist);
        albums.get(0).addToPl("komenda", playlist);
        albums.get(0).addToPl("Lilli Lollo", playlist);
    albums.get(0).addToPl(2, playlist);
    albums.get(1).addToPl(1, playlist);
    albums.get(1).addToPl(5, playlist);
    albums.get(1).addToPl(3, playlist);
    play(playlist);
    }
    private  static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println(" empty list");
            return;
        }else{
          //  System.out.println("Nå spilles "+listIterator.next().toString());
printMenu();
        }
        while(!quit){
            int valg = scanner.nextInt();
            scanner.nextLine();
            switch (valg){
                case 0:
                    System.out.println("PlayList er ferdig");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Spilles "+ listIterator.next().toString());
                    }else{
                        System.out.println("Lista er nåd");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Spilles "+ listIterator.previous().toString());

                    }else{
                        System.out.println("På toppen av lista");
                        forward = true;
                    }
                    break;
                case 3:

                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Avspilles "+ listIterator.previous().toString());
                        forward = false;
                        }else{
                            System.out.println("Vi er på starten av lista");

                        }
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println("Avspilles "+ listIterator.next().toString());
                           forward = true;
                        }
                        else{
                            System.out.println("Vi på slutten av lista");
                        }
                    }
                    break;
                case 4:
                    printlist(playlist);
                    break;
                case 5:
                   printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Spilles "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Spilles "+ listIterator.previous());
                        }
                        break;
                    }
            }
        }
    }
public static void printMenu(){
    System.out.println("Tilgjengelige valg\n press");
    System.out.println("0 - for å avslutte \n"+
    "1 - spille forrige sang\n"+
            "2 - spille neste sang\n"+
            "3 - avspille\n"+
            "4 - liste opp all sang\n"+
            "5 - for  menu\n"+
            "6 - for å slette sang"
    );

}

private  static  void printlist(LinkedList<Song> pl){
        Iterator<Song> iterator = pl.iterator();
    System.out.println("--------------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    System.out.println("--------------------------------");

}
}
