public class GiftCard extends Rewards{
    private double value;
    //private String name;

    public GiftCard(String name, double value) {
        super(name);
        this.value = value;
    }

    public GiftCard giveGiftCard(String name, double value) {
        GiftCard gc = new GiftCard(name, value);
        return gc;
    }
}
