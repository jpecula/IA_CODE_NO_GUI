import java.util.Scanner;

public class UserInputReader {
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
                scanner.nextLine(); // clear the input buffer
            }
        }
        return budget;
    }

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
                scanner.nextLine(); // clear the input buffer
            }
        }
        return amountSpent;
    }
}
