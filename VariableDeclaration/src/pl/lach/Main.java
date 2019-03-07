package pl.lach;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Write a program in which you add three floating point numbers to the table and display the sum on the screen. Write the program in two versions:
 * <p>
 * 1. without using variables
 * 2. using variables to store numbers and the result of adding
 * When displaying, round the result to two decimal places. The result should be displayed in the form of:
 * <p>
 * A + B + C = RESULT
 */
public class Main {
    public static void main(String[] args) {

        System.out.printf("%.2f + %.2f + %.2f = %.2f\n", 0.2, 0.1, 0.4, (0.2 + 0.1 + 0.4));

        BigDecimal number1 = BigDecimal.valueOf(0.2).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal number2 = BigDecimal.valueOf(0.1).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal number3 = BigDecimal.valueOf(0.4).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal sum = number1.add(number2).add(number3);
        System.out.printf("%s + %s + %s = %s", number1.toString(), number2.toString(), number3.toString(), sum.toString());
    }
}
