package pl.lach;

import java.io.IOException;

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
