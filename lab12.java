/*
 * โปรแกรมคำนวณพื้นที่สี่เหลี่ยมผืนผ้า
 * ผู้ใช้ป้อนค่าความกว้าง (width) และความสูง (height)
 * โปรแกรมจะคำนวณ area = width * height
 * และแสดงผลพื้นที่ออกมาพร้อมรูปแบบที่ชัดเจน
 */

import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Input Section =====
        System.out.print("Enter width: ");     // พฤติกรรม I/O ดี
        double width = sc.nextDouble();

        System.out.print("Enter height: ");    // พฤติกรรม I/O ดี
        double height = sc.nextDouble();

        // ===== Process Section =====
        // คำนวณพื้นที่ด้วยสูตรพื้นฐาน area = width * height
        double area = width * height;

        // ===== Output Section =====
        System.out.printf("Rectangle area = %.2f\n", area);

        sc.close();
    }
}
