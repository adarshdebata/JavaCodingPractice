import java.util.Random;  // Importing Random class to simulate random outcomes

// Abstract class representing a Payment
abstract class Payment {
    // Abstract method (must be implemented by subclasses)
    abstract void makePayment(double amount);

    // Concrete method to display payment details
    public void showPaymentDetails(double amount) {
        System.out.println("Payment amount: $" + amount);
    }

    // Method to randomly determine if the payment was successful or failed
    public boolean isPaymentSuccessful() {
         Random random = new Random();
    int chance = random.nextInt(100);  // Generates a number between 0 and 99
    return chance < 90;  // 90% chance for success (0-89 means success, 90-99 means failure)
    }

    // Method to handle payment result based on success or failure
    public void processPaymentOutcome(boolean success) {
        if (success) {
            System.out.println("Payment was successful!");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}

// Subclass representing Credit Card Payment
class CreditCardPayment extends Payment {
    private final String cardNumber;

    // Constructor to initialize card number
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implementing the abstract method
    @Override
    public void makePayment(double amount) {
        showPaymentDetails(amount);
        System.out.println("Processing credit card payment with card: " + cardNumber);

        // Simulating success or failure
        boolean success = isPaymentSuccessful();
        processPaymentOutcome(success);
    }
}

// Subclass representing PayPal Payment
class PayPalPayment extends Payment {
    private final String email;

    // Constructor to initialize PayPal email
    public PayPalPayment(String email) {
        this.email = email;
    }

    // Implementing the abstract method
    @Override
    public void makePayment(double amount) {
        showPaymentDetails(amount);
        System.out.println("Processing PayPal payment with email: " + email);

        // Simulating success or failure
        boolean success = isPaymentSuccessful();
        processPaymentOutcome(success);
    }
}

public class AbstractionByClass {
    public static void main(String[] args) {
        // Creating a Credit Card Payment object and making a payment
        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        creditCardPayment.makePayment(150.75);

        System.out.println();

        // Creating a PayPal Payment object and making a payment
        Payment payPalPayment = new PayPalPayment("user@example.com");
        payPalPayment.makePayment(99.99);
    }
}
