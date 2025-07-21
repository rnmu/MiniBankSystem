public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest of " + interest + " OMR applied at rate: " + interestRate + "%");
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo(); // Call parent version first
        System.out.println("Interest Rate: " + interestRate + "%");
    }

}
