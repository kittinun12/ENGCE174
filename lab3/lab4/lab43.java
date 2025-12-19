import java.util.Scanner;
class Player {
    private String username;
    private int level;

    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}
public class lab43 {
    public static void main(String[] args) {

        Scanner getValue = new Scanner(System.in);

        int mode = getValue.nextInt();
        getValue.nextLine(); 

        Player player;

        if (mode == 1) {
            player = new Player();
        } 
        else if (mode == 2) {
            String username = getValue.nextLine();
            int level = getValue.nextInt();
            player = new Player(username, level);
        } 
        else {
            return;
        }
        player.displayProfile();
}
}
