package pl.lach;

import pl.lach.geometric.Circle;
import pl.lach.geometric.Point;
import pl.lach.geometric.Rectangle;

/**
 * Each rectangle is described by four vertices in space, while a circle by a point in space is its center and the radius's length.
 * Write a program in which you will be able to calculate the area of ​​any rectangle and the ability to check whether the point is in or on a circle.
 * Write the program using the object-oriented approach, i.e. separate separate classes for points, rectangles, circles, calculators and a separate test class.
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(6, 0);
        Point point3 = new Point(6, 5);
        Point point4 = new Point(0, 5);

        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
        System.out.println("Rectangle area: " + Calculator.calculateRectangleArea(rectangle));

        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);

        Point ok = new Point(3, 0);
        Point notOk = new Point(0, 7);
        Point onEdge = new Point(0, 5);
        System.out.println(Calculator.checkPointIsInCircle(circle, ok));
        System.out.println(Calculator.checkPointIsInCircle(circle, notOk));
        System.out.println(Calculator.checkPointIsInCircle(circle, onEdge));
    }
}
