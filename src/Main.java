import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String month = scanner.nextLine();

        int budget = UserInputReader.readBudget(scanner);

        int amountSpent = UserInputReader.readAmountSpent(scanner);

        int remainingBudget = budget - amountSpent;
        System.out.println("You spent $" + amountSpent + " in " + month);
        System.out.println("Your remaining budget for "+ month +" is £" + remainingBudget + ".");

        ExpenseWriter.writeToFile(month, budget, amountSpent, remainingBudget);

        ExpenseReader.readFromFile();
    }
}
