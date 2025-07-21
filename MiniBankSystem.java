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

        Scanner inputReader = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option (1–5): ");
            int option = inputReader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("You selected: Create a new account");
                    break;
                case 2:
                    System.out.println("You selected: Deposit money");
                    break;
                case 3:
                    System.out.println("You selected: Withdraw money");
                    break;
                case 4:
                    System.out.println("You selected: View account details");
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        inputReader.close();
    }

    // --- Menu Display Method ---
    public static void displayMenu() {
        System.out.println("\n=== Mini Bank System Menu ===");
        System.out.println("Option 1: Create a new account");
        System.out.println("Option 2: Deposit money");
        System.out.println("Option 3: Withdraw money");
        System.out.println("Option 4: View account details");
        System.out.println("Option 5: Exit");
    }
}