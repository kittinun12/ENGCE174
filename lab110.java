import java.util.Scanner;

public class lab110 {

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        double width = getValue.nextDouble();
        double height = getValue.nextDouble();
        double area = calculateArea(width, height);
        System.out.println(area);
        getValue.close();
    }
}
