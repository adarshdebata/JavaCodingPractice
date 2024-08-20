/**
 * This class provides methods to calculate the Least Common Multiple (LCM) of two numbers.
 * The LCM of two numbers is the smallest number that is a multiple of both.
 */
public class LCM {

    /**
     Calculates the LCM of two numbers.
     @param a the first number
      @param b the second number
      @return the LCM of the two numbers
     */
    int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    /**
      Calculates the GCD of two numbers using the Euclidean algorithm.
      @param a the first number
      @param b the second number
      @return the GCD of the two numbers
     */
    int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        LCM ob = new LCM();
        int num1 = 15, num2 = 20; // Example numbers
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + ob.calculateLCM(num1, num2));
    }
}
