import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // รับค่าแม่สูตรคูณ

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
