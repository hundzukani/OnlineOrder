package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class PresidentCOO extends PRHandler {
    
    private static final long LIMIT = 400000;

    public PresidentCOO(String name) {
        super(name);
    }

    @Override
    public boolean authorize(PurchaseRequest request) {

        if(request.getAmount() <= LIMIT) {
            System.out.println("Purchase Request Authorized By President COO : " + getName());
            return true;
        }
        System.out.println("Request cannot be processed, contact BOss");
        return false;
    }
}
