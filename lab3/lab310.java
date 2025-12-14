import java.util.Scanner;
class SystemLogger {
    private static int currentLogLevel = 1; 

    private static String getLevelName(int level) {
        if (level == 1) return "INFO";
        if (level == 2) return "DEBUG";
        if (level == 3) return "ERROR";
        return "UNKNOWN";
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
}
}

public class lab310 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int N = Integer.parseInt(getValue.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String cmd = getValue.nextLine().trim(); 

            if (cmd.equals("SET")) {
                int level = Integer.parseInt(getValue.nextLine().trim());
                SystemLogger.setLogLevel(level);

            } else if (cmd.equals("LOG")) {
                int msgLevel = Integer.parseInt(getValue.nextLine().trim());
                String message = getValue.nextLine(); 
                SystemLogger.log(msgLevel, message);
            }
        }
        getValue.close();
}
}
