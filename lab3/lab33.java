import java.util.Scanner;

class User{
    private String password;

    public User(String p){
        this.password = p;
    }

    public String getPassword() {return this.password;}

    public void setPassword(String newPassword){
        int len = newPassword.length(); //นับจำนวน newPassword เอาไปเก็บไว้ใน len

        if( len >= 8 ) {
            this.password = newPassword;

            System.out.println("Password updated");
        }
        else{
            System.out.println("Password is too short");
        }
    }
}

public class lab33{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("old password:");
        String old = getValue.nextLine();

        System.out.print("new password:");
        String New = getValue.nextLine();

        User objectUser = new User(old);

        objectUser.setPassword(New);

        System.out.print(objectUser.getPassword());

        //getValue.close();
    }
}

