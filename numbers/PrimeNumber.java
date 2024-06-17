public class PrimeNumber  {
    //function for prime number detect
    boolean primeNum(int num){
        if (num <2)
            return false;
        else if (num ==2) {
                return true;
         }
         else{
            for (int i = 3; i<num/2 ; i++ ){
                if(num%i==0)
                    return false;
            }
         }
         return true;
    }
    public static void main(String[] args) {
        PrimeNumber ob = new PrimeNumber();
        for (int j= 1; j<=100; j++){ // We can find prime number upto n here n=100;
            if(ob.primeNum(j)){
                System.out.print(j + " ");
            }
        }
    }
}