import java.util.*;

class RentalVehicle {
    protected String model;
    protected double rentalRate;
    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
}
    public double calculateFee() {
        return rentalRate;
}
}
class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
}
    @Override
    public double calculateFee() {
        return rentalRate + 100;
}
}
class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
}
    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
}
}
public class lab515 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String carModel = getValue.nextLine();
        double carRate = getValue.nextDouble();
        getValue.nextLine();

        String motoModel = getValue.nextLine();
        double motoRate = getValue.nextDouble();

        RentalVehicle[] vehicles = new RentalVehicle[2];
        vehicles[0] = new Car(carModel, carRate);
        vehicles[1] = new Motorcycle(motoModel, motoRate);

        double total = 0;
        for (RentalVehicle v : vehicles) {
            total += v.calculateFee();
        }
        System.out.println(total);
}
}
