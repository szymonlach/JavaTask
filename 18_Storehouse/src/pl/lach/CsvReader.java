package pl.lach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {


    public static List<String> readCsv(File file) {
        List<String> listOfLines = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                listOfLines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfLines;
    }
}
