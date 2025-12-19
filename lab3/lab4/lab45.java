import java.util.Scanner;
class Color {

    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }
    private int validate(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        }
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
}
}

public class lab45 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int r = getValue.nextInt();
        int g = getValue.nextInt();
        int b = getValue.nextInt();

        Color color = new Color(r, g, b);
        color.displayRGB();
}
}
