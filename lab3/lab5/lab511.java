import java.util.Scanner;

class Document {
    protected String title;
    public Document(String title) { this.title = title; }
    public void displayDetails() {
        System.out.println("Document: " + title);
}
}
class TextDocument extends Document {
    protected int wordCount;
    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
}
    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
}
}
class PDFDocument extends Document {
    protected int pageCount;
    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
}
    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
}
}
public class lab511 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String t1Title = getValue.nextLine();
        int t1Words = getValue.nextInt();
        getValue.nextLine();

        String p1Title = getValue.nextLine();
        int p1Pages = getValue.nextInt();
        getValue.nextLine();

        String t2Title = getValue.nextLine();
        int t2Words = getValue.nextInt();
        getValue.nextLine();

        String p2Title = getValue.nextLine();
        int p2Pages = getValue.nextInt();

        Document d1 = new TextDocument(t1Title, t1Words);
        Document d2 = new PDFDocument(p1Title, p1Pages);
        Document d3 = new TextDocument(t2Title, t2Words);
        Document d4 = new PDFDocument(p2Title, p2Pages);

        Document[] docs = { d1, d2, d3, d4 };

        int totalPages = 0;

        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }
        for (Document d : docs) {
            d.displayDetails();
        }
        System.out.println("Total Pages: " + totalPages);
}
}
