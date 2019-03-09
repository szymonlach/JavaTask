package pl.lach.loopSolution;

import pl.lach.Logic;
import pl.lach.streamSolution.StreamSolution;

/**
 * Write a program that in the case of numbers divisible by 3 will display the number and word "Fizz", divisible by 5 will display the number and the word "Buzz", and divisible by both 3 and 5 will display the number and the word "FizzBuzz". The other numbers should not be displayed. We assume that we work on numbers in the range <1; 100>.
 * Write the program in two versions:
 * 1. Classic iterator
 * 2. Using Java 8 streams
 */
public class LoopSolution {
    public static void main(String[] args) {
        int[] numberTable = new int[100];

        for (int i = 0; i < numberTable.length; i++) {
            numberTable[i] = i + 1;
            System.out.print(numberTable[i]);
        }

        for (Integer number : numberTable) {
            Logic.logicMethod(number);
        }
    }
}
