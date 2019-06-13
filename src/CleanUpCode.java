import java.util.Scanner;
public class CleanUpCode {
    public static void main(String[] args) {

        //  Renamed variables
        Scanner keyboard = new Scanner(System.in);
        double loan = 0;
        double interest = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int trm;
        // Ask user for input and repeat
        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        interest = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

        // Renamed variables and calculations
        monthlyPayment = processSomething(loan, interest, trm);
        balance = -(monthlyPayment*(trm*12));

        // The Outputs
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
    }

    // Calcualtes and loops user responce
    public static double processSomething(double loan, double interest, int trm) {
        double rate = (interest/ 100) / 12;
        double base = (1 + rate);
        double months = trm* 12;
        double result = 0.0;
        result = ((rate * loan) / (1 - Math.pow(base, -months)));

        return result;
    }
}
