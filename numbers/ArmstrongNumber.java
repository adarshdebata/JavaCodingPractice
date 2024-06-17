/*
Sum of Cube of  digit = orignal/input
*/

import java.lang.Math;
import java.util.Scanner;
public class ArmstrongNumber {
    boolean armstrongNumber(int num){
        int orignal = num;
        int digit;
        int armNum=0;
        while (num!=0){
            digit = num %10;
            //math.pow() only return double so we typecast it to int 
            armNum += (int) Math.pow(digit,3);  //insted of math.pow() we can use  digit*digit*digit and        
            num/=10;
        }
        if (orignal == armNum)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        ArmstrongNumber ob = new ArmstrongNumber();
        Scanner in =new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int input = in.nextInt();
        if(ob.armstrongNumber(input))
            System.out.println("This is an Armstrong Number");
        else
        System.out.println("No it's not an Armstrong Number ");
    }
}