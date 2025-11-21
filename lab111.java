import java.util.Scanner;

public class lab111 {

    // ฟังก์ชันคำนวณผลรวมของ array
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนข้อมูล
        int N = sc.nextInt();
        int[] arr = new int[N];

        // รับค่าจำนวนเต็ม N ค่าใส่ array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // เรียกใช้ฟังก์ชัน sumArray
        int result = sumArray(arr);

        // แสดงผล
        System.out.println(result);

        sc.close();
    }
}
