import java.util.Scanner;
class Product {

    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0);   
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
}
}
public class lab42 {
    public static void main(String[] args) {

        Scanner getValue = new Scanner(System.in);

        int mode = getValue.nextInt();
        getValue.nextLine(); 

        Product product;

        if (mode == 1) {
            String name = getValue.nextLine();
            product = new Product(name);
        } 
        else if (mode == 2) {
            String name = getValue.nextLine();
            double price = getValue.nextDouble();
            product = new Product(name, price);
        } 
        else {
            return;
        }
        product.displayInfo();
}
}
