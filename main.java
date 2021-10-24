import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class main {

    public static void testCompanies(String name) {
        String company = "";
        int a, b;
        Box b1;
        Key k1;
        ArrayList<Box> box = new ArrayList<Box>();
        ArrayList<Key> key = new ArrayList<Key>();

        for(int i = 0; i < 35; i++) {
            a = ThreadLocalRandom.current().nextInt(1, 101);
            b = ThreadLocalRandom.current().nextInt(1, 8);

            switch (b) {
                case 1:
                    company = "Target";
                    break;
                case 2:
                    company = "Walmart";
                    break;
                case 3:
                    company = "McDonalds";
                    break;
                case 4:
                    company = "Chick-Fil-A";
                    break;
                case 5:
                    company = "Amazon";
                    break;
                case 6:
                    company = "Kohl's";
                    break;
                case 7:
                    company = "Steam";
                    break;
            }
            b1 = new Box(company, a);
            box.add(b1);
        }
        for(int i = 0; i < 35; i++) {
            a = ThreadLocalRandom.current().nextInt(1, 101);
            b = ThreadLocalRandom.current().nextInt(1, 8);

            switch (b) {
                case 1:
                    company = "Target";
                    break;
                case 2:
                    company = "Walmart";
                    break;
                case 3:
                    company = "McDonalds";
                    break;
                case 4:
                    company = "Chick-Fil-A";
                    break;
                case 5:
                    company = "Amazon";
                    break;
                case 6:
                    company = "Kohl's";
                    break;
                case 7:
                    company = "Steam";
                    break;
            }
            k1 = new Key(company, a);
            key.add(k1);
        }
        User john = new User(1, box, key, "John");
        for(int i = 0; i < 10; i++) {
            System.out.println(john.redeemBox(john.getName(i)));
            System.out.println("2");
        }
    }
    public static void main(String[] args) {
        //Target
        testCompanies("Target");
        //Walmart
        testCompanies("Walmart");
        //McDonalds
        testCompanies("McDonalds");
        //Chick-Fil-A
        testCompanies("Chick-Fil-A");
        //Amazon
        testCompanies("Amazon");
        //Kohls
        testCompanies("Kohl's");
        //Steam
        testCompanies("Steam");
    }
}