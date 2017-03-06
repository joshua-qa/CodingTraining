package Joshua.CT.Exercise7;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-06.
 */
public class SquareRoom {
    public static void main(String[] args) {
        final double FEET_TO_METER = 0.09290304;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int roomLength = scan.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int roomWidth = scan.nextInt();

        System.out.println("You entered dimensions of " + roomLength + " feet by " + roomWidth + " feet\n" +
                           "The area is");
        int feetSize = roomLength * roomWidth;
        double meterSize = feetSize * FEET_TO_METER;
        System.out.printf("%d square feet\n" +
                          "%.3f square meters", feetSize, meterSize);
    }
}
