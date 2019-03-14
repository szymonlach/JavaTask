package pl.lach;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatalogReader {


    private int totalLines;

    public CatalogReader() {
        this.totalLines = 0;
    }

    public void read(String directoryPath) throws IOException {
        Files.walk(Paths.get(directoryPath))
                .filter(path -> path.toFile().isFile())
                .forEach(this::calculateLine);
        System.out.println("Total lines: " + totalLines);
    }

    private void calculateLine(Path path) {
        int sumOfLines = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sumOfLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        totalLines += sumOfLines;
        System.out.printf("%s >>> %d\n", path, sumOfLines);
    }
}
