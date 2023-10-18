package pl.sda.mg.optional.zadMovie;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        MovieRepository repository = new MovieRepository();

        Optional<List<Movie>> afterReleaseDate =
                repository.findAfterReleaseDate(LocalDate.of(2018, Month.JANUARY, 1));


        afterReleaseDate.ifPresent(System.out::println);
        afterReleaseDate.ifPresent(movies -> System.out.println(movies.size()));

        System.out.println("*******************");

        Optional<List<Movie>> moviesLongerThan = repository.findMovieLongerThan(23);

        moviesLongerThan.ifPresent(System.out::println);
        moviesLongerThan.ifPresent(movies -> System.out.println(movies.size()));
    }
}
