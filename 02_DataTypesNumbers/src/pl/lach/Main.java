package pl.lach;

import java.math.BigDecimal;

/**
 * Correct the following code in such a way that the result shown is displayed on the screen.
 * DataTypes.java
 * <p>
 * public class DataTypes {
 * <p>
 * public static void main(String[] args) {
 * int x = 10;
 * int y = 4;
 * int div = x / y;
 * System.out.println(div);
 * }
 * <p>
 * }
 * <p>
 * Expected result:
 * 2.5
 */
public class Main {
    public static void main(String[] args) {
        int x = 10;
        double y = 4;
        double div = x / y;
        System.out.println(div);

        //Solution using BigDecimal.class
        BigDecimal a = BigDecimal.TEN;
        BigDecimal b = BigDecimal.valueOf(4);
        BigDecimal result = a.divide(b);
        System.out.println("Result using the BigDecimal.class: " + result.toString());
    }

}
