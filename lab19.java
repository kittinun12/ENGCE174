import java.util.Scanner;

public class lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();      // จำนวนข้อมูล
        int[] arr = new int[N];    // สร้าง array

        double sum = 0;            // เก็บผลรวม (ใช้ double กันทศนิยม)

        // รับค่าทั้งหมด
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // คำนวณค่าเฉลี่ย
        double avg = sum / N;

        // แสดงผล
        System.out.println(avg);

        sc.close();
    }
}
