import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from the user
        Scanner getValue = new Scanner(System.in);
        // --- 1. Get Width ---
        System.out.print("Please enter the width: ");
        if (!getValue.hasNextDouble()) {
            System.out.println("Error: Please enter the width as a number.");
            getValue.close();
            return;
        }
        double width = getValue.nextDouble();
        // --- 2. Get Height ---
        System.out.print("Please enter the height: ");
        if (!getValue.hasNextDouble()) {
            System.out.println("Error: Please enter the height as a number.");
            getValue.close();
            return;
        }
        double height = getValue.nextDouble();
        // --- 3. Calculate the Area ---
        // Formula for the area of a rectangle: Area = Width * Height
        double area = width * height;

        // --- 4. Display the result ---
        System.out.println("\nOutput (Area): " + area);
        // Close the Scanner
        getValue.close();
}
}