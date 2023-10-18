package pl.sda.mg.io.bufferedreader;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedHelper helper = new BufferedHelper();

        helper.runTask();
        helper.changeLine("Trzecia linijka...", "Test");
    }
}
