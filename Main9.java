import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        // Scanner to read four lines of input from the user
        Scanner inputReader = new Scanner(System.in); 
        // --- 1. Read Input for Student and Address ---
        // Line 1: Read the student's name
        String name = inputReader.nextLine(); 
        // Line 2: Read the street/Moo/Soi (Street)
        String street = inputReader.nextLine(); 
        // Line 3: Read the city/province (City)
        String city = inputReader.nextLine(); 
        // Line 4: Read the zip code (ZipCode)
        String zipCode = inputReader.nextLine(); 
        // --- 2. Create Objects and Display Profile ---
        // Step 1: Create an Address object using the input data
        Address studentAddress = new Address(street, city, zipCode); 
        // Step 2: Create a Student object, passing the name and the Address object (Composition)
        Student studentProfile = new Student(name, studentAddress); 
        // Step 3: Call displayProfile() on the Student object to print the result
        studentProfile.displayProfile();
        // Close the Scanner resource
        inputReader.close();
}
}

// Class 1: Address (image_1caa05.png / image_1d8f22.png)
// Attributes: street, city, zipCode
class Address {
    // Attributes are private for good encapsulation practice
    private String street;
    private String city;
    private String zipCode;
    // Constructor to initialize all three attributes
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    /**
     * Method: getFullAddress()
     * Task: Returns the full address string in the format: "[street], [city], [zipCode]"
     */
    public String getFullAddress() {
        // Output format required by the problem: [street], [city], [zipCode]
        return this.street + ", " + this.city + ", " + this.zipCode;
}
}
// Class 2: Student (image_1caa05.png / image_1d8f22.png)
// Attributes: name, address (Address object)
class Student {
    // Attributes are private for good encapsulation practice
    private String name;
    private Address address; // Composition: Student has an Address object
    // Constructor to initialize name and the Address object
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    /**
     * Method: displayProfile()
     * Task: Prints the student's profile (Name and Address) in two lines.
     * Output format: "Name: [Student Name]", "Address: [Full Address]"
     */
    public void displayProfile() {
        System.out.println("Name: " + this.name);
        // Uses the getFullAddress() method from the Address object
        System.out.println("Address: " + this.address.getFullAddress());
}
}