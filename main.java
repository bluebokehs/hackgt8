import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class main {

    public static void testCompanies(String name) {

    }
    public static void main(String[] args) {


        //Example cases as to how the code would sort random solutions from boxes
        //CFA
        Box cfa = new Box("Chick-Fil-A", 101);
        Key kCFA = new Key("General2", 101);
        GiftCard gcCFA = new GiftCard("CFA", 15);
        System.out.println(dCFA.toString());
        //Amazon
        Box amazon = new Box("Amazon", 102);
        Key kAmazon = new Key("General3", 102);
        Discount gcAmazon = new Discount("Amazon", 20);
        System.out.println(gcAmazon.toString());
        //Target
        Box target = new Box("Target", 100);
        Key kTarget = new Key("General1", 100);
        ExclusiveItem eTarget = new ExclusiveItem("Target Exclusive Item", "You won an exclusive supple only T-shirt!");
        System.out.println(eTarget.toString());

    }
}