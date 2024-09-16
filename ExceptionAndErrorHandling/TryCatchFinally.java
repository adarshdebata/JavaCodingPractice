
public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 1 / 0;
            System.out.println(result);

            // String text = null;
            // int length = text.length();  // This will cause NullPointerException
            // System.out.println(length);

        } catch (ArithmeticException err) {
            // Handling specific exception
            System.out.println("Error: Division by zero is not allowed.");

        } catch (Exception err) {
            // Handling any other exception
            System.out.println("Error: " + err.getMessage());

        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }
    }
}
