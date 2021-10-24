import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.Box;
public class User{

    private int userID;
    private Box[] boxes;
    private Key[] keys;
    private String username;

    public User(int userID, Box[] boxes, Key[] keys, String username) {
        this.userID = userID;
        for (int i = 0; i < 10; i++) {
            this.boxes[i] = boxes[i];
        }
        for (int i = 0; i < 10; i++) {
            this.keys[i] = keys[i];
        }
        //this.boxes = boxes;
        //this.keys = keys;
        this.username = username;
    }

    /*public void addBox(Box box) {
        boxes.add(box);
    }

    public void removeBox(Box box) {
        boxes.remove(box);
    }

    public void addKey(Key key) {
        keys.add(key);
    }

    public void removeKey(Key key) {
        keys.remove(key);
    }*/

    public String redeemBox(String name) {
        Box r = null;
        for(int i = 0; i < boxes.length; i++) {
            if (boxes[i].getName().equals(name)) {
                r = boxes[i];
                //boxes.remove(i);
                break;
            }
        }
        if (r.getName().equals(name)) {
            return randomReward(name);
        }
        return null;
    }

    public String randomReward(String name) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
        if (randomNum <= 70) {
            Rewards d = new Discount(name, ThreadLocalRandom.current().nextInt(5, 35));
            return d.toString();
        } else if (randomNum > 70 && randomNum < 99) {
            Rewards g = new GiftCard(name, 15);
            return g.toString();
        } else {
            Rewards ei = new ExclusiveItem(name, "CONGRATS!! You won an exclusive item!!");
            return ei.toString();
        }
    }

    public String getName(int index) {

        return this.boxes[index].getName();
    }
}
