public class Key extends BusinessData {
    private int keyID;


    public Key(int keyID) {
        this.keyID = keyID;
    }

    public getKey(double transaction, String name) {
        a = Math.round(Math.random() * 100) / 100.00;
        if (transaction > 30.0 && a < 0.05) {
            Key((Math.random() * 100) / 100);
        } else if (transaction > 75.0 && a < .1) {
            Key((Math.random() * 100) / 100);
        } else if (transaction > 150.0 && a < .2) {
            Key((Math.random() * 100) / 100);
        } else {
            return null;
        }
    }
}