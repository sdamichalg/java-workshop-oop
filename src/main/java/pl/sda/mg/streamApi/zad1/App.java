package pl.sda.mg.streamApi.zad1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        FootballRepository repository = new FootballDatabase();

        System.out.println(repository.findAll());
        System.out.println("******************");
        System.out.println(repository.findFootballersByClub("FC Barcelona"));

//        zwróć nazwy wszystkich klubów jako unikalne (bez powtórzeń) opcja 2

        List<String> listClubs = repository.findAll().stream()
                .flatMap(player -> player.getPreviousClubs().stream())
                .map(club -> club.getClubName())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Liczba unikalnych klubów: " + listClubs.size());
        System.out.println(listClubs);


        //        zwróć nazwy wszystkich klubów jako unikalne (bez powtórzeń) opcja 3

        List<String> listClubsV2 = repository.findAll().stream()
                .flatMap(footballer -> footballer.getPreviousClubs().stream())
                .map(club -> club.getClubName())
                .collect(Collectors.toList());

        System.out.println("****************");
        System.out.println("Liczba nieunikalnych klubów: " + listClubsV2.size());
        System.out.println(listClubsV2);

        Set<String> listClubsV3 = new HashSet<>(listClubsV2);

        System.out.println("****************");
        System.out.println("Liczba unikalnych klubów: " + listClubsV3.size());
        System.out.println(listClubsV3);
    }
}
