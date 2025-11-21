import java.util.Scanner;

public class lab18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();        // จำนวนตัวเลขที่จะรับต่อไป
        int[] arr = new int[N];      // สร้าง array สำหรับเก็บ N ค่า

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();   // รับค่าแต่ละตัวเก็บใน array
        }

        int max = arr[0];            // ตั้งค่ามากสุดเริ่มต้นเป็นตัวแรก

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];        // ถ้าตัวไหนมากกว่า max ให้แทนค่าใหม่
            }
        }

        System.out.println(max);     // แสดงผลค่ามากที่สุด
    }
}
