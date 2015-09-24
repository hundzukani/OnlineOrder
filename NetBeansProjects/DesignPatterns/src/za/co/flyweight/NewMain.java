package za.co.flyweight;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FlyWeightFactory factory = FlyWeightFactory.getInstance();

        IntrinsicVisitorData intrinsicVisitorData = factory.getFlyWeight("SOUTH");

        VisitorCard visitorCard = new VisitorCard("Hundzukani", "Mr", intrinsicVisitorData);
        visitorCard.print();

        VisitorCard visitorCard2 = new VisitorCard("Lyn", "Mrs", intrinsicVisitorData);
        visitorCard2.print();
    }

}
