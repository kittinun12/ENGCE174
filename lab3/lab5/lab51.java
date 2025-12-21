import java.util.Scanner;

class Animal {

    protected String name;
    protected int age;
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
}
}
class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof! Woof!");
}
}
public class lab51 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String name = getValue.nextLine();
        int age = getValue.nextInt();

        Dog dog = new Dog();

        dog.name = name;
        dog.age = age;

        dog.makeSound();
        dog.displayInfo();
}
}
