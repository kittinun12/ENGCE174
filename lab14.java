import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();   // รับค่าคะแนน (0–100)

        if (score >= 80 && score <= 100) {
            System.out.println("A");
        } 
        else if (score >= 70) {
            System.out.println("B");
        } 
        else if (score >= 60) {
            System.out.println("C");
        } 
        else if (score >= 50) {
            System.out.println("D");
        } 
        else {
            System.out.println("F");
        }
    }
}
