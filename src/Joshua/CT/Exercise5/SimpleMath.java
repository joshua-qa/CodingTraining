package Joshua.CT.Exercise5;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-02-07.
 */
public class SimpleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstNumber = input.nextLine();
        System.out.print("What is the second number? ");
        String secondNumber = input.nextLine();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber) + "\n") +
                           firstNumber + " - " + secondNumber + " = " + (Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber) + "\n") +
                           firstNumber + " * " + secondNumber + " = " + (Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber) + "\n") +
                           firstNumber + " / " + secondNumber + " = " + (Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber)));
    }
}
