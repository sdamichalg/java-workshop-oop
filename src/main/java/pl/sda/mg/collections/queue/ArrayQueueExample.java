package pl.sda.mg.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        while (!queue.isEmpty()) {
//            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }
    }
}
