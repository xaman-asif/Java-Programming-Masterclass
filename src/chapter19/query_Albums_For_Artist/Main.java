package chapter19.query_Albums_For_Artist;

import chapter19.query_Albums_For_Artist.model.Artist;
import chapter19.query_Albums_For_Artist.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(3);

        if (artists == null) {
            System.out.println("No artists");
        } else {
            for (Artist artist : artists) {
                System.out.println("ID: " + artist.getId() + " Name: " + artist.getName());
            }
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        datasource.close();

    }


}
