public class PalindromeCheckerApp {
    static void main() {


                // Store a predefined string
                String str = "madam";
                boolean isPalindrome = true;

                // Compare characters from both ends
                int length = str.length();
                for (int i = 0; i < length / 2; i++) {
                    if (str.charAt(i) != str.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display the result on the console
                if (isPalindrome) {
                    System.out.println(str + " is a palindrome.");
                } else {
                    System.out.println(str + " is not a palindrome.");
                }

    }
}
