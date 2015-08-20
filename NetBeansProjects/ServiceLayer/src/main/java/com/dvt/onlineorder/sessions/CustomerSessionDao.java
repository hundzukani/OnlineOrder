package com.dvt.onlineorder.sessions;

import com.dvt.databaselayer.entities.Customer;
import com.dvt.servicelayer.dao.Dao;

/**
 *
 * @author hmanganyi
 */
public interface CustomerSessionDao extends Dao<Customer> {
    
    public Customer findByPhonenumber(String phoneNumber);
    
    public boolean checkDeliveryArea(String zipCode);
}
