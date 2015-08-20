package com.dvt.customer.service;

import com.dvt.databaselayer.entities.Customer;
import com.dvt.onlineorder.sessions.CustomerSession;
import com.dvt.onlineorder.sessions.CustomerSessionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author hmanganyi
 */
public class CustomerService implements CustomerSession {

    @Autowired
    @Qualifier(value = "customerDao")
    private CustomerSessionDao customerDao;

    @Override
    public Customer lookupCustomer(String phoneNumber) {
        return customerDao.findByPhonenumber(phoneNumber);
    }

    @Override
    public void addCustomer(Customer customer) {      
        customerDao.create(customer);
    }

    @Override
    public boolean checkDeliveryArea(String zipCode) {
        return customerDao.checkDeliveryArea(zipCode);
    }

}
