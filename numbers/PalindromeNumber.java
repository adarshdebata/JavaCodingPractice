/**
 * This class provides a method to check if a given number is a palindrome.
 * A palindrome number is a number that remains the same when its digits are reversed.
 */
public class PalindromeNumber {

    /*
      Checks if the given number is a palindrome.
      @param num the number to check
      @return true if the number is a palindrome, false otherwise
     */
    boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber ob = new PalindromeNumber();
        int number = 12321232; // Example number
        if (ob.isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }
    }
}
