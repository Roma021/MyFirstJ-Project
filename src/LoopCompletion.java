import java.util.Scanner;
public class LoopCompletion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a integer: ");
            num = keyboard.nextInt();
            total += num;
            // Loop should end here
        }
        System.out.println("The sum of the integers " + total);

    }
}


