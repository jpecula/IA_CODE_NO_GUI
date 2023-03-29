import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExpenseWriter {
    public static void writeToFile(String month, int budget, int amountSpent, int remainingBudget) {
        try {
            File file = new File("expenses.txt");
            boolean isNewFile = file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            if (isNewFile) {
                writer.write("MONTH,BUDGET,AMOUNT SPENT,REMAINING BUDGET\n");
            }
            writer.write(month + "," + budget + "," + amountSpent + "," + remainingBudget + "\n");
            writer.close();
            System.out.println("Expense details saved");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
