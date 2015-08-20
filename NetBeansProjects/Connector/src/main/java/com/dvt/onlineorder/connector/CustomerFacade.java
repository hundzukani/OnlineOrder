package com.dvt.onlineorder.connector;

import com.dvt.databaselayer.entities.Customer;
import com.dvt.onlineorder.exceptions.CustomerNotFoundException;
import com.dvt.onlineorder.sessions.CustomerSession;
import com.dvt.sessions.CustomerFacadeSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author hmanganyi
 */
public class CustomerFacade implements CustomerFacadeSession {

    @Autowired
    private CustomerSession customerSession;

    @Override
    public Customer lookupCustomer(String phoneNumber) {
        Customer customer = customerSession.lookupCustomer(phoneNumber);
        
        if(customer == null) {
            throw new CustomerNotFoundException();
        }
        
        return customer; 
    }

    @Override
    public void addCustomer(Customer customer) {
        customerSession.addCustomer(customer);
    }

    @Override
    public boolean checkDeliveryArea(String zipCode) {
        return customerSession.checkDeliveryArea(zipCode);
    }
}
