package pl.lach;

import java.io.IOException;

/**
 * Create a program that counts the number of lines of text for all files in the specified folder.
 * <p>
 * The result should be a list of files along with information on the number of lines and the sum of all lines in the folder. The program should search the folder recursively.
 */
public class Main {
    public static void main(String[] args) {
        CatalogReader catalogReader = new CatalogReader();
        try {
            catalogReader.read("./exampleFiles");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
