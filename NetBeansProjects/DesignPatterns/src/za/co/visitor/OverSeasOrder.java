package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public class OverSeasOrder implements Order {

    private double orderAmount;
    private double additionalSH;

    public OverSeasOrder(double orderAmount, double additionalSH) {
        this.orderAmount = orderAmount;
        this.additionalSH = additionalSH;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getAdditionalSH() {
        return additionalSH;
    }

    public void setAdditionalSH(double additionalSH) {
        this.additionalSH = additionalSH;
    }

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }

}
