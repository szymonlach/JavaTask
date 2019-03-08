package pl.lach.geometric;

import java.util.Objects;

public class Circle {

    private Point centerPoint;
    private double radious;

    public Circle(Point centerPoint, double radious) {
        this.centerPoint = centerPoint;
        this.radious = radious;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadious(), getRadious()) == 0 &&
                Objects.equals(getCenterPoint(), circle.getCenterPoint());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCenterPoint(), getRadious());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerPoint=" + centerPoint +
                ", radious=" + radious +
                '}';
    }
}
