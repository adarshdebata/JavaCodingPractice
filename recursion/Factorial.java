
public class Factorial {
    long factorial (long num){
        if (num ==1) return 1;
        else return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        long res = ob.factorial(5); //Data type is long to take bigger inputs
        System.out.println(res);
    }
}