package za.co.decorator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author hmanganyi
 */
public class LoggerManager {

    private static LoggerManager instance;

    private LoggerManager() {
    }

    public static LoggerManager getInstance() {
        if (instance == null) {
            instance = new LoggerManager();
        }
        return instance;
    }

    public String getProperty(String property) throws IOException {

        Properties properties = new Properties();
        String propertyFile = "logger.properties";

        InputStream stream = getClass().getClassLoader().getResourceAsStream(propertyFile);

        if (stream != null) {
            properties.load(stream);
        }

        String fileName = properties.getProperty(property);
        return fileName;
    }
}
