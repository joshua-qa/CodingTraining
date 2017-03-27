package Joshua.CT.Exercise17;

import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-27.
 */
public class Alcohol {
    private final static double BAC_FEMALE = 0.6;
    private final static double BAC_MALE = 0.73;

    public static void main(String[] args) {
        int drink, alcohol, weight, time;
        double bac = 0;
        String gender;
        Scanner scan = new Scanner(System.in);

        System.out.print("음주량 : ");

        while(!scan.hasNextInt()) {
            scan.next();
            System.err.print("잘못 입력하셨습니다. 다시 입력해주세요. ");
        }

        drink = scan.nextInt();

        System.out.print("알코올량 : ");

        while(!scan.hasNextInt()) {
            scan.next();
            System.err.print("잘못 입력하셨습니다. 다시 입력해주세요. ");
        }

        alcohol = scan.nextInt();

        System.out.print("경과시간 : ");

        while(!scan.hasNextInt()) {
            scan.next();
            System.err.print("잘못 입력하셨습니다. 다시 입력해주세요. ");
        }

        time = scan.nextInt();

        System.out.print("몸무게 : ");

        while(!scan.hasNextInt()) {
            scan.next();
            System.err.print("잘못 입력하셨습니다. 다시 입력해주세요. ");
        }

        weight = scan.nextInt();

        System.out.print("성별(M/F) : ");

        gender = scan.next();

        if (gender.equals("M")) {
            bac = ( (drink * alcohol * 0.01 * 5.14) / (BAC_MALE * weight) ) - (time * 0.015);
        } else if (gender.equals("F")) {
            bac = ( (drink * alcohol * 0.01 * 5.14) / (BAC_FEMALE * weight) ) - (time * 0.015);
        }

        System.out.printf("BAC is %.2f", bac);
    }
}
