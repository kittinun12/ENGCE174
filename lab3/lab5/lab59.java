import java.util.Scanner;

class Item {
    protected String name;
    public Item(String name) { this.name = name; }
    public double getValue() {
        return 0.0;
}
}
class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;
    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    @Override
    public double getValue() {
        return unitPrice * quantity;
}
}
class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;
    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }
    @Override
    public double getValue() {
        return monthlyCost * months;
}
}
public class lab59 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String pName = getValue.nextLine();
        double unitPrice = getValue.nextDouble();
        int quantity = getValue.nextInt();
        getValue.nextLine();

        String dName = getValue.nextLine();
        double monthlyCost = getValue.nextDouble();
        int months = getValue.nextInt();

        Item p = new PhysicalProduct(pName, unitPrice, quantity);
        Item d = new DigitalSubscription(dName, monthlyCost, months);

        Item[] items = { p, d };

        double total = 0.0;
        for (Item it : items) {
            total += it.getValue();
        }
        System.out.println("Total Value: " + total);
}
}
