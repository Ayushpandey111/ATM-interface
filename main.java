import java.util.Scanner;

class ATM {
    private int accountNumber;
    private String accountHolderName;
    private float accountBalance;
    private int pin;

    // constructor to define initial values
    public ATM(int accountNumber, String accountHolderName, float accountBalance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    // getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // function to display the current account balance
    public void displayAccountBalance() {
        System.out.println("Your current account balance is: $" + accountBalance);
    }

    // function to handle withdrawals
    public void withdraw(float amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds. Please enter a valid amount.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Your new account balance is: $" + accountBalance);
        }
    }

    // function to handle deposits
    public void deposit(float amount) {
        accountBalance += amount;
        System.out.println("Deposit successful. Your new account balance is: $" + accountBalance);
    }
}

public class main {
    public static void main(String[] args) {
        // initialize the ATM object with initial values
        ATM atm = new ATM(1234567, "John Doe", 5000.00f, 1234);

        // create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int option;
        float amount;

        // loop to handle user input until they choose to exit3
        do {
            System.out.println("\n1. Check account balance");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Deposit cash");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    atm.displayAccountBalance();
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: $");
                    amount = scanner.nextFloat();
                    atm.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter the deposit amount: $");
                    amount = scanner.nextFloat();
                    atm.deposit(amount);
                    break;
                case 4:
                    System.out.println("Exiting the ATM interface.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}