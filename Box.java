import java.util.concurrent.ThreadLocalRandom;
public class Box extends BusinessData {
    private int boxID;
    private final double CHANCE = 0.1;
    private double cost;

    public Box(String name, int boxID) {
        super(name);
        this.boxID = boxID;
    }

    public int getBoxID() {
        return boxID;
    }

    public Box giveBox(double transaction, String name) {
        int a = ThreadLocalRandom.current().nextInt(1, 101);
        if (transaction > 30.0 && a < 5) {
            Box b = new Box(name, 100);
            return b;
        } else if (transaction > 75.0 && a < 10) {
            Box b = new Box(name, 100);
            return b;
        } else if (transaction > 150.0 && a < 20) {
            Box b = new Box(name, 100);
            return b;
        } else {
            return null;
        }
    }
}
