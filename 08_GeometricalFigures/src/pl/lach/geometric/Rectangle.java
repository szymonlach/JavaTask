package pl.lach.geometric;

import java.util.Objects;

public class Rectangle {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;


    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(getPoint1(), rectangle.getPoint1()) &&
                Objects.equals(getPoint2(), rectangle.getPoint2()) &&
                Objects.equals(getPoint3(), rectangle.getPoint3()) &&
                Objects.equals(getPoint4(), rectangle.getPoint4());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPoint1(), getPoint2(), getPoint3(), getPoint4());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }
}
