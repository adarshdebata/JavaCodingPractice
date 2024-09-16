class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class CustomException {

    // Method that throws an exception if funds are insufficient
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Throwing a custom exception
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        } else {
            System.out.println("Withdrawal successful! New balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        double balance = 500.00;  // Initial balance
        double withdrawalAmount = 600.00;  // Attempt to withdraw more than balance

        try {
            // Attempt to withdraw money
            withdraw(balance, withdrawalAmount);
        } catch (InsufficientFundsException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
