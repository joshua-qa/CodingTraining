package Joshua.CT.Exercise1;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-02-07.
 */
public class Greeting {
    public static String Concatenation(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

    public static void GreetingPrint(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        String message = Concatenation(name);
        GreetingPrint(message);
    }
}
