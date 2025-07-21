
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

}
