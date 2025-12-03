import java.util.Scanner;
// Main Class containing the main() method and the entry point of the program
public class Main7 {
    public static void main(String[] args) {
        // Use Scanner to read input values
        Scanner inputReader = new Scanner(System.in); 
        // --- Test Case 1 ---
        // Input for Test Case 1 (4 lines of input)
        String name1 = inputReader.nextLine(); // Owner name: Somsak Jaidee
        double initialBalance1 = inputReader.nextDouble(); // Initial Balance: 1000.0
        double withdrawAmount1_1 = inputReader.nextDouble(); // 1st Withdrawal amount: 200.0
        double withdrawAmount1_2 = inputReader.nextDouble(); // 2nd Withdrawal amount: 300.0
        inputReader.nextLine(); // Consume the remaining newline character
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(name1, initialBalance1);
        // Perform withdrawal operations and display output
        System.out.println("--- Test Case 1 Output ---");
        account1.withdraw(withdrawAmount1_1); 
        account1.withdraw(withdrawAmount1_2);
        account1.displayBalance();
        // --- Test Case 2 ---
        // Input for Test Case 2 (4 lines of input)
        String name2 = inputReader.nextLine(); // Owner name: Suda Makmee
        double initialBalance2 = inputReader.nextDouble(); // Initial Balance: 500.0
        double withdrawAmount2_1 = inputReader.nextDouble(); // 1st Withdrawal amount: 600.0
        double withdrawAmount2_2 = inputReader.nextDouble(); // 2nd Withdrawal amount: 400.0
        inputReader.nextLine(); // Consume the remaining newline character
        BankAccount account2 = new BankAccount(name2, initialBalance2);
        // Perform withdrawal operations and display output
        System.out.println("\n--- Test Case 2 Output ---");
        account2.withdraw(withdrawAmount2_1); 
        account2.withdraw(withdrawAmount2_2); 
        account2.displayBalance();
        // --- Test Case 3 ---
        // Input for Test Case 3 (4 lines of input)
        String name3 = inputReader.nextLine(); // Owner name: Piti Yindee
        double initialBalance3 = inputReader.nextDouble(); // Initial Balance: 500.0
        double withdrawAmount3_1 = inputReader.nextDouble(); // 1st Withdrawal amount: 300.0
        double withdrawAmount3_2 = inputReader.nextDouble(); // 2nd Withdrawal amount: 201.0
        // No inputReader.nextLine() needed as the Scanner will be closed next
        BankAccount account3 = new BankAccount(name3, initialBalance3);
        // Perform withdrawal operations and display output
        System.out.println("\n--- Test Case 3 Output ---");
        account3.withdraw(withdrawAmount3_1);
        account3.withdraw(withdrawAmount3_2);
        account3.displayBalance();
        // Close the Scanner resource
        inputReader.close();
}
}
// BankAccount Class defined within the same file (Package-private access)
class BankAccount {
    // Attributes
    String ownerName;
    double balance;
    // Constructor to initialize attributes: ownerName and initialBalance
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    /**
     * Method: withdraw(double amount)
     * Task: Attempts to withdraw the specified amount. 
     * If amount is valid (amount > 0 and amount <= balance), deducts the amount and prints "Withdrawal successful.".
     * Otherwise, prints "Insufficient funds.".
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    /**
     * Method: displayBalance()
     * Task: Prints the final remaining balance, formatted to two decimal places.
     * Output format: "Balance: [Final Balance]"
     */
    public void displayBalance() {
        // Use String.format to ensure two decimal places for the balance
        System.out.println("Balance: " + String.format("%.2f", this.balance));
}
}