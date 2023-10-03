package pl.sda.mg.oop.myinterface;

public interface MyInterface {

    void myMethod(); //metoda 'abstrakcyjna'

    default void showDefault() { // metode zwykla
        System.out.println("Hello from my default method in interface.");
    }
}
