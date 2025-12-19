import java.util.Scanner;
class TimePeriod {

    private int startHour;
    private int endHour;
    public TimePeriod() {
        this(9, 17); 
    }
    public TimePeriod(int startHour, int endHour) {

        if (startHour < 0) startHour = 0;
        if (startHour > 23) startHour = 23;

        if (endHour < 0) endHour = 0;
        if (endHour > 23) endHour = 23;

        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        this.startHour = startHour;
        this.endHour = endHour;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
}
}
public class lab410 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int mode = getValue.nextInt();

        TimePeriod tp;

        if (mode == 1) {
            tp = new TimePeriod();
        } else if (mode == 2) {
            int startHour = getValue.nextInt();
            int endHour = getValue.nextInt();
            tp = new TimePeriod(startHour, endHour);
        } else {
            return;
        }
        tp.displayPeriod();
}
}
