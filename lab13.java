import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // รับค่าจำนวนเต็ม 1 จำนวน

        if (num % 2 == 0) {
            System.out.println("Even");  // ถ้า mod 2 เหลือ 0 = เลขคู่
        } else {
            System.out.println("Odd");   // ถ้าไม่ใช่ = เลขคี่
        }
    }
}
