package pl.sda.mg.optional;

import java.util.Optional;

public class FlatMapExample {
    public static void main(String[] args) {
        Optional<String> helloWorldContainer = Optional.of("Hello world!");

        Optional<Integer> integerContainer = helloWorldContainer.flatMap(text -> Optional.of(text.length()));
//        Optional<Integer> integerContainer = helloWorldContainer.flatMap(text -> Optional.empty());

        integerContainer.ifPresent(length -> System.out.println("Długość tekstu: " + length));
    }
}
