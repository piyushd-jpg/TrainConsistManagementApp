import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        System.out.println("UC4 - Maintain Ordered Bogie Consist\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry at position 2 (index 1)
        trainConsist.add(1, "Pantry");
        System.out.println("After adding Pantry at position 2: " + trainConsist);

        // Remove first bogie
        trainConsist.remove(0);

        // Remove last bogie
        trainConsist.remove(trainConsist.size() - 1);

        // Final list
        System.out.println("Final Train Consist: " + trainConsist);

        System.out.println("\nProgram continues...");
    }
}