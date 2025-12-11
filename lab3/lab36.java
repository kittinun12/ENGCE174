import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
        else{
            this.balance = 0;
        }
    }

    public double getBalance() {return this.balance;}
    public void deposit(double amount){
        if(amount > 0 ){
            this.balance = this.balance + amount;
            System.out.println("Deposit successful");
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful");
        }
        else{
            System.out.println("insufficient funds");
        }
    }
}

public class lab36{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("");
        double s = getValue.nextDouble();

        System.out.print("");
        double d = getValue.nextDouble();

        System.out.print("");
        double w = getValue.nextDouble();

        BankAccount objectbank = new BankAccount(s);

        objectbank.deposit(d);
        objectbank.withdraw(w);
        
        System.out.print("Final Balance:" + objectbank.getBalance());
    }
}
