import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculatePay() {
        return baseSalary;
}
}
class SalesEmployee extends Employee {
    protected double commissionRate;
    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
}
}
class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }
    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
}
}
class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
}
}
public class lab57 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String salesName = getValue.nextLine();
        double salesSalary = getValue.nextDouble();
        double rate = getValue.nextDouble();
        getValue.nextLine();

        String managerName = getValue.nextLine();
        double managerSalary = getValue.nextDouble();
        double bonus = getValue.nextDouble();

        SalesEmployee se = new SalesEmployee(salesName, salesSalary, rate);
        Manager mg = new Manager(managerName, managerSalary, bonus);

        PayrollProcessor.process(se);
        PayrollProcessor.process(mg);
}
}
