package Joshua.CT.Exercise13;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-15.
 */
public class Compound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal, rate, result;
        int numberofYears, compoundedPerYear;

        System.out.print("What is the principal amount? ");
        principal = scan.nextDouble();

        System.out.print("What is the rate: ");
        rate = scan.nextDouble();

        System.out.print("What is the number of years: ");
        numberofYears = scan.nextInt();

        System.out.print("What is the number of times the interest is compounded per year: ");
        compoundedPerYear = scan.nextInt();

        rate = rate / 100;

        result = principal * Math.pow((1 + (rate / compoundedPerYear)), compoundedPerYear * numberofYears);

        System.out.println("$" + principal + " invested at " + rate * 100 + "% for " + numberofYears + " years compounded " + compoundedPerYear + " times per year is $" + String.format("%.2f", result));
    }
}
