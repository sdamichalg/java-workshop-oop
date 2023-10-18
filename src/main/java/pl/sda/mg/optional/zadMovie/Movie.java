package pl.sda.mg.optional.zadMovie;

import lombok.Value;

import java.time.LocalDate;
@Value
public class Movie {

    String title;
    String type;
    long duration;
    LocalDate releaseDate;
}
