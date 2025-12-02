// Main.java (Save this file as Main.java)
import java.util.Scanner;
/**
 * The Main class is the entry point of the program.
 * It handles receiving user input and calling the displaySummary() method.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);
        // 1. Get Input: Name (String)
        System.out.println("Enter Name:");
        String inputName = getValue.nextLine(); 
        // 2. Get Input: Midterm Score (int)
        System.out.println("Enter Midterm Score (int):");
        // We assume the input is valid and parse it to an integer.
        int inputMidtermScore = Integer.parseInt(getValue.nextLine()); 
        // 3. Get Input: Final Score (int)
        System.out.println("Enter Final Score (int):");
        // We assume the input is valid and parse it to an integer.
        int inputFinalScore = Integer.parseInt(getValue.nextLine()); 
        getValue.close(); 
        // 4. Create a Student Instance using the constructor
        Student studentInstance = new Student(inputName, inputMidtermScore, inputFinalScore);
        // 5. Display the results by calling displaySummary()
        System.out.println("--- Output ---");
        studentInstance.displaySummary();
}
}
class Student {
    // Attributes (Fields) 3 required: name (String), midtermScore (int), finalScore (int)
    private String name; 
    private int midtermScore; 
    private int finalScore;
    /**
     * Constructor receiving 3 values to initialize the attributes.
     */
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name; 
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
    /**
     * Method calculateAverage(): 
     * Calculates the average score (midtermScore + finalScore) / 2.0 
     * and returns the result as a double.
     */
    public double calculateAverage() {
        // Use 2.0 to ensure floating-point division
        return (midtermScore + finalScore) / 2.0; 
    }
    /**
     * Method displaySummary():
     * Displays the student's Name, Average Score, and Status (Pass/Fail).
     * Status is Pass if Average >= 50.0, Fail otherwise.
     */
    public void displaySummary() {
        double average = calculateAverage(); // Call the calculation method
        String status;
        // Determine Status: Pass if >= 50.0, Fail otherwise
        if (average >= 50.0) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        // Line 1: Name: [Student Name]
        System.out.println("Name: " + this.name);
        
        // Line 2: Average Score: [Average Score] (Formatted to one decimal place)
        // Using printf for formatting to match Test Case output (e.g., 90.0)
        System.out.printf("Average Score: %.1f%n", average); 

        // Line 3: Status: [Pass or Fail]
        System.out.println("Status: " + status);
}
}