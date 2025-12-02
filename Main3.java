import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N (Number of students):");
        int N = Integer.parseInt(scanner.nextLine()); 
        
        for (int i = 0; i < N; i++) {
            
            System.out.println("Enter student ID for student " + (i + 1) + ":");
            String inputStudentId = scanner.nextLine(); 
            
            System.out.println("Enter name for student " + (i + 1) + ":");
            String inputName = scanner.nextLine(); 
            new Student(inputStudentId, inputName);
        }

        scanner.close(); 
        System.out.println("--- Output ---");
        System.out.println(Student.getStudentCount()); 
}
}
class Student {
    private String studentId; 
    private String name;
    private static int studentCount = 0; 

    public Student(String studentId, String name) {
        this.studentId = studentId; 
        this.name = name;
        Student.studentCount++; 
}
    public static int getStudentCount() {
        return studentCount;
}
}