package chapter19.Write_Java_Query_for_Artists;

import chapter19.Write_Java_Query_for_Artists.model.Artist;
import chapter19.Write_Java_Query_for_Artists.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists();

        if (artists == null) {
            System.out.println("No artists");
        } else {
            for (Artist artist : artists) {
                System.out.println("ID: " + artist.getId() + " Name: " + artist.getName());
            }
        }
        datasource.close();
    }
}
