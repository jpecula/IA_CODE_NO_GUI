//Class reads the expenses from a file and prints them
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExpenseReader {
    public static void readFromFile() {
        try {
            //Creates a new scanner object
            Scanner fileScanner = new Scanner(new File("expenses.txt"));
            System.out.println("\nSaved expenses");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            //If there is an error reading the file, error message is printed
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
