import java.util.Scanner;
class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        if (fontSize < 10) fontSize = 10;
        if (fontSize > 20) fontSize = 20;

        this.theme = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
}
}
public class lab411 {
    public static void main(String[] args) {

        Scanner getValue = new Scanner(System.in);

        String baseTheme = getValue.nextLine();
        int baseFontSize = getValue.nextInt();
        boolean baseDarkMode = getValue.nextBoolean();
        getValue.nextLine(); 

        String userTheme = getValue.nextLine();
        int userFontSize = getValue.nextInt();
        boolean userDarkMode = getValue.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseFontSize, baseDarkMode);
        Configuration userConfig = new Configuration(userTheme, userFontSize, userDarkMode);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
}
}
