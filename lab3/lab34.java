import java.util.Scanner;

class Product{
    private String name;
    private static int productCount = 0;

    public Product(String na){
        this.name = na;
        this.productCount += 1;
    }

    public String getName() {return this.name;}
    public static int getProductCount() {return productCount;}

}

public class lab34{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("quantity:");
        int n = getValue.nextInt();
        getValue.nextLine();

        for(int i = 0; i < n; i++) {

            System.out.print("product name:");
            String pn = getValue.nextLine();

            Product objeProduct = new Product(pn);
        }

        System.out.println( Product.getProductCount() );
    }
}