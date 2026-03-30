import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        System.out.println("UC3 - Track Unique Bogie IDs\n");

        // Create HashSet (stores only unique values)
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (including duplicates)
        System.out.println("Adding bogie IDs...");
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display final set
        System.out.println("\nFinal Unique Bogie IDs: " + bogies);

        System.out.println("\nDuplicates are automatically removed by HashSet.");
        System.out.println("\nProgram continues...");
    }
}