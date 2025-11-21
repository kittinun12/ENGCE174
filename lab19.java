import java.util.Scanner;

public class lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // รับจำนวนข้อมูล
        int[] arr = new int[N];    // สร้าง array เก็บค่า

        // รับค่าจำนวนเต็ม N ค่า
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // หาค่ามากที่สุดเริ่มจากตัวแรก
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // แสดงผลค่าที่มากที่สุด
        System.out.println(max);
    }
}
