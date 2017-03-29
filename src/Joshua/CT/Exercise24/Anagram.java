package Joshua.CT.Exercise24;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-29.
 */
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstInput = scan.nextLine();
        System.out.print("Enter the second string: ");
        String secondInput = scan.next();

        if (isAnagram(firstInput, secondInput)) {
            System.out.println("\"" + firstInput + "\" and \"" + secondInput + "\" are anagrams.");
        } else {
            System.out.println("\"" + firstInput + "\" and \"" + secondInput + "\" are not anagrams.");
        }
    }

    private static boolean isAnagram(String firstInput, String secondInput) {
        if (firstInput.length() != secondInput.length()) {
            return false;
        }

        for (int i = 0; i < firstInput.length(); i++) {
            if ( !secondInput.contains(firstInput.substring(i, i+1)) ) {
                return false;
            }
        }

        return true;
    }
}
