import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        System.out.println("Bogies after addition: " + bogies);

        // Remove a bogie
        System.out.println("\n--- Removing a Bogie ---");
        bogies.remove("AC Chair");
        System.out.println("Bogies after removal: " + bogies);

        // Check existence
        System.out.println("\n--- Checking Bogie Existence ---");
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        System.out.println("\nFinal train consist: " + bogies);

        // UC3: Track Unique Bogie IDs using HashSet
        System.out.println("\n=== Tracking Unique Bogie IDs (HashSet) ===");

        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique IDs
        System.out.println("Total unique bogie IDs: " + bogieIds.size());

        System.out.println("\nSystem is ready for further operations...");
    }
}