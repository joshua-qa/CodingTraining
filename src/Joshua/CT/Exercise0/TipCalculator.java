package Joshua.CT.Exercise0;

import java.util.Scanner;

/**
 * Created by jgchoi.qa on 2017. 2. 6..
 */
public class TipCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bill amount : ");
        float billAmount = input.nextFloat();
        System.out.print("tip rate : ");
        int tipRate = input.nextInt();
        float tip, total;

        tip = (float)((tipRate * 0.01) * billAmount);
        total = billAmount + tip;

        System.out.printf("tip : %.2f\n", tip);
        System.out.printf("total : %.2f", total);
    }
}