package Joshua.CT.Exercise3;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-02-07.
 */
public class EscapeCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String name = input.nextLine();

        System.out.println(name + " says, \"" + quote + "\"");
    }
}
