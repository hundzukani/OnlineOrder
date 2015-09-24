package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class VicePresident extends PRHandler  {
    
    private static final long LIMIT = 200000;

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public boolean authorize(PurchaseRequest request) {
        
        if(request.getAmount() <= LIMIT) {
            System.out.println("Purchase Request Authorized By Vice President : " + getName());
            return true;
        }
        
        return getNextHandler().authorize(request);
    }
}
