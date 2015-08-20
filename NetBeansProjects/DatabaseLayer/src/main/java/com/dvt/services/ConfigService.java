package com.dvt.services;

import com.dvt.databaselayer.entities.Customer;
import com.dvt.sessions.ConfigurationSession;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author hmanganyi
 */

public class ConfigService implements ConfigurationSession {

    @Override
    public Configuration getConfiguration() {
        
        Configuration config = new Configuration();
        config.configure("com/dvt/databaselayer/hibernate.cfg.xml");
        
        config.addAnnotatedClass(Customer.class);
        return config;
    }

}
