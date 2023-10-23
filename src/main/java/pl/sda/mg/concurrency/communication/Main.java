package pl.sda.mg.concurrency.communication;

public class Main {
    public static void main(String[] args) {

        MessageBroker messageBroker = new MessageBroker();

        Thread producerThread = new Thread(new Producer(messageBroker));
        Thread consumerThread = new Thread(new Consumer(messageBroker));

        producerThread.start();
        consumerThread.start();
    }
}
