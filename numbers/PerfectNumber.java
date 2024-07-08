public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        boolean isPerfect = checkPerfectNumber(number);
        System.out.println("Is " + number + " a perfect number? " + isPerfect);
    }

    // Method to check if a number is perfect
    public static boolean checkPerfectNumber(int number) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 1;
    }
}
