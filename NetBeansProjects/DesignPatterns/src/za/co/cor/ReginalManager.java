package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class ReginalManager extends PRHandler {

    private static final long LIMIT = 100000;

    public ReginalManager(String name) {
        super(name);
    }

    @Override
    public boolean authorize(PurchaseRequest request) {

        if (request.getAmount() <= LIMIT) {
            System.out.println("Purchase Request Authorized By Reginal Manager : " + getName());
            return true;
        }
        return getNextHandler().authorize(request);
    }
}
