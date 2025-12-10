import java.util.Scanner;
public class lab13 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter numbers:");
    int sum = sc.nextInt();

    if (sum % 2 == 0) {
        System.out.println("Even numbers");
        } else {
            System.out.println("Odd numbers");
        }

        sc.close();
    }
    
}
