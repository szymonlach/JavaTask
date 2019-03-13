package pl.lach;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that has the form csv format file:
 * <p>
 * name1; quantity1
 * name2; ilość2
 * e.t.c.
 * <p>
 * reads information about warehouse inventory (product names and current quantity of products in stock). We assume that the maximum number of products is 100.
 * <p>
 * The program should display a percentage graph in the form of a star in the form similar to the one shown below.
 * <p>
 * Each star is responsible for 10% of the supply, that is 100 products = 100%, and eg 28 = 30% (rounded to the nearest full 10). The list of products should be sorted alphabetically (we omit Polish characters).
 * <p>
 * The file name should be loaded from the console user.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name");
        //String input = scanner.next();
        String input = "Csv_Test.csv";
        List<String> fileData = CsvReader.readCsv(new File(input));

        Storehouse storehouse = new Storehouse(fileData);

        System.out.println(storehouse.showStorehouseState());

    }
}
