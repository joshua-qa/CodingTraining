package Joshua.CT.Exercise14;

import java.util.Scanner;

/**
 * Created by jgchoi.qa on 2017. 3. 22..
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = scan.nextDouble();
        System.out.print("What is the state? ");
        String state = scan.next();

        double total = amount + (amount * 0.055);

        // 도전 과제 : 주 이름을 대소문자가 섞인 상태로 입력해도 되도록 프로그램을 수정해보자
        if (state.toUpperCase().equals("WI")) {
            System.out.printf("The subtotal is $%.2f\n", amount);
            System.out.printf("The tax is $%.2f\n", (total - amount));
        }

        System.out.printf("The total is $%.2f", total);
    }
}
