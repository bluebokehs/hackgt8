public class GiftCard {
    private double value;

    public GiftCard(String name, double value) {
        super(name);
        this.value = value;
    }

    public GiftCard giveGiftCard(String name, double value) {
        return GiftCard(name, value);
    }
}
