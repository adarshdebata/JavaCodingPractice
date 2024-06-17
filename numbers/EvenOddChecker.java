public class EvenOddChecker {
    boolean check (int num){
        if (num % 2 == 0){
            return true;//or print number is even
        }
        else return false;
    }
    public static void main(String[] args) {
        EvenOddChecker ob = new EvenOddChecker();
    if(ob.check(23))//You can take user input too
        System.out.println("thee number is even");
    else 
    System.out.println("Given number is odd");
    }
}
