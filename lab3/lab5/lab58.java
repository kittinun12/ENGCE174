import java.util.Scanner;

class Person {
    protected String name;
    public Person(String name) { this.name = name; }
    public String getStatus() {
        return "Person: " + name;
}
}
class Student extends Person {
    protected int studentId;
    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
}
}
class Employee extends Person {
    protected double salary;
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    public void applyBonus(double bonus) {
        this.salary += bonus;
    }
    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
}
}
public class lab58 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String studentName = getValue.nextLine();
        int studentId = getValue.nextInt();
        getValue.nextLine();

        String employeeName = getValue.nextLine();
        double salary = getValue.nextDouble();

        Student s = new Student(studentName, studentId);
        Employee e = new Employee(employeeName, salary);

        Person[] people = { s, e };
        for (Person p : people) {
            if (p instanceof Employee) {
                ((Employee) p).applyBonus(1000.0);
            }
        }
        for (Person p : people) {
            System.out.println(p.getStatus());
        }
}
}
