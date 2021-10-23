public class Discount extends Rewards{
    private int percentage;

    public Discount(String name, int percentage) {
        super(name);
        this.percentage = percentage;
    }

    public Discount giveDiscount(String name, int percent) {
        return Discount(name, percent);
    }
}
