import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter interger");
        int a = sc.nextInt();   
        System.out.println("Enter interger again");
        int b = sc.nextInt();   

        int sum = a + b;        
        System.out.println(sum); 
    }
}