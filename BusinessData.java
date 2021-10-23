public class BusinessData {
    private String name;
    private int numKeys;
    private int numOtherKeys;


    public BusinessData(String name, int numKeys, int numOtherKeys) {
        this.name = name;
        this.numKeys = numKeys;
        this.numOtherKeys = numOtherKeys;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public int getNumOtherKeys() {
        return numOtherFrags;
    }
    public void setNumOtherKeys(int numOtherKeys) {
        this.numOtherKeys = numOtherKeys;
    }
}