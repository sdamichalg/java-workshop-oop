package pl.sda.mg.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callableTask = () -> {
            Thread.sleep(3000); //symulacja pracy aplikacji
            return "Wynik z callable";
        };


        //uruchamiamy wątek z taskiem callableTask
        Future<String> future = executorService.submit(callableTask);

        //pobieramy result z future
        String result = future.get(); //ta linijka wstrzymuje program

        System.out.println("Wynik: " + result);

        System.out.println("Akcja, która nie chce czekać na wynik callable i chce się wykonać od razu!");

        executorService.shutdown();
    }
}
