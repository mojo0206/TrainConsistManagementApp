import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC1: Initialization
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized successfully.");
        System.out.println("Current number of bogies: " + bogies.size());

        // UC2: Add Passenger Bogies
        System.out.println("\n--- Adding Passenger Bogies ---");

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after addition
        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie (AC Chair)
        System.out.println("\n--- Removing a Bogie ---");
        bogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("Bogies after removal: " + bogies);

        // Check existence of a bogie
        System.out.println("\n--- Checking Bogie Existence ---");
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // Final state
        System.out.println("\nFinal train consist: " + bogies);
        System.out.println("Total number of bogies: " + bogies.size());

        System.out.println("\nSystem is ready for further operations...");
    }
}