package pl.sda.mg.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();


        Runnable task1 = () ->
                System.out.println("Zadanie 1 wykonane przez wątek: " + Thread.currentThread().getName());

        Runnable task2 = () ->
                System.out.println("Zadanie 2 wykonane przez wątek: " + Thread.currentThread().getName());

        Runnable task3 = () ->
                System.out.println("Zadanie 3 wykonane przez wątek: " + Thread.currentThread().getName());

        //uruchamiamy taski
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
    }
}
