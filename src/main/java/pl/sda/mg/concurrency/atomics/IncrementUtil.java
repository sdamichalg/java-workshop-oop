package pl.sda.mg.concurrency.atomics;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;
@Getter
public class IncrementUtil {
    private AtomicInteger atomicCounter = new AtomicInteger();
    private int normalCounter;

    public int increment() {
        normalCounter = normalCounter + 1;
        return normalCounter;
//        return atomicCounter.addAndGet(1);
    }
}
