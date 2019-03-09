package pl.lach;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an Integer");
        int input = scanner.nextInt();
        System.out.println(calculateOutput(input));


    }

    public static String calculateOutput(int input) {
        StringBuilder stringBuilder = new StringBuilder();
        BigDecimal startValue = BigDecimal.valueOf(0, 1);
        BigDecimal endValue = BigDecimal.valueOf((double) input);
        BigDecimal incrementValue = BigDecimal.valueOf(0.1);
        if (input > 0) {
            do {
                stringBuilder.append(startValue.toString() + " ");
                startValue = startValue.add(incrementValue);
            } while (startValue.compareTo(endValue)<=0);
        } else if (input < 0) {
            do {
                stringBuilder.append(startValue.toString() + " ");
                startValue = startValue.subtract(incrementValue);
            } while (startValue.compareTo(endValue)>=0);
        }

        return stringBuilder.toString();
    }
}
