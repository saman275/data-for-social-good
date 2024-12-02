public class CafeTransactionAnalyzer {
    // Arrays to store transaction data
    private int[] transactionNumbers;
    private String[] items;

    // Constructor to initialize arrays with given data
    public CafeTransactionAnalyzer(int[] transactionNumbers, String[] items) {
        this.transactionNumbers = transactionNumbers;
        this.items = items;
    }

    // Method to count the number of transactions
    public int countTransactions() {
        return transactionNumbers.length;
    }

    // Method to display all items in transactions
    public void showItems() {
        System.out.println("Items sold in transactions:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    // Method to find the most common item in the items array
    public String findMostCommonItem() {
        String mostCommonItem = "";
        int maxCount = 0;

        for (int i = 0; i < items.length; i++) {
            int count = 0;
            for (int j = 0; j < items.length; j++) {
                if (items[i].equals(items[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                mostCommonItem = items[i];
                maxCount = count;
            }
        }

        return mostCommonItem;
    }

    // Method to print a summary of the data
    public void printSummary() {
        System.out.println("Total transactions: " + countTransactions());
        System.out.println("Most common item: " + findMostCommonItem());
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Sample data
        int[] transactionNumbers = {101, 102, 103, 104, 105};
        String[] items = {"Coffee", "Tea", "Coffee", "Muffin", "Coffee"};

        // Create a CafeTransactionAnalyzer object
        CafeTransactionAnalyzer analyzer = new CafeTransactionAnalyzer(transactionNumbers, items);

        // Display all items
        analyzer.showItems();

        // Print a summary
        analyzer.printSummary();
    }
}
