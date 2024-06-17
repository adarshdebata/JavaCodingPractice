package recursion;
import java.util.Scanner;
public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of Fibonacci series: ");
        int length = in.nextInt();
        
        System.out.println("Fibonacci series up to length " + length + ":");
        for (int i = 0; i < length; i++) {
            System.out.print(fibonacciRecursive(i) + " "); //Print fibonacci series upto desire lenght start form 0 
        }
        
        in.close();
    }
}
