package Joshua.CT.Exercise25;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-04-02.
 */
public class PasswordChecker {
    static final String regex_num = "[0-9]";
    static final String regex_alphabet = "[a-zA-Z]";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password : ");
        String inputPassword = scan.nextLine();

        switch (passwordValidator(inputPassword)) {
            case 0 :
                System.out.println("The password \'" + inputPassword + "\' is a very weak password.");
                break;
            case 1 :
                System.out.println("The password \'" + inputPassword + "\' is a weak password.");
                break;
            case 2 :
                System.out.println("The password \'" + inputPassword + "\' is a strong password.");
                break;
            case 3 :
                System.out.println("The password \'" + inputPassword + "\' is a very strong password.");
                break;
        }
    }

    public static int passwordValidator(String input) {
        if (input.length() < 8) {
            for (int i = 0; i < input.length(); i++) {
                if (!input.substring(i, i+1).matches(regex_num)) {
                    // 약한 암호
                    return 1;
                }
            }
            // 아주 약한 암호
            return 0;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (!input.substring(i, i+1).matches(regex_num) && !input.substring(i, i+1).matches(regex_alphabet)) {
                    // 아주 강한 암호
                    return 3;
                }
            }
            // 강한 암호
            return 2;
        }
    }
}
