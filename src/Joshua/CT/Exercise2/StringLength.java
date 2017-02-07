package Joshua.CT.Exercise2;

import java.util.Scanner;

import static java.lang.Boolean.*;

/**
 * Created by Joshua on 2017-02-07.
 */
public class StringLength {
    public static void main(String[] args) {
        boolean flag = FALSE;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String name = input.nextLine();

        // 도전 과제 1 : 아무 것도 입력하지 않았을 때 검증하기
        while (!flag) {
            if (name.length() <= 0) {
                System.out.print("Invalid input error. what is the input string? ");
                name = input.nextLine();
            } else if (name.length() > 0) {
                flag = TRUE;
            }
        }

        System.out.println(name + " has " + name.length() + " characters.");
    }
}
