package pl.lach.components;

import java.util.ArrayList;
import java.util.List;

public class Logic {

    private String finalPassword;
    private StringBuilder stringBuilder;
    private int numberOfMisses;
    private String gameResult;
    private List<String> typedCharacters;

    public Logic() {
        finalPassword = new PasswordsManage().takeRandomPassword().toUpperCase();
        stringBuilder = new StringBuilder(hidePasword(finalPassword));
        numberOfMisses = 0;
        typedCharacters = new ArrayList<>();
    }

    public String checkPasswordContainCharacter(String character) {
        character = character.toUpperCase();
        if (!typedCharacters.contains(character)) {
            if (finalPassword.contains(character)) {
                int index = finalPassword.indexOf(character);
                while (index >= 0) {
                    stringBuilder.setCharAt(index, finalPassword.charAt(index));
                    index = finalPassword.indexOf(character, index + 1);
                }
            } else {
                numberOfMisses++;
            }
            typedCharacters.add(character);
        }
        return stringBuilder.toString();
    }

    public boolean isGameEnds() {
        if (numberOfMisses >= 8) {
            gameResult = "Sorry but you lose!!!\n" + "The correct password was: " + finalPassword;
            return true;
        } else if (!stringBuilder.toString().contains("*")) {
            gameResult = "Congratulation you won!!!\n" + "Password: " + finalPassword;
            return true;
        } else {
            return false;
        }
    }

    public void reloadGame() {
        finalPassword = new PasswordsManage().takeRandomPassword().toUpperCase();
        stringBuilder = new StringBuilder(hidePasword(finalPassword));
        numberOfMisses = 0;
        typedCharacters = new ArrayList<>();
    }


    private String hidePasword(String uncoveredPassword) {
        return uncoveredPassword.replaceAll("\\w", "*");
    }


    public String getTemporaryPassword() {
        return stringBuilder.toString();
    }

    public String getGameResult() {
        return gameResult;
    }
}
