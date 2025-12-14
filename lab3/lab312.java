import java.util.Scanner;
class Employee {

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }


    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
}
}

public class lab312 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String name = getValue.nextLine();
        double monthlySalary = getValue.nextDouble();
        double taxRate = getValue.nextDouble();
        double raiseAmount = getValue.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));

        getValue.close();
}
}
