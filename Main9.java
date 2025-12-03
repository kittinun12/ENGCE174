public class Main9 {
    public static void main(String[] args) {
        // The main method executes all test cases for the four problems.
        System.out.println("==========================================");
        System.out.println("=========== 1. TempConverter =============");
        System.out.println("==========================================");
        // --- Test Cases for TempConverter (Static Methods) ---
        // Problem 1 (image_1df457.png)
        // Test 1: C_TO_F, 100.0 -> 212.0
        double result_c_to_f = TempConverter.celsiusToFahrenheit(100.0);
        System.out.println("C_TO_F (100.0) Output: " + String.format("%.1f", result_c_to_f));
        // Test 2: F_TO_C, 32.0 -> 0.0
        double result_f_to_c = TempConverter.fahrenheitToCelsius(32.0);
        System.out.println("F_TO_C (32.0) Output: " + String.format("%.1f", result_f_to_c));
        // --- End TempConverter ---
        System.out.println("\n==========================================");
        System.out.println("====== 2. BankAccount (Deposit) =========");
        System.out.println("==========================================");
        // --- Test Cases for BankAccountDeposit (image_287502.png) ---
        // Test Case 1: Somsak Jaidee, 1000.0, 500.0 -> 1500.00
        BankAccountDeposit depositAccount1 = new BankAccountDeposit("Somsak Jaidee", 1000.0);
        depositAccount1.deposit(500.0);
        System.out.println("Owner: " + depositAccount1.getOwnerName());
        System.out.println("Balance: " + String.format("%.2f", depositAccount1.getBalance()));
        // Test Case 2: Suda Makmee, 200.75, 1050.25 -> 1251.00
        BankAccountDeposit depositAccount2 = new BankAccountDeposit("Suda Makmee", 200.75);
        depositAccount2.deposit(1050.25);
        System.out.println("Owner: " + depositAccount2.getOwnerName());
        System.out.println("Balance: " + String.format("%.2f", depositAccount2.getBalance()));
        // Test Case 3: Piti Yindee, 0.0, 75.50 -> 75.50
        BankAccountDeposit depositAccount3 = new BankAccountDeposit("Piti Yindee", 0.0);
        depositAccount3.deposit(75.50);
        System.out.println("Owner: " + depositAccount3.getOwnerName());
        System.out.println("Balance: " + String.format("%.2f", depositAccount3.getBalance()));
        // --- End BankAccountDeposit ---
        System.out.println("\n==========================================");
        System.out.println("====== 3. BankAccount (Withdraw) =========");
        System.out.println("==========================================");
        // --- Test Cases for BankAccountWithdraw (image_27f4c3.png) ---
        // Test Case 1: Somsak Jaidee, 1000.0, 200.0, 300.0 -> Balance: 500.00
        System.out.println("--- Test Case 1 Output ---");
        BankAccountWithdraw withdrawAccount1 = new BankAccountWithdraw("Somsak Jaidee", 1000.0);
        withdrawAccount1.withdraw(200.0); 
        withdrawAccount1.withdraw(300.0);
        withdrawAccount1.displayBalance();
        // Test Case 2: Suda Makmee, 500.0, 600.0, 400.0 -> Balance: 100.00
        System.out.println("\n--- Test Case 2 Output ---");
        BankAccountWithdraw withdrawAccount2 = new BankAccountWithdraw("Suda Makmee", 500.0);
        withdrawAccount2.withdraw(600.0); // Insufficient
        withdrawAccount2.withdraw(400.0); // Successful
        withdrawAccount2.displayBalance();
        // Test Case 3: Piti Yindee, 500.0, 300.0, 201.0 -> Balance: 200.00
        System.out.println("\n--- Test Case 3 Output ---");
        BankAccountWithdraw withdrawAccount3 = new BankAccountWithdraw("Piti Yindee", 500.0);
        withdrawAccount3.withdraw(300.0); // Successful
        withdrawAccount3.withdraw(201.0); // Insufficient
        withdrawAccount3.displayBalance();
        // --- End BankAccountWithdraw ---
        System.out.println("\n==========================================");
        System.out.println("========= 4. Address & Student ===========");
        System.out.println("==========================================");
        // --- Test Cases for Address & Student (image_1d0fb7.png / image_1d8f22.png) ---
        // Test Case 1: Somsak Jaidee, 123 Main St, Bangkok, 10200
        System.out.println("--- Test Case 1 Output ---");
        Address address1 = new Address("123 Main St", "Bangkok", "10200");
        Student student1 = new Student("Somsak Jaidee", address1);
        student1.displayProfile();
        // Test Case 2: Suda Makmee, 99/9 Moo 5, Suthep Road, Chiang Mai, 50000
        System.out.println("\n--- Test Case 2 Output ---");
        Address address2 = new Address("99/9 Moo 5, Suthep Road", "Chiang Mai", "50000");
        Student student2 = new Student("Suda Makmee", address2);
        student2.displayProfile();
        // Test Case 3: Piti Yindee, 888 Sukhumvit Road, Chonburi, 20000
        System.out.println("\n--- Test Case 3 Output ---");
        Address address3 = new Address("888 Sukhumvit Road", "Chonburi", "20000");
        Student student3 = new Student("Piti Yindee", address3);
        student3.displayProfile();
        // --- End Address & Student ---
}
}

class TempConverter {
    // Problem 1: Utility Class (Static Methods)
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
class BankAccountDeposit {
    // Problem 2: Bank Account with Deposit (image_287502.png)
    private String ownerName;
    private double balance;
    public BankAccountDeposit(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    // Getter methods for controlled access
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
}
}

class BankAccountWithdraw {
    // Problem 3: Bank Account with Withdraw (image_27f4c3.png)
    private String ownerName;
    private double balance;
    public BankAccountWithdraw(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + String.format("%.2f", this.balance));
}
}

class Address {
    // Problem 4: Address Class (Composition)
    private String street;
    private String city;
    private String zipCode;
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode;
}
}

class Student {
    // Problem 4: Student Class (Composition)
    private String name;
    private Address address; // Composition
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public void displayProfile() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getFullAddress());
}
}