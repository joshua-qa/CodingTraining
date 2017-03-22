package Joshua.CT.Exercise15;

import java.io.Console;
import java.util.HashMap;

/**
 * Created by jgchoi.qa on 2017. 3. 22..
 */
public class PasswordValidation {
    public static void main(String[] args) {
        HashMap<String, String> account = new HashMap();

        Console console = null;

        // 도전과제 : 사용자 이름과 암호로 구성된 Map을 만들어 사용자 이름과 암호 조합을 찾도록 하기
        account.put("Joshua", "test1234");

        // 도전과제 : 암호를 입력할 때 화면에 아무것도 나타나지 않게 하기
        try {
            console = System.console();

            if (console != null) {
                String username = console.readLine("What is the username: ");

                char[] pwd = console.readPassword("What is the password: ");
                String password = new String(pwd);
                System.out.println(password);
                if (account.get(username).equals(password)) {
                    System.out.println("Welcome!");
                } else {
                    System.out.println("That password is incorrent.");
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
