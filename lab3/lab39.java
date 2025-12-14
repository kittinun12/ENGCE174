import java.util.Scanner;
class User {
    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public User(String username, String password) {
        this.username = username;

        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
}
}

public class lab39 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        int minLength1 = Integer.parseInt(getValue.nextLine());
        String user1_name = getValue.nextLine();
        String user1_pass = getValue.nextLine();
        String user2_name = getValue.nextLine();
        String user2_pass = getValue.nextLine();
        int minLength2 = Integer.parseInt(getValue.nextLine());
        String user2_newPass = getValue.nextLine();

        User.setMinLength(minLength1);

        User user1 = new User(user1_name, user1_pass);
        User user2 = new User(user2_name, user2_pass);

        User.setMinLength(minLength2);

        user2.setPassword(user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        getValue.close();
}
}
