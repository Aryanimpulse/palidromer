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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * @author Developer
 * @version 6.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic"; //

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>(); //

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>(); //

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) { //
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true; //

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) { //
            // queue.remove() gets the first item (FIFO)
            // stack.pop() gets the last item (LIFO)
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break; // Exit early if a mismatch occurs
            }
        }

        // Display the result
        System.out.println("Input : " + input); //
        System.out.println("Is Palindrome? : " + isPalindrome); //
    }
}
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */

public class palidromecheckerapp {
    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "refer"; // [cite: 125]

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>(); // [cite: 125]

        // Add each character to the deque
        for (char c : input.toCharArray()) { // [cite: 125]
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true; // [cite: 125]

        // Continue comparison while more than one element exists
        while (deque.size() > 1) { // [cite: 125]
            // Compare the first and last elements
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
        }

        // Display the result
        System.out.println("Input : " + input); //
        System.out.println("Is Palindrome? : " + isPalindrome); //
    }
}
import java.util.LinkedList;

/**
 * ============================================================================
 * MAIN CLASS - palidromecheckerapp
 * ============================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */
public class palidromecheckerapp {
    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level"; // [cite: 142]

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>(); // [cite: 142]

        // Add each character to the linked list
        for (char c : input.toCharArray()) { // [cite: 142]
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true; // [cite: 142]

        // Compare until only one or zero elements remain
        while (list.size() > 1) { // [cite: 142]
            // Remove from front and back and compare
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
        }

        // Display the result
        System.out.println("Input : " + input); //
        System.out.println("Is Palindrome? : " + isPalindrome); //
    }
}
/**
 * Use Case 9: Recursive Palindrome Checker
 * @author Developer
 * @version 9.0
 */
public class palidromecheckerapp {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = check(input, 0, input.length() - 1);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) return true; // Base Condition
        if (s.charAt(start) != s.charAt(end)) return false; // Mismatch
        return check(s, start + 1, end - 1); // Recursive call
    }
}
/**
 * Use Case 10: Normalized Palindrome Validation
 * @author Developer
 * @version 10.0
 */
public class palidromecheckerapp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        // Remove spaces/symbols and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
/**
 * Use Case 11: Object-Oriented Palindrome Service
 * @author Developer
 * @version 11.0
 */
public class palidromecheckerapp {
    public static void main(String[] args) {
        String input = "racecar";
        PalindromeService service = new PalindromeService();
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + service.checkPalindrome(input));
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
/**
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * @author Developer
 * @version 12.0
 */
public class palidromecheckerapp {
    public static void main(String[] args) {
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + strategy.check(input));
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}