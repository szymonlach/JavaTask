package pl.lach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A recording program in which you will pass any number of durations as arguments. Display on screen:
 * <p>
 * 1. number of transferred numbers
 * 2. counted numbers
 * 3. squares of transferred numbers
 * 4. sum of all transferred numbers in the form A + B + C + ... + N = SUMA
 * In the assignment, we assume that the user does not give any arguments or pass the correct numerical arguments (he does not need to worry about this, that the argument may be, for example, his "abc" inscription)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean userEnds = false;
        Integer input;

        while (!userEnds) {
            System.out.println("Type you number");
            input = scanner.nextInt();
            numbers.add(input);
            System.out.println("Do you want continue? (type yes or no)");
            if (scanner.next().equals("no")) {
                userEnds = true;
            }
        }
        System.out.println("Number of transferred numbers: " + numbers.size());
        System.out.println("Counted numbers: " + showAllNumbers(numbers));
        System.out.println("Squares of transferred numbers: " + showSquaresOfAllNumbers(numbers));
        System.out.println("Sum of all transferred numbers: " + showSumOfAllTransferredNumbers(numbers));

    }

    private static String showAllNumbers(List<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : numbers) {
            stringBuilder.append(number + " ");
        }
        return stringBuilder.toString();
    }

    private static String showSquaresOfAllNumbers(List<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : numbers) {
            stringBuilder.append(Math.pow(number, 2) + " ");
        }
        return stringBuilder.toString();
    }

    private static String showSumOfAllTransferredNumbers(List<Integer> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                stringBuilder.append(numbers.get(i) + "=");
            } else {
                stringBuilder.append(numbers.get(i) + "+");
            }
            sum += numbers.get(i);
        }
        stringBuilder.append(sum);
        return stringBuilder.toString();
    }
}
