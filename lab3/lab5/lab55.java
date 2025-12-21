import java.util.Scanner;

class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public double calculateArea() {
        return 0.0;
}
}
class Circle extends Shape {

    protected double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
}
}
class Rectangle extends Shape {

    protected double width;
    protected double height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
}
}
public class lab55 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        double radius = getValue.nextDouble();
        double width = getValue.nextDouble();
        double height = getValue.nextDouble();

        Shape circle = new Circle("Circle", radius);
        Shape rectangle = new Rectangle("Rectangle", width, height);

        Shape[] shapes = { circle, rectangle };

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
}
}
