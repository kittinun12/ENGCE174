import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter student ID:");
        String inputStudentId = scanner.nextLine(); 
        
        System.out.println("Enter name:");
        String inputName = scanner.nextLine(); 
        
    
        scanner.close(); 
        
        
        Student studentInstance = new Student(inputStudentId, inputName);
        System.out.println("--- Output ---");
        System.out.println(studentInstance.getStudentId()); 
        System.out.println(studentInstance.getName());
}
}

class Student {
    
    private String studentId; 
    private String name;
    public Student(String studentId, String name) {
        this.studentId = studentId; 
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
}
}