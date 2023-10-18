package pl.sda.mg.optional.zadMovie;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieRepository {
    private static List<Movie> movies;

    static {
        movies = Arrays.asList(
                new Movie("Movie1", "horror", 30, LocalDate.of(2017, 5, 1)),
                new Movie("Movie2", "comedy", 25, LocalDate.of(2018, 3, 15)),
                new Movie("Movie3", "horror", 18, LocalDate.of(2019, 8, 10)),
                new Movie("Movie4", "horror", 22, LocalDate.of(2016, 11, 20))
        );
    }

    public Optional<List<Movie>> findAfterReleaseDate(LocalDate releaseDate) {
        return Optional.of(movies.stream()
                .filter(movie -> movie.getReleaseDate().isAfter(releaseDate))
                .collect(Collectors.toList()));

    }

    public Optional<List<Movie>> findMovieLongerThan(long minutes) {
        return Optional.of(movies.stream()
                .filter(movie -> movie.getDuration() >= minutes)
                .collect(Collectors.toList()));

    }
}
