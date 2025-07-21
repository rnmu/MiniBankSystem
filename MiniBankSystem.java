import java.util.Scanner;

public class MiniBankSystem {

    public static void main(String[] args) {

        // Create two BankAccount objects
        BankAccount account1 = new BankAccount("Liam Carter", "ACC123", 100.0);
        BankAccount account2 = new BankAccount("Alex Smith", "ACC456", 250.0);

        // Display account details
        System.out.println("Account 1");
        account1.showAccountInfo();

        System.out.println("Account 2");
        account2.showAccountInfo();

        displayMenu();
    }

        // --- Menu Display Method ---
        public static void displayMenu () {
            System.out.println("\n=== Mini Bank System Menu ===");
            System.out.println("Option 1: Create a new account");
            System.out.println("Option 2: Deposit money");
            System.out.println("Option 3: Withdraw money");
            System.out.println("Option 4: View account details");
            System.out.println("Option 5: Exit");
        }
    }