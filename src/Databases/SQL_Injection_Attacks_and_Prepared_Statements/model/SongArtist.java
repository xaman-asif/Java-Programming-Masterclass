package Databases.SQL_Injection_Attacks_and_Prepared_Statements.model;

/**
 * Created by timbuchalka on 12/12/16.
 */
public class SongArtist {

    private String artistName;
    private String albumName;
    private int track;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }
}
