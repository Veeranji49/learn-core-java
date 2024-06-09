package OOPs.Encapsulation;

public class Encapsulation2 {

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(1234567890, 1000.0, "John Doe");

        // Deposit and withdraw money
        account.deposit(500.0);
        account.withdraw(200.0);

        // Display account details
        account.displayAccountDetails();
    }
}

// Class representing a Bank Account
class BankAccount {
    // Private member variables
    private long accountNumber;
    private double balance;
    private String ownerName;

    // Constructor
    public BankAccount(long accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}