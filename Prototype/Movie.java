package DesignPatterns.Prototype;
import java.util.*;

public class Movie implements Cloneable{
    private String movieName;
    private String releaseDate;
    private List<String> genre;
    private List<String> ratings;
    public Movie(){
        System.out.println("Default constructor");
    }
    public Movie(String movieName, String releaseDate, List<String> genre, List<String> ratings) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.ratings = ratings;
    }
    public List<String> getGenre() {
        return genre;
    }
    public List<String> getRatings() {
        return ratings;
    }
    public void getData() {
        System.out.println("Getting Data from database");
        this.movieName = "Spider-Man:No Way Home";
        this.releaseDate = "2021";
        this.genre = new ArrayList<String>();
        this.genre.add("Action");
        this.genre.add("Science fiction");
        this.ratings = new ArrayList<String>();
        this.ratings.add("IMDB:8.7");
        this.ratings.add("RottenTomatoes:98%");
    }
    @Override
    public String toString() {
        return "[movieName="+movieName+",\n releaseDate="+releaseDate+",\n genre="+genre+",\n ratings="+ratings+"]";
    }
    @Override
    protected Movie clone() throws CloneNotSupportedException {
        List<String> Ratings = new ArrayList<>();
        Ratings.addAll(this.ratings);
        List<String> Genres = new ArrayList<>();
        Genres.addAll(this.genre);
        return new Movie(this.movieName, this.releaseDate, Genres, Ratings);
    }
}