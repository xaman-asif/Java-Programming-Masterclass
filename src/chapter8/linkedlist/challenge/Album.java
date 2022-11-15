package chapter8.linkedlist.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title)==null) {
            this.songs.add(new Song(title, duration));
        } else {
            System.out.println("This song already exists in album");
            return false;
        }
        return true;
    }

    public Song findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getTitle().equals(title)){
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        } else {
            System.out.println("This song wasn't found");
            return false;
        }
    }
}
