
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
        a = Math.round(Math.random() * 100) / 100.00;
        if (transaction > 30.0 && a < 0.05) {
            return Box(name, 100);
        } else if (transaction > 75.0 && a < .1) {
            return Box(name, 100);
        } else if (transaction > 150.0 && a < .2) {
            return Box(name, 100);
        } else {
            return null;
        }
    }
}
