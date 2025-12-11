import java.util.Scanner;

class Employee{
    private String employeeld;
    private String department;

    public Employee(String employeeld, String department){
        this.employeeld = employeeld;
        this.department = department;
    }

    public String getEmployeeld(){return this.employeeld;}
    public String getDepartment(){return this.department;}
    public void setDepartment(String newDepartment){
        this.department = newDepartment;
    }
}

public class lab37{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("");
        String emid = getValue.nextLine();

        System.out.print("");
        String old = getValue.nextLine();

        System.out.print("");
        String New = getValue.nextLine();

        Employee objectEmployee = new Employee(emid , old);

        objectEmployee.setDepartment(New);

        System.out.println("" + objectEmployee.getEmployeeld());
        System.out.println("" + objectEmployee.getDepartment());
    }
}