package Joshua.CT.Exercise4;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-02-07.
 */
public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That`s hilarious!");
    }
}
