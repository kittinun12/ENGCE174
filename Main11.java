import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in); 
        System.out.println("==========================================");
        System.out.println("============== Car System ==============");
        System.out.println("==========================================");
        System.out.print("Enter Model (e.g., Honda Civic): ");
        String model = getValue.nextLine(); 
        System.out.print("Enter initial Year (e.g., 2020): ");
        if (!getValue.hasNextInt()) {
            System.out.println("Invalid input for initial year.");
            getValue.close();
            return;
        }
        int initialYear = getValue.nextInt();
        getValue.nextLine(); 

        
        System.out.print("Enter new Year (e.g., 2021): ");
        if (!getValue.hasNextInt()) {
            System.out.println("Invalid input for new year.");
            getValue.close();
            return;
        }
        int newYear = getValue.nextInt();
        getValue.nextLine(); 

        
        Car car = new Car(model, initialYear);
        car.setYear(newYear);

        System.out.println("\n--- Final Output ---");
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        getValue.close();
    }
}

class Car {
    
    private String model; 
    private int year;    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        this.year = newYear;
}
}