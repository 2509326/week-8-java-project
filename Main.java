public class Main {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance
        BankAccount account = new BankAccount("12345", 500);

        // Display
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
    
    // Deposit money
        account.deposit(200);

    // Withdraw money
        account.withdraw(100);

    // Display final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}