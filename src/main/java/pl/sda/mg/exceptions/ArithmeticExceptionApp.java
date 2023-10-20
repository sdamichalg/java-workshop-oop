package pl.sda.mg.exceptions;

public class ArithmeticExceptionApp {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Nie możesz dzielić przez 0");
        } finally {
            System.out.println("To pojawi się zawsze");
        }

        System.out.println("Dalsza część aplikacji");
    }
}
