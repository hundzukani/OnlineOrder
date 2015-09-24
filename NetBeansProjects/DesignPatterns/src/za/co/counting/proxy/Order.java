package za.co.counting.proxy;

import java.util.List;

/**
 *
 * @author hmanganyi
 */
public class Order implements OrderIF {


    
    @Override
    public List getAllOrders() {
        synchronized(this) {
            System.out.println("");
        }
        return null;
    }
    
}
