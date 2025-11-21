import java.util.Scanner;

public class lab114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนแถวและคอลัมน์
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine(); // เคลียร์บรรทัดค้าง

        char[][] map = new char[R][C];

        // รับข้อมูลแผนที่ (Map)
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        // รับพิกัดที่คลิก
        int targetR = sc.nextInt();
        int targetC = sc.nextInt();

        // ถ้าจุดที่คลิกเป็นระเบิด
        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
            return;
        }

        // ทิศทั้ง 8 ทิศ
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        int count = 0;

        // ตรวจสอบรอบข้าง
        for (int i = 0; i < 8; i++) {
            int nr = targetR + dr[i];
            int nc = targetC + dc[i];

            // เช็กกรอบ
            if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                if (map[nr][nc] == '*') {
                    count++;
                }
            }
        }

        // แสดงผล
        System.out.println(count);
    }
}
