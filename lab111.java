import java.util.Scanner;

public class lab111 {

    // ฟังก์ชันคำนวณผลรวมของ Array
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวน N
        int N = sc.nextInt();

        // สร้าง Array ขนาด N
        int[] arr = new int[N];

        // รับค่าตัวเลข N ค่า เก็บใน Array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // เรียกใช้ฟังก์ชัน sumArray
        int result = sumArray(arr);

        // แสดงผลลัพธ์
        System.out.println(result);
    }
}
