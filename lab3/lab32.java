import java.util.Scanner;

class player{
    private int score;

    public player(int s){
        this.score = s;
    }

    public int getScore() {return this.score;}

    public void setScore(int newScore){
        this.score = newScore;
    }


}

public class lab32{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print("old score:");
        int old = getValue.nextInt();

        System.out.print("new score:");
        int New = getValue.nextInt();

        player objectPlayer = new player(old);

        objectPlayer.setScore(New);

        System.out.print(objectPlayer.getScore());
        
    }
}
