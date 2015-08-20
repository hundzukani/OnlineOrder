
package com.dvt.databaselayer.entities;

import java.io.Serializable;

/**
 *
 * @author hmanganyi
 */
public class Order implements Serializable{
    
    private Customer customer;
    private Pizza pizza;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    
}
