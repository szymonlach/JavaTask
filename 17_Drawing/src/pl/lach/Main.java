package pl.lach;

import pl.lach.drawable.Drawable;
import pl.lach.shapes.Rectangle;
import pl.lach.shapes.Square;
import pl.lach.shapes.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        Drawable shape;
        while (run) {
            System.out.println("What do you want to draw? (rectangle/square/tree)");
            String figure = scanner.next();
            if (figure.equals("rectangle")) {
                System.out.println("Type rectangle length");
                int sideLength = scanner.nextInt();
                System.out.println("Type rectangle height");
                int sideHeight = scanner.nextInt();
                shape = new Rectangle(sideLength, sideHeight);
            } else if (figure.equals("square")) {
                System.out.println("Type square side length");
                int sideLength = scanner.nextInt();
                shape = new Square(sideLength);
            } else if (figure.equals("tree")) {
                System.out.println("Type tree height");
                int height = scanner.nextInt();
                shape = new Tree(height);
            } else {
                continue;
            }

            shape.draw();
            System.out.println("Do you want continue? (yes/no)");
            String endingDecision = scanner.next();
            if (endingDecision.equals("no")) run = false;
        }
    }
}
