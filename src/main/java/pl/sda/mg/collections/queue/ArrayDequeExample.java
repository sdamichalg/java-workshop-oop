package pl.sda.mg.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("Element 1");
        deque.addLast("Elemnet 2");
        deque.addLast("Elemnet 3");

        deque.addFirst("Element początkowy");

        System.out.println("Zawartość kolejki: ");
        for (String s : deque) {
            System.out.println(s);
        }


    }
}
