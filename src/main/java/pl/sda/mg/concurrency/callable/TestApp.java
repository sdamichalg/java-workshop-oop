package pl.sda.mg.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestApp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callableTask =()->{
            Thread.sleep(1000);
            return "Wynik z callable";
        };

        //uruchamiamy wątek z taskiem callableTask
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            Future<String> result = executorService.submit(callableTask);
            try {
                return result.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException();
            }
        });

        future.thenAccept(result-> System.out.println("Wynik z callable: "+result));



        System.out.println("Akcja któranie chce czekać na wynik i się wykonuje od razu!");

        executorService.shutdown();

    }
}
