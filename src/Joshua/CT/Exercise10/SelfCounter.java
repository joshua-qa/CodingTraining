package Joshua.CT.Exercise10;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-06.
 */
public class SelfCounter {
    public static void main(String[] args) {
        final double TAX_FEE = 0.055;
        Scanner scan = new Scanner(System.in);
        int itemCount = 0, totalQuantity = 0;
        int itemPrice, itemQuantity;
        double tax, totalPrice, subTotal = 0;
        boolean flag = true;

        // 도전 과제는 추후에..
        while(flag) {
            itemCount++;
            System.out.print("Price of item " + itemCount + ": ");
            itemPrice = scan.nextInt();
            System.out.print("Quantity of item " + itemCount + ": ");
            itemQuantity = scan.nextInt();

            subTotal += itemPrice * itemQuantity;
            if(itemCount == 3) {
                break;
            }
        }
        tax = subTotal * TAX_FEE;
        totalPrice = subTotal + tax;

        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + totalPrice);
    }
}
