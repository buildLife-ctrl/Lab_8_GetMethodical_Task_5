import java.util.Scanner;

public class InputHelper {
    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        String input;
        boolean check = false;

        System.out.println(prompt);
        do {
            input = scan.nextLine();
            if (input.matches(regExPattern)) {
                check = true;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        } while (!check);

        return input;
    }

}
