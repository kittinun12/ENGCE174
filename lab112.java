import java.util.Scanner;

public class lab112 {

    public static void main(String[] args) {
        Scanner readValue = new Scanner(System.in);

        int N = readValue.nextInt();
        int[] productID = new int[N];
        int[] stockQty = new int[N];
        for (int i = 0; i < N; i++) {
            productID[i] = readValue.nextInt();   
            stockQty[i] = readValue.nextInt();    
        }

        int searchID = readValue.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < N; i++) {
            if (productID[i] == searchID) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(stockQty[foundIndex]);
        } else {
            System.out.println("Product not found");
        }
    }
}
