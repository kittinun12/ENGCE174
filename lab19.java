import java.util.Scanner;
public class lab19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int size = reader.nextInt();
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            numbers[index] = reader.nextInt();
        }
        double total = 0;
        for (int value : numbers) {
            total += value;
        }
        double average = total / size;
        System.out.println(average);
        reader.close();
    }
}
