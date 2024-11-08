import java.util.Scanner;

public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //SSID
        String SSN = InputHelper.getRegExString(scan, "Please enter your SSN with dashes:", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + SSN);

        //student UC code
        String studentMNum = InputHelper.getRegExString(scan, "Please enter your student M number:", "(M|m)\\d{5}");
        System.out.println("Your student M number: " + studentMNum.toUpperCase());

        //lets you pick to navigate from menu
        String menuChoice = InputHelper.getRegExString(scan, "Menu: O - Open, S - Save, V - View, Q - Quit", "[OoSsVvQq]");
        System.out.println("Your choice: " + menuChoice.toUpperCase());
    }
}
