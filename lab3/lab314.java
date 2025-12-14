import java.util.Scanner;
class BankAccount {

    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= balance) {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
}
}

public class lab314 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        BankAccount myAccount = null;

        int N = Integer.parseInt(getValue.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String cmd = getValue.nextLine().trim();

            if (cmd.equals("CREATE")) {
                double initial = Double.parseDouble(getValue.nextLine().trim());
                myAccount = new BankAccount(initial);

            } else if (cmd.equals("DEPOSIT")) {
                double amount = Double.parseDouble(getValue.nextLine().trim());
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }

            } else if (cmd.equals("WITHDRAW")) {
                double amount = Double.parseDouble(getValue.nextLine().trim());
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }

            } else if (cmd.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (cmd.equals("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
            }
        }

        getValue.close();
}
}
