package pl.sda.mg.concurrency.v1;

public class Util {
    public static void printFollowingNumbersInThread(String threadName, Integer maxValue) {
        for(int i = 0; i < maxValue; i++) {
            System.out.println(String.format("[%s]: %d", threadName, i));
        }
    }
}
