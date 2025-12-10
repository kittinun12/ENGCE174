import java.nio.channels.ConnectionPendingException;
import java.util.Scanner;

class DatabaseConnection{
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String conString){
        this.connectionString = conString;
        this.connected = false;
    }

    public boolean isConnected() {return this.connected;}
    public void connected(){
        if(this.connected == false){
            this.connected = true;

            System.out.println("Connected to " + this.connectionString);

        }else{
            System.out.println("Already Connected");
        }

    }
    public void disconnect(){
        if(this.connected == true){
            this.connected = false;

            System.out.println("disconnected");
        }
        else{
            System.out.println("Already disconnected");
        }
    }
}

public class lab35{
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.print(":");
        String c = getValue.nextLine();

        DatabaseConnection objConnection = new DatabaseConnection(c);

        objConnection.connected();
        objConnection.disconnect();
        objConnection.disconnect();

        System.out.println(objConnection.isConnected());

    }
}