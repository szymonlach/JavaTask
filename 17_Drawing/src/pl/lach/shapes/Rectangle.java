package pl.lach.shapes;

import pl.lach.drawable.Drawable;

import java.util.Objects;

public class Rectangle implements Drawable {

    private int sideLength;
    private int sideHeight;

    public Rectangle(int sideLength, int sideHeight) {
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
    }


    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(int sideHeight) {
        this.sideHeight = sideHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getSideLength() == rectangle.getSideLength() &&
                getSideHeight() == rectangle.getSideHeight();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSideLength(), getSideHeight());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideLength=" + sideLength +
                ", sideHeight=" + sideHeight +
                '}';
    }

    @Override
    public void draw() {
        for (int i = 0; i < sideHeight; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
