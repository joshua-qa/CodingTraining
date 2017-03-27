package Joshua.CT.Exercise18;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-27.
 */
public class Temperature {
    private static double Calculate (int temperature, String type) {
        double result = 0;
        if (type.equals("C")) {
            result = (temperature - 32) * (5 / 9);
        } else if (type.equals("F")) {
            result = (temperature * 9 / 5) + 32;
        }

        return result;
    }

    public static void main(String[] args) {
        double result = 0;
        int temperature;
        Scanner scan = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour Choice: ");
        String type = scan.next();

        if (type.equals("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temperature = scan.nextInt();
            result = Calculate(temperature, type);
            System.out.printf("The temperature in Celsius is %d.", (int)result);
        } else if (type.equals("F")) {
            System.out.print("Please enter the temperature in Celsius: ");
            temperature = scan.nextInt();
            result = Calculate(temperature, type);
            System.out.printf("The temperature in Fahrenheit is %d.", (int)result);
        }
    }
}
