import java.util.Scanner;
public class LoopDebugging {
    public static void main(String[] args) {
        String userInput = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter string: ");
        userInput = keyboard.next();

        while (userInput != "") {

            System.out.println("Enter Another String: ");
            userInput = keyboard.next();
        }
        keyboard.close();
    }
}
