/**
  - This class provides a method to calculate the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
  - The GCD/HCF of two numbers is the largest number that divides both of them without leaving a remainder.
 */
public class GCD {

    /** 
      Calculates the GCD of two numbers.
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
        GCD ob = new GCD();
        int num1 = 56, num2 = 98; // Example numbers
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + ob.calculateGCD(num1, num2));
    }
}
