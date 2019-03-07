package pl.lach;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.printf("%f + %f + %f = %f\n", 0.2, 0.1, 0.4, (0.2 + 0.1 + 0.4));

        BigDecimal number1 = BigDecimal.valueOf(0.2);
        BigDecimal number2 = BigDecimal.valueOf(0.1);
        BigDecimal number3 = BigDecimal.valueOf(0.4);
        BigDecimal sum = number1.add(number2).add(number3);
        System.out.printf("%s + %s + %s = %s", number1.toString(), number2.toString(), number3.toString(), sum.toString());
    }
}
