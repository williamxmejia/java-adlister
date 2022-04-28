import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private int release_date;
    private float sales;
    String genre;

    public Album(int id, String artist, String name, int release_date, float sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(int releaseDate) {
        this.release_date = releaseDate;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album(){

    }
}
