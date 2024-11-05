import java.util.Scanner;

public class UserStory {

  public UserStory() {
    this.role = "";
    this.goal = "";
    this.benefit = "";
}

    // Variables to store the user's role, goal, and benefit
    private String role;
    private String goal;
    private String benefit;

    // Constructor to set the values for role, goal, and benefit
    public UserStory(String role, String goal, String benefit) {
        this.role = role;
        this.goal = goal;
        this.benefit = benefit;
    }

    // Method to return the user story as a single sentence
    public String toString() {
        return "As a " + role + ", I want to " + goal + " so that I can " + benefit + ".";
    }
}





  
