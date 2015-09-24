package za.co.counting.proxy;

import java.util.List;

/**
 *
 * @author hmanganyi
 */
public class ProxyOrder implements OrderIF {

     
    
    public ProxyOrder() {
        
    }
    
    @Override
    public List getAllOrders() {
        
        Order order = new Order();
        return order.getAllOrders();
    }
    
}
