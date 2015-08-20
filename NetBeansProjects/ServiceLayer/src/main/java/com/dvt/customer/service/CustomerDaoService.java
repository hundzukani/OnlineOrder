package com.dvt.customer.service;

import com.dvt.databaselayer.entities.Customer;
import com.dvt.onlineorder.sessions.CustomerSessionDao;
import com.dvt.servicelayer.dao.AbstractDao;

/**
 *
 * @author hmanganyi
 */
public class CustomerDaoService extends AbstractDao<Customer> implements CustomerSessionDao {

    @Override
    public Customer findByPhonenumber(String phoneNumber) {
        return ((Customer)getSession().getNamedQuery("Customer.findByPhoneNumber")
                .setString("phoneNumber",  phoneNumber).uniqueResult());
    }

    @Override
    public boolean checkDeliveryArea(String zipCode) {
        return zipCode.equals("1709");
    }
    
    
    
}
