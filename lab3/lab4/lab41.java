import java.util.Scanner;
class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
}
}
public class lab41 {
    public static void main(String[] args) {

        Scanner getValue = new Scanner(System.in);

        int mode = getValue.nextInt();
        getValue.nextLine(); 

        Book book;

        if (mode == 1) {
            String title = getValue.nextLine();
            book = new Book(title);
        } else if (mode == 2) {
            String title = getValue.nextLine();
            String author = getValue.nextLine();
            book = new Book(title, author);
        } else {
            return;
        }
        book.displayInfo();
}
}
