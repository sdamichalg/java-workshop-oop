package pl.sda.mg.concurrency.atomics;

public class AtomicCounter {
    public static void main(String[] args) throws InterruptedException {
        IncrementUtil incrementUtil = new IncrementUtil();

        Runnable runnable = () -> {
            for (int i = 0; i < 100_000; i++) {
                incrementUtil.increment();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

//        System.out.println(incrementUtil.getAtomicCounter());
        System.out.println(incrementUtil.getNormalCounter());

    }
}
