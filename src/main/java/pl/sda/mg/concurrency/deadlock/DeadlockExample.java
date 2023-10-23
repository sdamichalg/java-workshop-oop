package pl.sda.mg.concurrency.deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Zablokowałem resource1");
                try {
                    Thread.sleep(200); //symulacja pracy wątku
                } catch (InterruptedException e) {
                }
                System.out.println("Thread1: Oczekujemy na resource2...");
                synchronized (resource2) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Thread1: zwalniamy resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread2: Zablokowałem resource2");
                try {
                    Thread.sleep(200); //symulacja pracy
                } catch (InterruptedException e) {
                }
                System.out.println("Thread2: oczekujemy na resource1");
                synchronized (resource1) {
                    System.out.println("Thread2: odblokowałem resource1");
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
