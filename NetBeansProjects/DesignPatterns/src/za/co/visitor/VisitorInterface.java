package za.co.visitor;

/**
 *
 * @author hmanganyi
 */
public interface VisitorInterface {
    
    public void visit(CaliforniaOrder order);
    
    public void visit(NonCaliforniaOrder order);
    
    public void visit(OverSeasOrder order);
}
