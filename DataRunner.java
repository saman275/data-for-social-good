import java.io.FileNotFoundException;

public class DataRunner {
    public static void main(String[] args) {
        // Create a UserStory object with information about the user and purpose
        UserStory userStory = new UserStory("café manager", "analyze customer purchases", "make better stocking decisions");
        System.out.println(userStory.toString());

        // Load data from files and analyze the transactions
        try {
            // Create a CafeTransactionAnalyzer object by loading data from text files
            CafeTransactionAnalyzer analyzer = new CafeTransactionAnalyzer("transactionNumbers.txt", "items.txt");

            // Display the total transactions and unique item count
            System.out.println(analyzer.toString());

            // Show all items sold in the transactions
            analyzer.showItems();

            // Find and display the most common item sold
            String mostCommonItem = analyzer.findMostCommonItem();
            System.out.println("Most common item: " + mostCommonItem);

            // Display promotional message if the most common item is Coffee
            if ("Coffee".equalsIgnoreCase(mostCommonItem)) {
                System.out.println("Coffee is 25% off for a limited time only!");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
