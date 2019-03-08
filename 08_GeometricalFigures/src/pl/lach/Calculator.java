package pl.lach;

import pl.lach.geometric.Circle;
import pl.lach.geometric.Point;
import pl.lach.geometric.Rectangle;

import static java.lang.Math.*;

public class Calculator {

    public static double calculateRectangleArea(Rectangle rectangle) {
        //|AB|=sqrt((x2-x1)^2+(y2-y1)^2)
        double firtsEdge = sqrt(pow(rectangle.getPoint2().getX() - rectangle.getPoint1().getX(), 2) + pow(rectangle.getPoint2().getY() - rectangle.getPoint1().getY(), 2));
        double secondEdge = sqrt(pow(rectangle.getPoint4().getX() - rectangle.getPoint1().getX(), 2) + pow(rectangle.getPoint4().getY() - rectangle.getPoint1().getY(), 2));
        return firtsEdge * secondEdge;
    }

    public static String checkPointIsInCircle(Circle circle, Point point) {
        //(x-a)^2+(y-b)^2=r^2

        double leftSideOfEquation = pow(point.getX() - circle.getCenterPoint().getX(), 2) + pow(point.getY() - circle.getCenterPoint().getY(), 2);
        double rightSideOfEquation = pow(circle.getRadious(), 2);

        if (leftSideOfEquation < rightSideOfEquation) {
            return "Point is inside circle";
        } else if (leftSideOfEquation > rightSideOfEquation) {
            return "Point is outside circle";
        } else {
            return "Point is on the edge of the circle";
        }
    }

}
