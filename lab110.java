import java.util.Scanner;

public class lab110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // จำนวนข้อมูล
        int[] arr = new int[N];    // สร้าง array เก็บข้อมูล

        double sum = 0;            // ใช้ double เพื่อความแม่นยำ

        // รับค่าจำนวนเต็ม N ค่า และบวกสะสม
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // คำนวณค่าเฉลี่ย
        double average = sum / N;

        // แสดงผลลัพธ์
        System.out.println(average);
    }
}
