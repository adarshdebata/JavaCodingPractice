package loops;

// The `do-while` loop is used when the block of code needs to be executed at least once.
/*
//  basic example
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1; //initialization
        
        // Start the loop
        do {
            System.out.println("Number: " + i);
            i++; //increment
        } while (i <= 5); //condition
    }
}
*/
/*
for below example
 Inside the loop, we prompt the user to guess the number between 1 and 10 (System.out.print("Guess the number (between 1 and 10): ");).
We read the user's input as an integer (guess = scanner.nextInt();).
 */
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int secretNumber = 7; // The secret number to be guessed
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");

        // Start the loop
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Sorry, that's not the correct number. Please try again.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
