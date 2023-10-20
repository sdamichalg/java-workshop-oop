package pl.sda.mg.io.scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriterV2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku:");
        String fileName = scanner.nextLine();

        System.out.println("Wpisz tekst do zapisania do pliku:");
        String userInput = scanner.nextLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(userInput);

        System.out.println("Tekst został zapisany do pliku: " + fileName);

        scanner.close();
        bufferedWriter.close();
    }
}
