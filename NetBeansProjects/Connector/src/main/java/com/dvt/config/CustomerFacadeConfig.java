package com.dvt.config;

import com.dvt.onlineorder.connector.CustomerFacade;
import com.dvt.sessions.CustomerFacadeSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author hmanganyi
 */
@Configuration
@ComponentScan(basePackages = "com.dvt")
public class CustomerFacadeConfig {
    
    @Bean(name = "pizzaFlowActions")
    public CustomerFacadeSession customerFacade() {
        return new CustomerFacade();
    }
}
