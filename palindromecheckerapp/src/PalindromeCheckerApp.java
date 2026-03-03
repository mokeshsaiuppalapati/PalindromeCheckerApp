import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";   // Change this value if needed

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both Stack and Queue
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.offer(ch);     // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare pop (stack) and dequeue (queue)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}