import java.util.Scanner;
// Main Class containing the main() method and the entry point of the program
public class Main6 {
    public static void main(String[] args) {
        // Use Scanner to read input values
        Scanner getValue = new Scanner(System.in); // Changed 'getValue' to 'inputReader' for better readability
        // --- Test Case 1 ---
        // Input for Test Case 1
        String name1 = getValue.nextLine(); // Owner name: Somsak Jaidee
        double initialBalance1 = getValue.nextDouble(); // Initial Balance: 1000.0
        double depositAmount1 = getValue.nextDouble(); // Deposit amount: 500.0
        getValue.nextLine(); // Consume the remaining newline character
        // Create a BankAccount object
        BankAccount account1 = new BankAccount(name1, initialBalance1);
        // Perform deposit operation
        account1.deposit(depositAmount1);
        // Display the output
        System.out.println("Owner: " + account1.ownerName);
        // Use String.format("%.2f") to ensure two decimal places for the balance
        System.out.println("Balance: " + String.format("%.2f", account1.balance));
        // --- Test Case 2 ---
        // Input for Test Case 2
        String name2 = getValue.nextLine(); // Owner name: Suda Makmee
        double initialBalance2 = getValue.nextDouble(); // Initial Balance: 200.75
        double depositAmount2 = getValue.nextDouble(); // Deposit amount: 1050.25
        getValue.nextLine(); // Consume the newline character
        BankAccount account2 = new BankAccount(name2, initialBalance2);
        account2.deposit(depositAmount2);
        // Display the output
        System.out.println("Owner: " + account2.ownerName);
        System.out.println("Balance: " + String.format("%.2f", account2.balance));
        // --- Test Case 3 ---
        // Input for Test Case 3
        String name3 = getValue.nextLine(); // Owner name: Piti Yindee
        double initialBalance3 = getValue.nextDouble(); // Initial Balance: 0.0
        double depositAmount3 = getValue.nextDouble(); // Deposit amount: 75.50
        // No inputReader.nextLine() needed as the Scanner will be closed next
        BankAccount account3 = new BankAccount(name3, initialBalance3);
        account3.deposit(depositAmount3);
        // Display the output
        System.out.println("Owner: " + account3.ownerName);
        System.out.println("Balance: " + String.format("%.2f", account3.balance));
        // Close the Scanner resource
        getValue.close();
}
}
// BankAccount Class defined within the same file
class BankAccount {
    // Attributes
    String ownerName;
    double balance;
    // Constructor to initialize attributes
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    // Method: deposit(double amount)
    // Task: Add the deposit amount to the current balance if it is positive
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    // Method: display() or displaySummary()
    // Task: Display the owner's name and remaining balance (Kept 'display' as in your provided code, but 'displaySummary' is clearer)
    public void display() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Balance: " + String.format("%.2f", this.balance));
}
}