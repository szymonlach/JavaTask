package pl.lach.shapes;

import pl.lach.drawable.Drawable;

import java.util.Objects;

public class Tree implements Drawable {

    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return getHeight() == tree.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight());
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
