package pl.sda.mg.collections.zadMovie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryApi{

    private List<Movie> movies;

    public MovieRepository() {
        this.movies = new ArrayList<>();
    }

    @Override
    public void add(Movie movie) {
        movies.add(movie);
    }

    @Override
    public void delete(Movie movie) {
        movies.remove(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

    @Override
    public List<Movie> findByTitle(String title) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle())) {
                result.add(movie);
            }
        }
        return result;
    }
}
