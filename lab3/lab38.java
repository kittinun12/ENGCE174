import java.util.Scanner;
class inventoryitem {
    private String productName;
    private int stock;

    public inventoryitem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() { return this.productName; }
    public int getStock() { return this.stock; }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock = this.stock + amount;
            System.out.println("Stock added");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0 && amount <= this.stock) {   
            this.stock = this.stock - amount;
            System.out.println("Sale successful");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock");
        } else {
            System.out.println("Invalid amount");
        }
}
}

public class lab38 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String p = getValue.nextLine(); 
        int s = getValue.nextInt();    
        int N = getValue.nextInt();     


        inventoryitem obInventoryitem = new inventoryitem(p, s);

        for (int i = 0; i < N; i++) {
            String action = getValue.next(); 
            int amount = getValue.nextInt();

            if (action.equals("ADD")) {
                obInventoryitem.addStock(amount);
            } else if (action.equals("SELL")) {
                obInventoryitem.sellStock(amount);
            }
        }
        System.out.println("Final Stock: " + obInventoryitem.getStock());
}
}
