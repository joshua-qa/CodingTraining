package Joshua.CT.Exercise16;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-27.
 */
public class LegallyDrive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        boolean flag = false;

        while (!flag) {
            System.out.print("What is your age? ");

            age = scan.nextInt();

            if (age >= 0) {
                flag = true;
            } else {
                System.out.println("input error");
            }
        }

        System.out.printf("You are%s old enough to legally drive.", age >= 16 ? "" : " not");
    }
}
