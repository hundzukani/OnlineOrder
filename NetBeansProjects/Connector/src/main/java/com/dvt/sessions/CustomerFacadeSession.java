
package com.dvt.sessions;

import com.dvt.databaselayer.entities.Customer;

/**
 *
 * @author hmanganyi
 */
public interface CustomerFacadeSession {
    
     public Customer lookupCustomer(String phoneNumber);
     
     public void addCustomer(Customer customer);
     
     public boolean checkDeliveryArea(String zipCode);
}
