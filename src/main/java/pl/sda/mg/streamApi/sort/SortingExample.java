package pl.sda.mg.streamApi.sort;

import pl.sda.mg.streamApi.zad1.FootballDatabase;
import pl.sda.mg.streamApi.zad1.FootballRepository;
import pl.sda.mg.streamApi.zad1.Footballer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "cherry", "apple", "strawberry", "grapes");

        fruits.stream()
                .sorted()
                .forEach(fr -> System.out.println(fr));

        FootballRepository footballRepository = new FootballDatabase();
        List<Footballer> footballers = footballRepository.findAll();

        footballers.stream()
                .sorted(Comparator.comparing(Footballer::getLastName))
//                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .forEach(ftb -> System.out.println(ftb));

        System.out.println("***********");

        footballers.stream()
                .sorted(Comparator.comparing(Footballer::getBirthYear))
                .forEach(ftb -> System.out.println(ftb));

        footballers.stream()
                .sorted(Comparator.comparing(Footballer::getFirstName)
                        .thenComparing(Footballer::getBirthYear))
                .forEach(ftb -> System.out.println(ftb));



    }
}
