import java.util.Scanner;

public class lab17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int totalNumbers = reader.nextInt();
        int result = 0;
        int counter = 0;
        do {
            result += reader.nextInt();
            counter++;
        } while (counter < totalNumbers);
        System.out.println(result);
    }
}
