package com.dvt.config;

import com.dvt.customer.service.CustomerDaoService;
import com.dvt.customer.service.CustomerService;
import com.dvt.onlineorder.sessions.CustomerSession;
import com.dvt.onlineorder.sessions.CustomerSessionDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author hmanganyi
 */
@Configuration
@ComponentScan(basePackages = "com.dvt")
public class CustomerConfiguration {
    
    @Bean(name = "customerDao")
    public CustomerSessionDao customerDao() {
        return new CustomerDaoService();
    }
    
    @Bean
    public CustomerSession customerSession() {
        return new CustomerService();
    }
}
