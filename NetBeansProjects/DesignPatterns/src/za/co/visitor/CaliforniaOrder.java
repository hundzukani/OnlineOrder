package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public class CaliforniaOrder implements Order {

    private double orderAmount;
    private double additionalTax;

    public CaliforniaOrder(double orderAmount, double additionalTax) {
        this.orderAmount = orderAmount;
        this.additionalTax = additionalTax;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getAdditionalTax() {
        return additionalTax;
    }

    public void setAdditionalTax(double additionalTax) {
        this.additionalTax = additionalTax;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }
}
