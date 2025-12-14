import java.util.Scanner;
class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    public static boolean checkout() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
}
}

public class lab313 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int N = Integer.parseInt(getValue.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String cmd = getValue.nextLine().trim();

            if (cmd.equals("SET")) {
                int max = Integer.parseInt(getValue.nextLine().trim());
                LicenseManager.setMax(max);

            } else if (cmd.equals("CHECKOUT")) {
                LicenseManager.checkout();

            } else if (cmd.equals("CHECKIN")) {
                LicenseManager.checkIn();

            } else if (cmd.equals("STATUS")) {
                LicenseManager.displayStatus();
            }
        }

        getValue.close();
}
}
