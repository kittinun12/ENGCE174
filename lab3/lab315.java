import java.util.Scanner;
class User {

    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
}
}

public void login(String password) {


        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }

        failedAttempts++;

        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
        } else {
            int left = maxAttempts - failedAttempts;
            System.out.println("Login failed. " + left + " attempts left.");
        }
}
}

public class lab315 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String username = getValue.nextLine();
        User user = new User(username);


        int N = Integer.parseInt(getValue.nextLine());

        for (int i = 0; i < N; i++) {
            String cmd = getValue.nextLine();

            if (cmd.equals("SET_POLICY")) {
                int max = Integer.parseInt(getValue.nextLine());
                User.setPolicy(max);

            } else if (cmd.equals("LOGIN")) {
                String password = getValue.nextLine();
                user.login(password);
            }
        }
        getValue.close();
}
}
