import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==ส่วนของการป้อนข้อมูล==
        System.out.print("Enter width:");
        double width = sc.nextDouble();

        System.out.print("Enter height:");
        double height = sc.nextDouble();
        
        // ==ส่วนของการประมวลผลและการแสดงผล==
        double area = width * height;
        System.out.println("Area =" + area);

        sc.close();
    }
}