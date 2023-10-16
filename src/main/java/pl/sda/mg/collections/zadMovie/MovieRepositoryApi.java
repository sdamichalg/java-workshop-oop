package pl.sda.mg.collections.zadMovie;

import java.util.List;

public interface MovieRepositoryApi {
    void add(Movie movie);
    void delete(Movie movie);
    List<Movie> findAll();
    List<Movie> findByTitle(String title);
}
