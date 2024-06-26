package loops;
/*
 The while loop is used to execute a block of code repeatedly as long as a specified condition is true. 
 It's useful when the number of iterations is not known beforehand and depends on the condition.
 */
/*
//Basic example
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1; //Initialization (int i = 1;):
        while (i <= 5) { //Condition (i <= 5;)
            System.out.println("Count is: " + i);
            i++; //Increment (i++)
        }
    }
}
    //after iteration i =6 ;
*/
import java.util.Scanner; 

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter a positive integer:");

        // Not sure about number of iteration *ignore try catch we understand this in exceptiion handling
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());

                // Check if the number is positive
                if (number > 0) {
                    break; // Exit the loop if a positive integer is entered
                } else {
                    System.out.println("Please enter a positive integer:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer:");
            }
        }

        System.out.println("Thank you! You entered: " + number);
        scanner.close();
    }
}
