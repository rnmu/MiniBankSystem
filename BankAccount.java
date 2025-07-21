
public class BankAccount {

    private String accountName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showAccountInfo(){
        //Prints the details
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + " OMR");
    }
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " OMR deposited. New balance: " + balance + " OMR");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " OMR withdrawn. New balance: " + balance + " OMR");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
