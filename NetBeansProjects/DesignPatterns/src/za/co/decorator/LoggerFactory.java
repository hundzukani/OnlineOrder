package za.co.decorator;

import java.io.IOException;

/**
 *
 * @author hmanganyi
 */
public class LoggerFactory {

    private final LoggerManager loggerManager;

    public LoggerFactory() {
        loggerManager = LoggerManager.getInstance();
    }

    private boolean isFileLoggingEnabled() {

        try {
            if (loggerManager.getProperty("logType").equalsIgnoreCase("html")) {
                return true;
            }
        } catch (IOException io) {
            return false;
        }
        return false;
    }

    public Logger getLogger() {

        try {
            String logType = loggerManager.getProperty("logType");

            switch (logType) {
                case "html":
                    return new HTMLFileLogger(new ConsoleLogger());
            }

        } catch (IOException io) {
            throw new RuntimeException("failed to get log type");
        }
        if (isFileLoggingEnabled()) {
            return new FileLogger();
        } else {
            return new ConsoleLogger();
        }
    }
}
