package com.dvt.config;

import com.dvt.services.ConfigService;
import com.dvt.sessions.ConfigurationSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author hmanganyi
 */
@Configuration
@ComponentScan(basePackages = "com.dvt")
public class HibernateConfig {
    
    @Bean(name = "factoryConfigSession")
    public ConfigurationSession configSession() {
        return new ConfigService();
    }
}
