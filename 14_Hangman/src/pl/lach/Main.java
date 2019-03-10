package pl.lach;

import pl.lach.components.PasswordsManage;

/**
 * Create a console version of the hangman game.
 * <p>
 * The user receives a password to guess. The password consists of any number of letters (it can be composed of several words). The user gives successive letters and if any of the letters are in the word, they are discovered (the remaining letters in the password remain gaps). If the user specifies a letter that is not in the password, the number of errors that the user can commit maximum 8 is increased. When the user enters 8 letters that were not in the password (he makes 8 mistakes), he loses. If the user gives a letter that he has already given, it should be ignored.
 * <p>
 * The program should have a simple menu giving the opportunity to start a new game or exit the program.
 * <p>
 * In the basic version define a database of passwords to guess as an array rigidly saved in the program. In the more difficult version, add the loading of passwords from the file.
 */
public class Main {
    public static void main(String[] args) {
        PasswordsManage passwordsManage = new PasswordsManage();

        for (int i = 0; i < 10; i++) {
            System.out.println(passwordsManage.takeRandomPassword());

        }
    }
}
