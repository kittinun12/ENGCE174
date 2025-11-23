import java.util.Scanner;

public class lab112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Please enter the number of product types (N):");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: N must be an integer.");
            scanner.close();
            return;
        }
        int N = scanner.nextInt(); 

        
        int[] productIDs = new int[N];
        int[] stockQuantities = new int[N];

        System.out.println("Please enter data for " + N + " products (ID and Quantity):");
        
        
        for (int i = 0; i < N; i++) {
            
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Invalid Product ID data at item " + (i + 1));
                scanner.close();
                return;
        }
            productIDs[i] = scanner.nextInt();
            
            
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Invalid Quantity data at item " + (i + 1));
                scanner.close();
                return;
        }
            stockQuantities[i] = scanner.nextInt();
        }

        
        System.out.println("Please enter the Product ID (Search ID) to look up:");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Search ID must be an integer.");
            scanner.close();
            return;
        }
        int searchID = scanner.nextInt();
        
        
        int foundQuantity = -1; 
        
        for (int i = 0; i < N; i++) {
            if (productIDs[i] == searchID) {
                
                foundQuantity = stockQuantities[i];
                break; 
        }
    }

        
        System.out.print("\nOutput: ");
        if (foundQuantity != -1) {
            
            System.out.println(foundQuantity);
        } else {
            
            System.out.println("Product " + searchID + " not found");
        }

    scanner.close();
}
}