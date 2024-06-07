/*
# Why  Learn This?
    - User Interaction: Teaches you how to interact with the user by taking input from the console.
    - Scanner Class: Introduces the `Scanner` class and its methods for reading different types of input.
    - Basic I/O Operations: Understanding input and output operations is fundamental in programming.
 */

// Imports the Scanner class from the java.util package for input reading.
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in use to reads input from the standard input stream (keyboard).
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
//there is also other class known as BufferedReader use for user input