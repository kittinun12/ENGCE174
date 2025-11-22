/*
 * โปรแกรมตรวจสอบว่าเลขเป็น "Even" หรือ "Odd"
 * ผู้ใช้ป้อนจำนวนเต็ม 1 จำนวน
 * ถ้า num % 2 == 0 → แสดง Even
 * ถ้าไม่ใช่ → แสดง Odd
 */

import java.util.Scanner;

public class lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Input Section =====
        System.out.print("Enter an integer: ");  
        int num = sc.nextInt();

        // ===== Process & Output Section =====
        if (num % 2 == 0) {
            System.out.println("Even");   // เลขคู่
        } else {
            System.out.println("Odd");    // เลขคี่
        }

        sc.close();
    }
}
