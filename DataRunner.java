public class DataRunner {
    public static void main(String[] args) {
        // Create a UserStory object with information about the user and purpose
        System.out.println("User Story:");
        System.out.println("Role: café manager");
        System.out.println("Goal: analyze customer purchases");
        System.out.println("Purpose: make better stocking decisions");

        // Sample data for transactions and items
        int[] transactionNumbers = {101, 102, 103, 104, 105};
        String[] items = {"Coffee", "Tea", "Coffee", "Muffin", "Coffee"};

        // Create a CafeTransactionAnalyzer object with sample data
        CafeTransactionAnalyzer analyzer = new CafeTransactionAnalyzer(transactionNumbers, items);

        // Display the total transactions
        System.out.println("\nTotal transactions: " + analyzer.countTransactions());

        // Show all items sold in the transactions
        System.out.println("\nItems sold:");
        analyzer.showItems();

        // Find and display the most common item sold
        String mostCommonItem = analyzer.findMostCommonItem();
        System.out.println("\nMost common item: " + mostCommonItem);

        // Display promotional message if the most common item is Coffee
        if ("Coffee".equalsIgnoreCase(mostCommonItem)) {
            System.out.println("\nSpecial Promotion: Coffee is 25% off for a limited time only!");
        }
    }
}
