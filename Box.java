public class Box extends BusinessData {
    private int boxID;
    private double valTrans;

    public Box(String name, int boxID, double valTrans) {
        super(name);
        this.boxID = boxID;
        this.valTrans = valTrans;
    }

    public double getValTrans() {
        return valTrans;
    }
}
