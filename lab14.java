/*
 * โปรแกรมแปลงคะแนนเป็นเกรด A–F
 * ผู้ใช้ป้อนคะแนนตัวเลข (0–100)
 * จากนั้นโปรแกรมตรวจสอบช่วงคะแนนแล้วแสดงผลเกรด
 */

import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Input Section =====
        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        // ===== Process & Output Section =====
        if (score >= 80 && score <= 100) {
            System.out.println("A");
        } 
        else if (score >= 70) {
            System.out.println("B");
        } 
        else if (score >= 60) {
            System.out.println("C");
        } 
        else if (score >= 50) {
            System.out.println("D");
        } 
        else if (score >= 0) {
            System.out.println("F");
        }
        else {
            // กรณีคนใส่คะแนนติดลบ หรือเกิน 100
            System.out.println("Invalid score");
        }

        sc.close();
    }
}
