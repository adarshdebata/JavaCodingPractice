// Sum of Cube of  digit = orignal/input
import java.util.Scanner;
public class ArmstrongNumber {
    boolean armstrongNumber(int num) {
        int orignal = num;
        int digit;
        int armNum = 0;
        while (num != 0) {
            digit = num % 10;
            
            //math.pow() only return double so we typecast it to int 
            armNum += (int) Math.pow(digit, 3);  //instead of Math.pow() we can use  digit*digit*digit
            num /= 10;
        }
        return orignal == armNum;
    }

    public static void main(String[] args) {
        ArmstrongNumber ob = new ArmstrongNumber();
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = sc.nextInt();

        if (ob.armstrongNumber(input)) {
            System.out.println("This is an Armstrong Number"); 
        }else {
            System.out.println("No it's not an Armstrong Number");
        }
    }
}