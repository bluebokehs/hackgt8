public class ExclusiveItem extends Rewards{
    private String description;

    public ExclusiveItem(String name, String description) {
        super(name);
        this.description = description;
    }

    public ExclusiveItem giveExclusiveItem(String name, String description) {
        return ExclusiveItem(name, description);
    }
}
