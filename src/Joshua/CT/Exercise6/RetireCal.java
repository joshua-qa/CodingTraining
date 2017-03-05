package Joshua.CT.Exercise6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Joshua on 2017-03-05.
 */
public class RetireCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int currentAge, retireAge, remainYear = 0;

        // * 도전 과제
        // 이미 퇴직했을 나이를 입력하면 음수 값이 출력하는 상황이 발생하는데, 이 상황을 해결하도록 프로그램을 수정해보자.
        while(flag == false) {
            System.out.print("What is your current age? ");
            currentAge = scan.nextInt();
            System.out.print("At What age would you like to retire? ");
            retireAge = scan.nextInt();
            remainYear = retireAge - currentAge;

            if (remainYear >= 0 && currentAge > 0 && retireAge > 0) {
                flag = true;
            } else {
                System.out.println("input error.");
            }
        }

        // 올해 년도를 프로그램에 직접 넣지 말 것. 대신 프로그래밍 언어를 통해 시스템 날짜를 구해서 사용할 것.
        long time = System.currentTimeMillis();
        SimpleDateFormat dayTime = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt( dayTime.format(new Date(time)) );
        int retireYear = currentYear + remainYear;

        System.out.println("You have " + remainYear + " years left until you can retire.");
        System.currentTimeMillis();

        System.out.println("It`s " + currentYear + ", so you can retire in " + retireYear + ".");
    }
}