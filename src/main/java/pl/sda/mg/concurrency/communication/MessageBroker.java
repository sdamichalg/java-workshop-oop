package pl.sda.mg.concurrency.communication;

public class MessageBroker {
    private int data;
    private boolean isEmpty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (!isEmpty) {
            //czekaj, jeśli message broker nie jest pusty
            wait();
        }
        data = value;
        isEmpty = false;
        System.out.println("Producent wyprodukował: " + data);

        //powiadamiamy konsumenta, że dane są dostępne
        //powiadomienie i wybudzenie oczekującego wątku
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (isEmpty) {
            //poczekaj, jeśli broker jest pusty
            wait();
        }

        System.out.println("Konsument przyjął wiadomość: " + data);
        isEmpty = true;

        //powiadamiamy producenta, że broker jest pusty
        //powiadomienie i wybudzenie oczekującego wątku
        notify();
        return data;
    }
}
