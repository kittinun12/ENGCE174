import java.util.Scanner;

public class lab17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // รับจำนวนตัวเลขที่จะรับต่อไป
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();   // รับค่าทีละตัว
            sum += value;               // นำมาบวกสะสม
        }

        System.out.println(sum);         // แสดงผลรวม
    }
}
