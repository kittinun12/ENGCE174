import java.util.Scanner;

class User {
    private String username;

    public User(String un) {
        this.username = un;
    }

    public String getUsername() { return this.username; }
}

public class lab31 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("s: name:");
        String n = getValue.nextLine();

        User objectName = new User(n);

        System.out.print(objectName.getUsername());
    }
}
