import java.util.ArrayList;
import java.util.List;

public class MovieClass {
    private String MovieClassTitle;
    private String genre;
    private int duration;
    private double rating;

    public MovieClass(String MovieClassTitle, String genre, int duration, double rating) {
        this.MovieClassTitle = MovieClassTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getMovieClassTitle() {
        return MovieClassTitle;
    }

    public static void displayAllMovieClassTitles(List<MovieClass> MovieClasss) {
        System.out.println("MovieClass Titles:");
        for (MovieClass MovieClass : MovieClasss) {
            System.out.println(MovieClass.getMovieClassTitle());
        }
    }

    public static void main(String[] args) {
        List<MovieClass> MovieClasss = new ArrayList<>();
        MovieClasss.add(new MovieClass("Inception", "Sci-Fi", 148, 8.8));
        MovieClasss.add(new MovieClass("Titanic", "Romance", 195, 7.8));
        MovieClasss.add(new MovieClass("The Dark Knight", "Action", 152, 9.0));
        
        displayAllMovieClassTitles(MovieClasss);
    }
}