package pl.sda.mg.io.fileinputreader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Util {
    public void runTask() throws IOException {
        FileInputStream in = new FileInputStream("kot.jpeg");
        FileOutputStream out = new FileOutputStream("kotKopia.jpeg");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        //zamykamy strumienie
        in.close();
        out.close();

    }
}
