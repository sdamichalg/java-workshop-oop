package pl.sda.mg.concurrency.v1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from MyRunnable!");
    }
}
