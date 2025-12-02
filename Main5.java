// Main.java (Save this file as Main.java)
import java.util.Scanner;
/**
 * The Main class is the entry point of the program.
 * It handles receiving user input and calling the methods on the Rectangle object.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Get Input: Width (double)
        System.out.println("Enter Width (double):");
        // Read input and parse it to a double
        double inputWidth = Double.parseDouble(scanner.nextLine()); 
        // 2. Get Input: Height (double)
        System.out.println("Enter Height (double):");
        // Read input and parse it to a double
        double inputHeight = Double.parseDouble(scanner.nextLine()); 
        scanner.close(); 
        // 3. Create a Rectangle Instance using the constructor
        Rectangle rectangleInstance = new Rectangle(inputWidth, inputHeight);
        // 4. Display the results (Output)
        System.out.println("--- Output ---");
        // Line 1: Area (by calling getArea())
        // Area = width * height
        System.out.println(rectangleInstance.getArea()); 
        // Line 2: Perimeter (by calling getPerimeter())
        // Perimeter = 2 * (width + height)
        System.out.println(rectangleInstance.getPerimeter());
}
}
/**
 * The Rectangle class holds dimensions (width, height) and provides methods 
 * to calculate Area and Perimeter.
 */
class Rectangle {
    // Attributes (Fields) 2 required: width (double) and height (double)
    private double width; 
    private double height;
    /**
     * Constructor receiving 2 values to initialize the attributes.
     */
    public Rectangle(double width, double height) {
        this.width = width; 
        this.height = height;
    }
    /**
     * Method getArea(): 
     * Calculates the area (Area = width * height) and returns a double result.
     */
    public double getArea() {
        return this.width * this.height; 
    }
    /**
     * Method getPerimeter():
     * Calculates the perimeter (Perimeter = 2 * (width + height)) and returns a double result.
     */
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}