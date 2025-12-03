import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in); 
        System.out.println("==========================================");
        System.out.println("==== Course & Student Enrollment System ==");
        System.out.println("==========================================");
        System.out.print("Enter Course ID (e.g., ENGCE174): ");
        String courseId = getValue.nextLine(); 

        System.out.print("Enter Course Name (e.g., Object Oriented Programming): ");
        String courseName = getValue.nextLine(); 
        System.out.print("Enter Student Name (e.g., Somsak Jaidee): ");
        String studentName = getValue.nextLine(); 

        Course course = new Course(courseId, courseName);
        
        Student student = new Student(studentName, course);
        
        System.out.println("\n--- Enrollment Summary ---");
        student.displayEnrollment();

        getValue.close();
}
}

class Course {
    private String courseId;
    private String courseName;
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public String getCourseInfo() {
        return courseId + ": " + courseName;
}
}

class Student {
    private String studentName;
    private Course enrolledCourse; 
    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }
    public void displayEnrollment() {
        System.out.println("Student: " + this.studentName);
        System.out.println("Enrolled in: " + this.enrolledCourse.getCourseInfo());
}
}