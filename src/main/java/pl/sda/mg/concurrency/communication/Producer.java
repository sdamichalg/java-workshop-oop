package pl.sda.mg.concurrency.communication;

public class Producer implements Runnable{

    private final MessageBroker messageBroker;

    public Producer(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                messageBroker.produce(i);
                Thread.sleep(1000);
//                Thread.sleep(Duration.ofSeconds(1).toMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
