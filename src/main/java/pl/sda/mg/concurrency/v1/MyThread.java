package pl.sda.mg.concurrency.v1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from thread!");
    }
}
