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
/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * @author Developer
 * @version 3.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first [cite: 58]
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // String concatenation
        }

        // Compare the actual content using equals() [cite: 55]
        boolean isPalindrome = input.equals(reversed);

        // Display result [cite: 50]
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            // Compare characters at both pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit the loop immediately if a mismatch is found
            }
            start++; // Move left pointer right
            end--;   // Move right pointer left
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * @author Developer
 * @version 5.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
