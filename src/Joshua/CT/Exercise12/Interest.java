package Joshua.CT.Exercise12;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-13.
 */
public class Interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal, rateofInterest, result;
        int numberofYears;
        String dollars, cents = "";

        System.out.print("Enter the principal: ");
        principal = scan.nextDouble();

        System.out.print("Enter the rate of interest: ");
        rateofInterest = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        numberofYears = scan.nextInt();

        result = principal * (1 + (rateofInterest * numberofYears / 100));
        dollars = String.valueOf((int)result);
        if(Math.floor(result) < result) {
            int temp = (int)Math.ceil( (result - Math.floor(result) ) * 100);
            cents = " " + temp + "Cents";
        }

        System.out.println("After " + numberofYears + " years at " + rateofInterest + "%, the investment will be worth $" + dollars + cents);
    }
}
