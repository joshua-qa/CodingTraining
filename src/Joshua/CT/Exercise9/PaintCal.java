package Joshua.CT.Exercise9;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-06.
 */
public class PaintCal {
    public static void main(String[] args) {
        final int LITER_COVER_METERS = 9;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the length of the room in meter? ");
        int roomLength = scan.nextInt();
        System.out.print("What is the width of the room in meter? ");
        int roomWidth = scan.nextInt();

        double squareMeters = roomLength * roomWidth;
        int purchasePaint = (int)Math.ceil(squareMeters / LITER_COVER_METERS);

        System.out.println("You will need to purchase " + purchasePaint + " liters of paint to cover " + (int)squareMeters + " square meters.");
    }
}