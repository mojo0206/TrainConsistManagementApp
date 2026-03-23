import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("==============================");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display capacity details
        System.out.println("\nBogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 mapping completed...");
    }
}