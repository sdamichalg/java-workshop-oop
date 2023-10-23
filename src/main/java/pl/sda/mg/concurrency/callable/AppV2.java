package pl.sda.mg.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callableTask = () -> {
            Thread.sleep(3000); //symulacja pracy aplikacji
            return "Wynik z callable";
        };


        //uruchamiamy wątek z taskiem callableTask
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            Future<String> result = executorService.submit(callableTask);
            try {
                return result.get();
            } catch (InterruptedException | ExecutionException e) {
                return "Bład";
            }
        });

        future.thenAccept(result -> System.out.println("Wynik z callable: " + result));

        System.out.println("Akcja, która nie chce czekać na wynik callable i chce się wykonać od razu!");

        executorService.shutdown();
    }
}
