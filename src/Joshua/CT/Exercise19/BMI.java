package Joshua.CT.Exercise19;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-29.
 */
public class BMI {
    private static double bmiCal(int height, double weight) {
        return (weight / (height * height)) * 703;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your height? ");
        int height = scan.nextInt();

        System.out.print("What is your weight? ");
        double weight = scan.nextDouble();

        double result = bmiCal(height, weight);

        if (result >= 18.5 && result <= 25) {
            System.out.print("Your BMI is " + String.format("%.1f", result) + ".\n You are within the ideal weight range.");
        } else if (result > 25) {
            System.out.print("Your BMI is " + String.format("%.1f", result) + ".\n You are overweight. You should see your doctor.");
        } else {
            System.out.print("Your BMI is " + String.format("%.1f", result) + ".\n You are underweight. You should see your doctor.");
        }
    }
}
