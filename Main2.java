// Main.java (Save this file as Main.java)
import java.util.Scanner;
/**
 * The Main class is the entry point of the program.
 * It handles user input, object creation, and method execution.
 */
public class Main2 {
    public static void main(String[] args) {
        
        // Prepare Scanner for input
        Scanner getValue = new Scanner(System.in);

        // Get student ID
        System.out.println("Enter student ID:");
        String inputStudentId = getValue.nextLine(); 
        
        // Get name
        System.out.println("Enter name:");
        String inputName = getValue.nextLine(); 
        
        // Close Scanner
        getValue.close(); 
        
        // Create an Instance (Object) of the Student class
        Student studentInstance = new Student(inputStudentId, inputName);

        // Call the method to display the results
        System.out.println("--- Output ---");
        studentInstance.displayInfo();
}
}
/**
 * The Student class holds student data.
 * It has two private attributes: studentId and name.
 */
class Student {
    // Private Attributes (Fields)
    private String studentId; 
    private String name;
    /**
     * Constructor to initialize studentId and name.
     */
    public Student(String studentId, String name) {
        this.studentId = studentId; 
        this.name = name;
}
    /**
     * Method to display student information: studentId followed by name.
     */
    public void displayInfo() {
        // Display studentId
        System.out.println(this.studentId);
        // Display name
        System.out.println(this.name);
}
}