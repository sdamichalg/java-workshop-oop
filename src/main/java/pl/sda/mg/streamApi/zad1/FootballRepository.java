package pl.sda.mg.streamApi.zad1;


import java.util.List;

public interface FootballRepository {

    List<Footballer> add(Footballer footballer);
    List<Footballer> delete(Footballer footballer);
    List<Footballer> findByLastName(Footballer footballer);
    List<Footballer> findFootballersByClub(String clubName);
    List<Footballer> findAll();
}
