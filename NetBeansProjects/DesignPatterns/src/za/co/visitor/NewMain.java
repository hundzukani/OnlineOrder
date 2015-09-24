package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OrderVisitor orderVisitor = new OrderVisitor();
        
        Order calOrder = buildOrder("ca", 10000, 0.14, 0);
        
        calOrder.accept(orderVisitor);
        
        Order noncalOrder = buildOrder("nonca", 5000, 0, 0);
        noncalOrder.accept(orderVisitor);
        
        System.out.println("Total Order Costs : " + orderVisitor.getOrderTotal());
    }

    private static Order buildOrder(String orderType, double orderAmount, double tax, double additionalSH) {

        switch (orderType) {
            case "ca":
                return new CaliforniaOrder(orderAmount, tax);

            case "nonca":
                return new NonCaliforniaOrder(orderAmount);

            case "overseas":
                return new OverSeasOrder(orderAmount, additionalSH);

            default:
                return null;
        }
    }
}
