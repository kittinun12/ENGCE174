import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter interger");
        int a = sc.nextInt();   //รับค่าตัวเลขตัวแรก
        
        System.out.println("Enter interger again");
        int b = sc.nextInt();   //รับค่าตัวเลขตัวที่สอง

        int sum = a + b;        //คำนวณผลบวก

        System.out.println(sum); //แสดงผล
    }
}