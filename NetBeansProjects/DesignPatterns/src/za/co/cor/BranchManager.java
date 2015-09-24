package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class BranchManager extends PRHandler {
    
    private static final long LIMIT = 25000;

    public BranchManager(String name) {
        super(name);
    }

    @Override
    public boolean authorize(PurchaseRequest request) {
        if(request.getAmount() <= LIMIT) {
            System.out.println("Purchase Request Authorized By Branch Manager : " + getName());
            return true;
        }
        return getNextHandler().authorize(request);
    }   
}
