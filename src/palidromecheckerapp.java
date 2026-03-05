/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * @author Developer
 * @version 1.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // --- UC2: Hardcoded Palindrome Check ---
        String word = "racecar";
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Checking word: " + word);

        if (word.equals(reversed)) {
            System.out.println("Result: '" + word + "' is a palindrome!");
        } else {
            System.out.println("Result: '" + word + "' is not a palindrome.");
        }
    }
}