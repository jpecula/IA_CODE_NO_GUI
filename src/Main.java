import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Gets the month from the user
        //System.out.print("Enter the month: ");
       // String month = scanner.nextLine();

        //Gets the budget from the user
        //int budget = UserInputReader.readBudget(scanner);

        //Gets the amount spent from the user
        //int amountSpent = UserInputReader.readAmountSpent(scanner);

        //Calculates the remaining budget
        //int remainingBudget = budget - amountSpent;
        //System.out.println("You spent $" + amountSpent + " in " + month);
        //System.out.println("Your remaining budget for "+ month +" is £" + remainingBudget + ".");

        //ExpenseWriter.writeToFile(month, budget, amountSpent, remainingBudget);

        //ExpenseReader.readFromFile();

        SwingUtilities.invokeLater(() -> new ExpenseTrackerCalendar());
    }
}
