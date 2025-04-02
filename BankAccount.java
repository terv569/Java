
public class BankAccount {
    private int balance;
    public BankAccount() {
        this.balance = 0;
    }

    public void deposit() {
        balance += 1000;
        System.out.println("Deposited Kshs. 1000. New balance: Kshs. " + balance);
    }

    public void withdraw() {
        balance -= 1000;
        System.out.println("Withdrew Kshs. 1000. New balance: Kshs. " + balance);
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        account.deposit(); 
        account.deposit(); 
        account.withdraw(); 

        System.out.println("Final balance: Kshs. " + account.getBalance());
    }
}
