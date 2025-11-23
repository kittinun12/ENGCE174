import java.util.Scanner;
public class lab15 {
    public static void main(String[] args) {
    
        Scanner getValue = new Scanner(System.in);
        System.out.print("Please enter the menu number (1-4): ");
        
        if (!getValue.hasNextInt()) {
            System.out.println("\nOutput: Invalid Menu");
            getValue.close();
            return;
        }
        int menuNumber = getValue.nextInt();
        String menuName;
        
        switch (menuNumber) {
            case 1:
                menuName = "Americano";
                break;
            case 2:
                menuName = "Latte";
                break;
            case 3:
                menuName = "Espresso";
                break;
            case 4:
                menuName = "Mocha";
                break;
            default:
                menuName = "Invalid Menu";
                break;
    }
        
        System.out.println("\nOutput: " + menuName);
        getValue.close();
}
 }