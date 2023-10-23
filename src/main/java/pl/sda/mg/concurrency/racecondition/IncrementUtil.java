package pl.sda.mg.concurrency.racecondition;

import lombok.Getter;

@Getter
public class IncrementUtil {
    private int counter;

//    public synchronized void increment() {
    public void increment() {
        synchronized (this) {
            counter += 1;
        }
    }
}
