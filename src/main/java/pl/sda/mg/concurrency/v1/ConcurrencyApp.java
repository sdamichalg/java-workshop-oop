package pl.sda.mg.concurrency.v1;

public class ConcurrencyApp {
    public static void main(String[] args) {

        Thread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());
        Thread threadFromLambda = new Thread(() -> System.out.println("hello from third thread!"));

//        myThread.start(); //uruchomienie taska/wątku
//        myRunnable.start();
//        threadFromLambda.start();

        Util.printFollowingNumbersInThread("Wątek 1", 10);
        Util.printFollowingNumbersInThread("Wątek 2", 10);
        Util.printFollowingNumbersInThread("Wątek 3", 10);

        System.out.println("**************");

        Thread thread1 = new Thread(() -> Util.printFollowingNumbersInThread("Wątek 1", 10));
        Thread thread2 = new Thread(() -> Util.printFollowingNumbersInThread("Wątek 2", 10));
        Thread thread3 = new Thread(() -> Util.printFollowingNumbersInThread("Wątek 3", 10));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
