import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in); 
        String mode = getValue.nextLine(); 
        double temperature = getValue.nextDouble(); 
        double result = 0.0;
        
        if (mode.equalsIgnoreCase("C_TO_F")) {
            result = TempConverter.celsiusToFahrenheit(temperature);
        } else if (mode.equalsIgnoreCase("F_TO_C")) {
            result = TempConverter.fahrenheitToCelsius(temperature);
        } else {
            System.err.println("Error: Invalid conversion mode detected.");
            return;
        }
        System.out.println(String.format("%.1f", result));
        getValue.close();
}
}
class TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
}
}