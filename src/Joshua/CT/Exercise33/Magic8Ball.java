package Joshua.CT.Exercise33;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Joshua on 2017-04-16.
 */
public class Magic8Ball {

    public static void main(String[] args) {
        List<String> answerArray = Arrays.asList("Yes", "No", "Maybe", "Ask again later", "test", "asdf", "Magic", "Ball");

        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();

        Random pseudo = new Random();

        System.out.println(answerArray.get( pseudo.nextInt(8) ));
    }
}
