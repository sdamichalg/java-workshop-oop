package pl.sda.mg.streamApi.v1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<List<Integer>> listOfIntegersList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91),
                Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90)
                );

        listOfIntegersList.stream()
                .forEach(i -> System.out.println(i));

        System.out.println("****************");

        listOfIntegersList.stream()
                .flatMap(list -> list.stream())
                .forEach(i -> System.out.println(i));

        List<Integer> integers = listOfIntegersList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("****************");

        integers.stream()
                .sorted()
                .forEach(i -> System.out.println(i));

        System.out.println("****************");
        integers.stream()
                .filter(i -> i > 50)
                .forEach(i -> System.out.println(i));


        System.out.println("****************");
        boolean anyMatch = integers.stream()
                .anyMatch(integer -> Integer.valueOf(1).equals(integer));
        System.out.println("Any match?: " + anyMatch);

        System.out.println("****************");
        boolean allMatch = integers.stream()
                .allMatch(i -> i > 50);
        System.out.println("All match?: " + allMatch);

        System.out.println("****************");
        listOfIntegersList.stream()
                .allMatch(list -> list.size() == 10);
        System.out.println("All match?: " + allMatch);




    }
}
