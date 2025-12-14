import java.util.Scanner;
class SystemConfig {

    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        serverUrl = "default.server.com";
        maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid.count.");
        }
}
}

public class lab311 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int N = Integer.parseInt(getValue.nextLine());

        for (int i = 0; i < N; i++) {
            String cmd = getValue.nextLine();

            if (cmd.equals("SET_URL")) {
                String url = getValue.nextLine();
                SystemConfig.getInstance().setServerUrl(url);

            } else if (cmd.equals("SET_MAX")) {
                int count = Integer.parseInt(getValue.nextLine());
                SystemConfig.getInstance().setMaxConnections(count);

            } else if (cmd.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }

        getValue.close();
}
}
