
public class Throw {

    public static void checkAge(int age) {
        if (age < 18) {
            // Explicitly throw an exception
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(18);
            checkAge(16);  // This will throw an exception
        } catch (IllegalArgumentException err) {
            System.out.println("Exception caught: " + err.getMessage());
        }
    }
}
