import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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
        }

        // UC3: HashSet for Unique IDs
        System.out.println("\n=== Tracking Unique Bogie IDs (HashSet) ===");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // UC4: LinkedList for Ordered Train Consist
        System.out.println("\n=== Maintaining Ordered Train Consist (LinkedList) ===");

        LinkedList<String> train = new LinkedList<>();

        // Add bogies in order
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial train consist: " + train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("Final train consist after removals: " + train);

        System.out.println("\nSystem is ready for further operations...");
    }
}