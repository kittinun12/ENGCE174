import java.util.Scanner;

public class lab14 {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from the user
        Scanner getValue = new Scanner(System.in);

        // Display message prompting the user to enter the score
        System.out.print("Please enter the test score (0-100): ");

        // Receive the score value from the user
        if (getValue.hasNextInt()) {
            int score = getValue.nextInt();
            String grade;

            // Check the score conditions and assign the grade
            if (score >= 80 && score <= 100) {
                grade = "A";
            } else if (score >= 70 && score <= 79) {
                grade = "B";
            } else if (score >= 60 && score <= 69) {
                grade = "C";
            } else if (score >= 50 && score <= 59) {
                grade = "D";
            } else if (score >= 0 && score <= 49) {
                grade = "F";
            } else {
                // Case for scores outside the 0-100 range
                grade = "Invalid Score";
            }

            // Display the result
            System.out.println("Score: " + score);
            System.out.println("Result (Output): " + grade);

        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        // Close the Scanner
        getValue.close();
    }
}