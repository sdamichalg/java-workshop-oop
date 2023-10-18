package pl.sda.mg.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Movie movie = null;
        Movie normalMovie = new Movie("Kiler", "comedy", Arrays.asList("Cezary Pazura", "Małgorzata Kożuchowska", "Jerzy Stuhr"));

        printMovieDetails(movie);
    }

    private static void printMovieDetails(Movie movie) {
        Optional<Movie> movieContainer = Optional.ofNullable(movie);

        if (movieContainer.isPresent()) {
            System.out.println(movieContainer.get().getTitle());
        }

        System.out.println("*************");
        movieContainer.ifPresent(mv -> System.out.println(mv.getTitle()));

        System.out.println("*************");

        List<String> actors = movieContainer.map(Movie::getActors)
                .orElse(Collections.singletonList("Fake actor"));

        System.out.println("Actors: " + actors);

        System.out.println("*************");

        List<String> actorsGet = movieContainer.map(mv -> mv.getActors())
                .orElseGet(() -> Collections.singletonList("Fake actor"));

        System.out.println("Actors: " + actorsGet);

        System.out.println("*************");

        List<String> actorsThrow = movieContainer.map(mv -> mv.getActors())
                .orElseThrow(() -> new RuntimeException("Fake film"));

        System.out.println("Actors: " + actorsThrow);

    }
}
