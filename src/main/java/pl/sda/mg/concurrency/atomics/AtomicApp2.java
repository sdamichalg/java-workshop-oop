package pl.sda.mg.concurrency.atomics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicApp2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        counter();
    }

    static void counter() throws InterruptedException, ExecutionException {
        AtomicInteger atomicInteger = new AtomicInteger(1);

        List<Callable<Integer>> actions = Arrays.asList(
                () -> atomicInteger.addAndGet(30),
                () -> atomicInteger.addAndGet(10),
                () -> atomicInteger.addAndGet(20)
        );

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futures = executorService.invokeAll(actions);

        for (Future<Integer> result : futures) {
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
