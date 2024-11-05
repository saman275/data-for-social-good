import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CafeTransactionAnalyzer {
    // Arrays to store transaction data
    private int[] transactionNumbers;
    private String[] items;

    // No-argument constructor 
    public CafeTransactionAnalyzer() {
        this.transactionNumbers = new int[0];
        this.items = new String[0];
    }

    // Constructor to initialize arrays with given data
    public CafeTransactionAnalyzer(int[] transactionNumbers, String[] items) {
        this.transactionNumbers = transactionNumbers;
        this.items = items;
    }

    // Constructor to load data from text files with debug messages
    public CafeTransactionAnalyzer(String transactionFile, String itemFile) throws FileNotFoundException {
        // Check if transaction file exists
        File transFile = new File(transactionFile);
        if (!transFile.exists()) {
            throw new FileNotFoundException("Transaction file not found: " + transFile.getAbsolutePath());
        }

        // Check if item file exists
        File itemFileObj = new File(itemFile);
        if (!itemFileObj.exists()) {
            throw new FileNotFoundException("Item file not found: " + itemFileObj.getAbsolutePath());
        }

        this.transactionNumbers = loadIntArrayFromFile(transactionFile);
        this.items = loadStringArrayFromFile(itemFile);
    }

    // Method to count the number of transactions
    public int countTransactions() {
        return transactionNumbers.length;
    }

    // Method to display all items in transactions
    public void showItems() {
        System.out.println("Items sold in transactions:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    // Enhanced toString method to return a summary of the data
    @Override
    public String toString() {
        // Count unique items by using a stream to get distinct items and then count them
        long uniqueItemCount = java.util.Arrays.stream(items).distinct().count();
        return "Total transactions: " + countTransactions() +
               "\nUnique items sold: " + uniqueItemCount;
    }

    // Method to find the most common item in the items array
    public String findMostCommonItem() {
        HashMap<String, Integer> itemCounts = new HashMap<>();
        for (String item : items) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }

        String mostCommonItem = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonItem = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostCommonItem;
    }

    // Helper method to load an integer array from a file
    private int[] loadIntArrayFromFile(String filename) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Helper method to load a string array from a file
    private String[] loadStringArrayFromFile(String filename) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        scanner.close();
        return list.toArray(new String[0]);
    }
}
