// Provides an alternative to using multiple if-else statements, making the code cleaner and easier to maintain.

//for this we take input  a number from 1-7 and then  finde respective  day;
import java.util.Scanner;

public class SwitchCaseExample {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter a day number (1-7): ");
             int day = scanner.nextInt();
             switch (day) {
                 case 1 -> System.out.println("Sunday");
                 case 2 -> System.out.println("Monday");
                 case 3 -> System.out.println("Tuesday");
                 case 4 -> System.out.println("Wednesday");
                 case 5 -> System.out.println("Thursday");
                 case 6 -> System.out.println("Friday");
                 case 7 -> System.out.println("Saturday");
                 default -> System.out.println("Invalid day number.");
             }}
    }
}
