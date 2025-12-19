import java.util.Scanner;
@SuppressWarnings("removal")
class Resource {

    private String id;
    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
}
}
public class lab47 {
    @SuppressWarnings("removal")
    public static void main(String[] args) throws Throwable {

        Scanner getValue = new Scanner(System.in);

        String id1 = getValue.nextLine();
        String id2 = getValue.nextLine();
        String id3 = getValue.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        Resource t1 = r1;
        Resource t2 = r2;
        Resource t3 = r3;

        r1 = null;
        r2 = null;
        System.gc();

        t1.finalize();
        t2.finalize();

        r3 = null;
        System.gc();

        t3.finalize();
}
}
