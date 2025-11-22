import java.util.Scanner;

public class lab13 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

    // ==ส่วนการป้อนข้อมูล==
    System.out.print("Enter numbers:");
    int sum = sc.nextInt();

    // ==ส่วนการประมวลผลและการแสดงผล==
    if (sum % 2 == 0) {
        System.out.println("Even numbers");
        } else {
            System.out.println("Odd numbers");
        }
        sc.close();
    }
    
}
