import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;
    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
}
    public double calculateTotalFee() {
        return baseFee;
}
}
class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
}
    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
}
}
class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
}
    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
}
}
public class lab514 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        String stdId = getValue.nextLine();
        double stdBaseFee = getValue.nextDouble();
        getValue.nextLine();

        String preId = getValue.nextLine();
        double preBaseFee = getValue.nextDouble();
        double insuranceFee = getValue.nextDouble();

        Shipping s1 = new StandardShipping(stdId, stdBaseFee);
        Shipping s2 = new PremiumShipping(preId, preBaseFee, insuranceFee);

        Shipping[] arr = { s1, s2 };

        for (Shipping s : arr) {
            System.out.println(s.calculateTotalFee());
        }
        getValue.close();
}
}
