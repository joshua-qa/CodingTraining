package Joshua.CT.Exercise8;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-06.
 */
public class PizzaParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        System.out.print("How many people? ");
        int people = scan.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = scan.nextInt();
        int piece = 0;

        while(flag == false) {
            System.out.print("How many pieces are in a pizza? ");
            piece = scan.nextInt();

            if(piece % 2 == 0) {
                flag = true;
            } else {
                System.out.println("odd input error");
            }
        }

        int getPiece = (pizza * piece) / people;
        int leftoverPiece = (pizza * piece) % people;

        System.out.println(people + " people with " + pizza + " pizzas");
        System.out.println("Each person gets " + getPiece + " pieces of pizza.\n" +
                "There are " + leftoverPiece + " leftover pieces.");
    }
}
