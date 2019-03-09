package pl.lach;

import java.util.Scanner;

/**
 * Write a program in which the user gives an integer, and then a diamond is drawn in the console, the sides of which consist of as many stars as the number specified in the program.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer");
        int input = scanner.nextInt();
        drawRhombus(input);
    }

    private static void drawRhombus(int numberOfStars) {
        String stars = "";
        String gap = "";

        for (int i = 0; i < numberOfStars; i++) {
            stars = stars + "*";
            gap = gap + " ";
        }
        for (int i = numberOfStars; i > 0; i--) {
            gap = gap.substring(1);
            System.out.println(gap + stars);
        }
    }
}
