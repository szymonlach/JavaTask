package pl.lach;

public class Logic {

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "FIZZ";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public static void logicMethod(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("Number: %d is divisible by 3 and 5 -> %s\n", number, FIZZ_BUZZ);
        } else if (number % 3 == 0) {
            System.out.printf("Number: %d is divisible by 3 -> %s\n", number, FIZZ);
        } else if (number % 5 == 0) {
            System.out.printf("Number: %d is divisible by 5 -> %s\n", number, BUZZ);
        }
    }
}
