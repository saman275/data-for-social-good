public class UserStory {
    // Variables to store the user's role, goal, and benefit
    private String role;
    private String goal;
    private String benefit;

    // Constructor to initialize the role, goal, and benefit
    public UserStory(String role, String goal, String benefit) {
        this.role = role;
        this.goal = goal;
        this.benefit = benefit;
    }

    // Method to return the user story as a single sentence
    public String toString() {
        return "As a " + role + ", I want to " + goal + " so that I can " + benefit + ".";
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);

        // Ask for role
        System.out.print("Enter your role: ");
        String role = scanner.nextLine();

        // Ask for goal
        System.out.print("Enter your goal: ");
        String goal = scanner.nextLine();

        // Ask for benefit
        System.out.print("Enter the benefit: ");
        String benefit = scanner.nextLine();

        // Create a UserStory object
        UserStory userStory = new UserStory(role, goal, benefit);

        // Display the user story
        System.out.println("\nYour User Story:");
        System.out.println(userStory.toString());

        scanner.close();
    }
}
