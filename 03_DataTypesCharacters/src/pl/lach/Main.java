package pl.lach;

/**
 * Write a program that will display the word CAT on the screen. You can not use a single quotation mark or apostrophes in the program.
 */
public class Main {
    public static void main(String[] args) {
        char[] cat = new char[3];
        cat[0] = 67;
        cat[1] = 65;
        cat[2] = 84;
        String result = String.copyValueOf(cat);
        System.out.println(result);
    }

}
