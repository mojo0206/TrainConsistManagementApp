import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==============================");

        // Create LinkedHashSet
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Add duplicate intentionally
        formation.add("Sleeper");

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        // Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}