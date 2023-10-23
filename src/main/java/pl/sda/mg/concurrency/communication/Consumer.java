package pl.sda.mg.concurrency.communication;

public class Consumer implements Runnable {

    private final MessageBroker messageBroker;

    public Consumer(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5 ; i++) {
            try {
                messageBroker.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
