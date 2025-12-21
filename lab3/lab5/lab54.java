import java.util.Scanner;

class Vehicle {
    protected String color;
    public Vehicle(String color) {
        this.color = color;
}
}
class Car extends Vehicle {

    protected int wheels;
    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }
    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
}
}
public class lab54 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String color = getValue.nextLine();
        int wheels = getValue.nextInt();

        Car car = new Car(color, wheels);
        car.displayDetails();
}
}
