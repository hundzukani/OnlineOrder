
package com.dvt.onlineorder.sessions;

import com.dvt.databaselayer.entities.Customer;

/**
 *
 * @author hmanganyi
 */
public interface CustomerSession {
    
    public Customer lookupCustomer(String phoneNumber);
    
    public void addCustomer(Customer customer);
    
    public boolean checkDeliveryArea(String zipCode);
    
}
