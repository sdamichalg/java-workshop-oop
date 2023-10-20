package pl.sda.mg.exceptions.v1;

public class MultiCatchApp {
    public static void main(String[] args) {

        try {
            int[] numbers = new int[4];
            int result = 10 /0;
            numbers[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyjątek ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Nieznany wyjątek.");
        }
    }
}
