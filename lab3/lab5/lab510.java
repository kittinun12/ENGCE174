import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;
    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }
    public double calculateCost() {
        return baseHours * 50.0;
}
}
class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }
    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
}
}
class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }
    @Override
    public double calculateCost() {
        return super.calculateCost();
}
}
public class lab510 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String cDesc = getValue.nextLine();
        int cHours = getValue.nextInt();
        double fee = getValue.nextDouble();
        getValue.nextLine();

        String sDesc = getValue.nextLine();
        int sHours = getValue.nextInt();

        ProjectTask t1 = new ComplexTask(cDesc, cHours, fee);
        ProjectTask t2 = new SimpleTask(sDesc, sHours);

        ProjectTask[] tasks = { t1, t2 };

        for (ProjectTask t : tasks) {
            System.out.println(t.calculateCost());
        }
}
}
