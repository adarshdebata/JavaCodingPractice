package recursion;//Ignore this if you don't under stand nut better if you get a read about it
public class Factorial {
    
    long factorial (long num){
        if (num ==1) return 1;
        else return num * factorial(num-1);
    }

    //you can also create a main class for main function
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        long res = ob.factorial(6); //Data type is long to take bigger inputs
        System.out.println(res);
    }
}