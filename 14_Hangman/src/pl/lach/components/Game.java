package pl.lach.components;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Logic logic;
    private boolean continueProgram;


    public Game() {
        this.logic = new Logic();
        continueProgram = true;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (continueProgram) {
            System.out.println("Try guess the correct password");
            System.out.println("Password\n" + logic.getTemporaryPassword());

            while (!logic.isGameEnds()) {
                System.out.println("Type a letter");
                String input = scanner.next();
                System.out.println("Password\n" + logic.checkPasswordContainCharacter(input));
            }

            System.out.println(logic.getGameResult());
            System.out.println("1 - Play again");
            System.out.println("2 - Exit");
            while (true) {
                try {
                    continueProgram = isCloseProgram(scanner.nextInt());
                    break;
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.err.println("Type 1 or 2");
                }
            }

        }
    }

    private boolean isCloseProgram(int input) {
        if (input == 1) {
            logic.reloadGame();
            return true;
        } else if (input == 2) {
            System.out.println("Goodbye");
            return false;

        } else throw new IllegalArgumentException();
    }


}
