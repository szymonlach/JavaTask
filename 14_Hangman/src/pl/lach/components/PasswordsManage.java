package pl.lach.components;

import java.io.*;
import java.util.Random;

public class PasswordsManage {

    private final File passwordsFile = new File(getClass().getResource("passwords.txt").getPath());

    public String takeRandomPassword() {
        String[] passwords = getPasswordsFromFile();
        return passwords[new Random().nextInt(passwords.length)];
    }

    private String[] getPasswordsFromFile(){
        BufferedReader bufferedReader = null;
        String[] passwords = new String[0];

        try {
            bufferedReader = new BufferedReader(new FileReader(passwordsFile));
            passwords = bufferedReader.readLine().split(", ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return passwords;
    }
}
