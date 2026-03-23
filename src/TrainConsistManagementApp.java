import java.util.ArrayList;
import java.util.List;

 public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Display welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize train consist (empty list of bogies)
        List<String> bogies = new ArrayList<>();

        // Step 3: Display initialization message
        System.out.println("Train consist initialized successfully.");

        // Step 4: Display initial bogie count
        System.out.println("Current number of bogies: " + bogies.size());

        // Step 5: Program continues (future use cases will extend here)
        System.out.println("System is ready for further operations...");
    }
}