package pl.sda.mg.concurrency.racecondition;

import lombok.Getter;

@Getter
public class IncrementUtil {
    private int counter;

    public void increment() {
        counter += 1;
    }
}
