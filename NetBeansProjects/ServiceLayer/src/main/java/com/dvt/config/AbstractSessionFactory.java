package com.dvt.config;

import com.dvt.sessions.ConfigurationSession;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


/**
 *
 * @author hmanganyi
 */
@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.dvt")
public class AbstractSessionFactory {

    @Autowired
    private ConfigurationSession configurationSession;
    
    @Bean
    public SessionFactory sessionFactory() {
        
        Configuration config = getConfiguration();
        SessionFactory factory = config.buildSessionFactory();
        return factory;
    }
    
    private Configuration getConfiguration() {
        return configurationSession.getConfiguration();
    }
}
