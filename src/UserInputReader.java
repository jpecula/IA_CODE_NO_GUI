import java.util.Scanner;

public class UserInputReader {

    //Reads the input from the user for the budget
    public static int readBudget(Scanner scanner) {
        int budget = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter your budget for this month: £");
            if (scanner.hasNextInt()) {
                budget = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Please enter an integer value.");
                scanner.nextLine(); //Clears the input
            }
        }
        return budget;
    }

    //Reads the input from the user for the amount spent
    public static int readAmountSpent(Scanner scanner) {
        int amountSpent = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter the amount spent in the current month: £");
            if (scanner.hasNextInt()) {
                amountSpent = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Please enter an integer value.");
                scanner.nextLine(); //Clears the input
            }
        }
        return amountSpent;
    }
}
