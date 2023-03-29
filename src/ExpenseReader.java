import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExpenseReader {
    public static void readFromFile() {
        try {
            Scanner fileScanner = new Scanner(new File("expenses.txt"));
            System.out.println("\nSaved expenses");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
