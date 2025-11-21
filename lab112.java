import java.util.Scanner;

public class lab112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนสินค้า N
        int N = sc.nextInt();

        // สร้าง Array เก็บรหัสสินค้าและจำนวนคงเหลือ
        int[] productID = new int[N];
        int[] stockQty = new int[N];

        // รับข้อมูลสินค้า
        for (int i = 0; i < N; i++) {
            productID[i] = sc.nextInt();   // รหัสสินค้า
            stockQty[i] = sc.nextInt();    // จำนวนคงเหลือ
        }

        // รับค่ารหัสสินค้าที่ต้องการค้นหา
        int searchID = sc.nextInt();

        // ค้นหาแบบ Linear Search
        int foundIndex = -1;
        for (int i = 0; i < N; i++) {
            if (productID[i] == searchID) {
                foundIndex = i;
                break;
            }
        }

        // แสดงผลลัพธ์
        if (foundIndex != -1) {
            System.out.println(stockQty[foundIndex]);
        } else {
            System.out.println("Product not found");
        }
    }
}
