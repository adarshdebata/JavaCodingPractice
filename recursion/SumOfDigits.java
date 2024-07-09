package recursion;
public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is " + sumOfDigits(num));
    }
}

