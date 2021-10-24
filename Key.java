import java.util.concurrent.ThreadLocalRandom;
public class Key extends BusinessData {
    private int keyID;


    public Key(String name, int keyID) {
        super(name);
        this.keyID = keyID;
    }

    public Key getKey(double transaction, String name) {
        int a = ThreadLocalRandom.current().nextInt(1, 101);
        if (transaction > 30.0 && a < 5) {
            Key k = new Key(name, 100);
            return k;
        } else if (transaction > 75.0 && a < 10) {
            Key k = new Key(name, 110);
            return k;
        } else if (transaction > 150.0 && a < 20) {
            Key k = new Key(name, 120);
            return k;
        } else {
            return null;
        }
    }
}