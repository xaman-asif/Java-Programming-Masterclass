package chapter8.linkedlist.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    private static ArrayList<Album> listOfAlbums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Love", 0.1);
        album.addSong("Death", 1.00);
        album.addSong("Robots", 4.04);
        album.addSong("Sex", 6.9);
        album.addSong("Eat", 10.0);
        album.addSong("Afterlife", 0.0);

        listOfAlbums.add(album);

        album = new Album("For those who don't give a shit", "Mayhem");
        album.addSong("Things I'm about to think", 1000.0);
        album.addSong("Things I'm about to change", 0.0);
        album.addSong("Things I'm about to about to", 100.0);

        listOfAlbums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        listOfAlbums.get(0).addToPlaylist("Love", playlist);
        listOfAlbums.get(0).addToPlaylist("Sex", playlist);
        listOfAlbums.get(0).addToPlaylist("Battle", playlist);

        listOfAlbums.get(1).addToPlaylist(3, playlist);
        listOfAlbums.get(1).addToPlaylist(4, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> iterator = playlist.listIterator();
        if (playlist.size() != 0) {
            while (iterator.hasNext()) {
                Song song = iterator.next();
                System.out.println(song.toString());
            }
        } else {
            System.out.println("No songs in the playlist");
            return;
        }

    }
}
