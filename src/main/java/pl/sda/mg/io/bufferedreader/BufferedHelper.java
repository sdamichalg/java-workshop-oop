package pl.sda.mg.io.bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedHelper {
    public void runTask() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Zapis do pliku...\n");
        writer.write("I kolejny zapis do pliku...\n");
        writer.write("Trzecia linijka...\n");
        writer.write("Koniec\n");

        writer.close();
    }

    public void changeLine(String lineToChange, String newLine) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output_after_change.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            if (lineToChange.equals(line)) {
                out.write(newLine);
            } else {
                out.write(line);
            }
            out.write("\n");
        }

        in.close();
        out.close();
    }
}
