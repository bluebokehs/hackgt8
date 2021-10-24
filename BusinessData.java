public class BusinessData {
    private String name;

    public BusinessData(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("1");
        return name;
    }
}