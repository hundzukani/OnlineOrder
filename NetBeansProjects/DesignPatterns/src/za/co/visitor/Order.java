package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public interface Order {
    
    public void accept(VisitorInterface visitor);
}
