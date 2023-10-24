package pl.sda.mg.annotations;

public class App {

//    @MyAnnotation(autor = "Jan Kowalski", opis = "Przykładowy opis z adnotacji")
    @MyAnnotation(opis = "Przykładowy opis z adnotacji")
    public void przykladowaMetoda() {
        System.out.println("To jest przykładowa metoda!");
    }

    public void innaMetoda() {

    }

}
