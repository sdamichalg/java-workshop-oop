package pl.sda.mg.streamApi.zad1;


import lombok.Builder;
import lombok.Value;

import java.util.List;
@Value
@Builder
public class Footballer {
    private String firstName;
    private String lastName;
    private Integer birthYear;
    private Country nationality;
    private MarketStatus marketStatus;
    private Address address;
    private List<Club> previousClubs;
}
