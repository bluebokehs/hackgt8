public class ExclusiveItem extends Rewards{
    private String description;

    public ExclusiveItem(String name, String description) {
        super(name);
        this.description = description;
    }

    public ExclusiveItem giveExclusiveItem(String name, String description) {
        ExclusiveItem ei = new ExclusiveItem(name, description);
        return ei;
    }
}
