package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public abstract class PRHandler {

    private PRHandler nextHandler;
    private final String handlerName;
    
    public PRHandler(String name) {
        this.handlerName = name;        
    }
    
    public String getName() {
        return handlerName;
    }
    
    public void setNextHandler(PRHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public PRHandler getNextHandler() {
        return this.nextHandler;
    }
    
    public abstract boolean authorize(PurchaseRequest request);
    
}
