/*
 * โปรแกรมแสดงแม่สูตรคูณของตัวเลขที่ผู้ใช้ป้อน
 * ผู้ใช้ป้อนค่า n (จำนวนเต็ม)
 * โปรแกรมจะแสดง n x 1 ถึง n x 12
 */

import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Input Section =====
        System.out.print("Enter number for multiplication table: ");
        int n = sc.nextInt();

        // ===== Process & Output Section =====
        System.out.println("Multiplication Table of " + n);

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
