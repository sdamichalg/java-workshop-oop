package pl.sda.mg.concurrency.racecondition;

public class RaceConditionApp {
    public static void main(String[] args) {

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

        System.out.println("Counter: " + incrementUtil.getCounter());

    }
}
