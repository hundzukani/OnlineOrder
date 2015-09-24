package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public class OrderVisitor implements VisitorInterface {

    private double orderTotal;

    @Override
    public void visit(CaliforniaOrder order) {
        orderTotal += order.getAdditionalTax() + order.getOrderAmount();
    }

    @Override
    public void visit(NonCaliforniaOrder order) {
        orderTotal += order.getOrderAmount();
    }

    @Override
    public void visit(OverSeasOrder order) {
        orderTotal += order.getAdditionalSH() + order.getOrderAmount();
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    
}
