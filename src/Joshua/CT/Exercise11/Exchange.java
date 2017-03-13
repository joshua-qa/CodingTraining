package Joshua.CT.Exercise11;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-13.
 */
public class Exchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euros, exchangeRate, dollars;

        System.out.print("How many Euros are you exchanging? ");
        euros = scan.nextDouble();

        System.out.print("What is the exchange rate? ");
        exchangeRate = scan.nextDouble();

        dollars = (euros * exchangeRate) / 100;
        System.out.printf("%.2f Euros at an exchange rate of %.2f is %.2f dollars", euros, exchangeRate, dollars);
    }
}
