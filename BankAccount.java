// BankAccount.java
public class BankAccount {
    // Instance variable to store the balance
    private int balance;

    // Constructor initializes the account with zero balance
    public BankAccount() {
        this.balance = 0;
    }

    // Method to deposit Kshs. 1000 into the account
    public void deposit() {
        balance += 1000;
        System.out.println("Deposited Kshs. 1000. New balance: Kshs. " + balance);
    }

    // Method to withdraw Kshs. 1000 from the account
    public void withdraw() {
        balance -= 1000;
        System.out.println("Withdrew Kshs. 1000. New balance: Kshs. " + balance);
    }

    // Method to get the current balance
    public int getBalance() {
        return balance;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Create an account with zero balance
        
        account.deposit(); // Deposit Kshs. 1000
        account.deposit(); // Deposit another Kshs. 1000
        account.withdraw(); // Withdraw Kshs. 1000

        // Display final balance
        System.out.println("Final balance: Kshs. " + account.getBalance());
    }
}
