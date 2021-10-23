import java.util.concurrent.ThreadLocalRandom;
public class User {

    private int userID;
    private ArrayList<BusinessData> boxes;
    private ArrayList<BusinessData> keys;
    private String username;

    public User(int userID, ArrayList<BusinessData> boxes, ArrayList<BusinessData> keys, String username) {
        this.userID = userID;
        this.boxes = boxes;
        this.keys = keys;
        this.username = username;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public Box removeBox(Box box) {
        returnboxes.remove(box);
    }

    public void addKey(Key key) {
        keys.add(key);
    }

    public void removeKey(Key key) {
        keys.remove(key);
    }

    public Reward redeemBox(String name) {
        Reward r = null;
        for(int i = 0; i < boxes.size(); i++) {
            if (boxes.get(i).getName().equals(name)) {
                r = boxes.get(i);
                boxes.remove(i);
                break;
            }
        }
        if (r != null && keys.get(0) != null) {

        }
    }

    public Reward randomReward(String name) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        if (randomNum <= 70) {
            Discount d = new Discount(name, ThreadLocalRandom.current().nextInt(5, 35));
        } else if (randomNum > 70 && randomNum < 99) {
            GiftCard g = new GiftCard(name, 15);
        } else {
            ExclusiveItem ei = new ExclusiveItem(name, "CONGRATS!! You won an exclusive item!!");
        }
    }
}
