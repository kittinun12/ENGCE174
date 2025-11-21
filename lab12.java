import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าความกว้าง (Width)
        double width = sc.nextDouble();
        // รับค่าความสูง (Height)
        double height = sc.nextDouble();

        // คำนวณพื้นที่
        double area = width * height;

        // แสดงผลลัพธ์
        System.out.println(area);
    }
}
