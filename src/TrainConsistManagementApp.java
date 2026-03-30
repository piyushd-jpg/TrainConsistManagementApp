import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        System.out.println("UC5 - Preserve Insertion Order of Bogies\n");

        // LinkedHashSet (order + uniqueness)
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        System.out.println("Adding bogies...");
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Add duplicate
        formation.add("Sleeper"); // duplicate (will be ignored)

        // Final formation
        System.out.println("\nFinal Train Formation: " + formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves order and removes duplicates automatically.");

        System.out.println("\nProgram completed...");
    }
}
