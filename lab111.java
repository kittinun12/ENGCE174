import java.util.Scanner;

public class lab111 {

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);
        int N = getValue.nextInt();
        int[] arr = new int[N];

        
        for (int i = 0; i < N; i++) {
            arr[i] = getValue.nextInt();
        }

        int result = sumArray(arr);
        System.out.println(result);

        getValue.close();
    }
}
