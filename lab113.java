import java.util.Scanner;

public class lab113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนแถว (R) และจำนวนคอลัมน์ (C)
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] server = new int[R][C];
        int countOnline = 0;

        // รับค่าฐานะเซิร์ฟเวอร์ 0/1 ใส่ใน Array 2 มิติ และนับ 1 ไปด้วย
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                server[i] = server[i]; // just to ensure row exists (optional)
                server[i][j] = sc.nextInt();
                if (server[i][j] == 1) {
                    countOnline++;
                }
            }
        }

        // แสดงจำนวนเซิร์ฟเวอร์ที่ Online ทั้งหมด
        System.out.println(countOnline);
    }
}
