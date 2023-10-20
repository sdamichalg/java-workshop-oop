package pl.sda.mg.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/src/folder1/star_wars.txt");
        Files.createFile(path);
        Files.write(path, "A long time ago in a galaxy far, far away....\n".getBytes()
                , StandardOpenOption.WRITE);
        Files.write(path, "in galaxy far\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "far away...".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }

        Files.deleteIfExists(path);
    }
}
