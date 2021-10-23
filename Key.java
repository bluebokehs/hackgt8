public class Key extends BusinessData {
    private int keyID;
    private double keyTrans;


    public Key(String name, int keyID) {
        super(name);
        this.keyID = keyID;
    }

    public int getNumFrags() {
        return numFrags;
    }

    public int getNumOtherFrags() {
        return numOtherFrags;
    }
}