import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNumber = generateRandomNumber(min, max);
        System.out.println("Random Number between " + min + " and " + max + ": " + randomNumber);
    }

    // Method to generate a random number between min and max (inclusive)
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
