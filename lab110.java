import java.util.Scanner;

public class lab110 {

    // ฟังก์ชันคำนวณพื้นที่ (กว้าง x สูง)
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าความกว้างและความสูง
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        // เรียกใช้ฟังก์ชัน calculateArea
        double area = calculateArea(width, height);

        // แสดงผลลัพธ์
        System.out.println(area);

        sc.close();
    }
}
