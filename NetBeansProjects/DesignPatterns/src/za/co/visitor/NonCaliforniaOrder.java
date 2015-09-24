package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public class NonCaliforniaOrder implements Order {

    private double orderAmount;

    public NonCaliforniaOrder(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }
}
