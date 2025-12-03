import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in); 
        System.out.println("==========================================");
        System.out.println("=========== Shopping Cart System =========");
        System.out.println("==========================================");
        System.out.print("Enter the number of items (N): ");
        if (!getValue.hasNextInt()) {
            System.out.println("Invalid input for number of items.");
            getValue.close();
            return;
        }
        int numberOfItems = getValue.nextInt();
        getValue.nextLine();

        ShoppingCart cart = new ShoppingCart();
        
        
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\n--- Item " + (i + 1) + " ---");
            System.out.print("Enter product name: ");
            String name = getValue.nextLine();
            System.out.print("Enter product price: ");
            if (!getValue.hasNextDouble()) {
                 System.out.println("Invalid input for price. Item skipped.");
                 getValue.nextLine(); 
                 continue; 
            }
            double price = getValue.nextDouble();
            getValue.nextLine(); 
            Product product = new Product(name, price);
            cart.addProduct(product);
        }

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("\n==========================================");
        System.out.println("Total Price: " + String.format("%.2f", totalPrice));
        System.out.println("==========================================");
        getValue.close();
}
}

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { 
        return price; 
    }
    public String getName() {
        return name;
}
}

class ShoppingCart {

    private Product[] items; 
    private int itemCount;   
    public ShoppingCart() {
        this.items = new Product[10]; 
        this.itemCount = 0;          
    }

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            this.items[itemCount] = p;
            this.itemCount++;
        } else {
            
            System.out.println("Warning: Cart is full. Cannot add " + p.getName() + ".");
        }
    }
    
    public double calculateTotalPrice() {
        double totalPrice = 0.0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += this.items[i].getPrice();
        }
        return totalPrice;
}
}