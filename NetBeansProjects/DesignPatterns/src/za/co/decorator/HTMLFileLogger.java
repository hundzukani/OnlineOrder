package za.co.decorator;

/**
 *
 * @author hmanganyi
 */
public class HTMLFileLogger implements Logger {

    private final Logger logger;
    
    public HTMLFileLogger(Logger logger) {
        this.logger = logger;
    }
    
    @Override
    public void log(String message) {
        
        message = htmlLog(message);
        logger.log(message);
    }
    
    private String htmlLog(String message) {
        message = "<html>" +message + "</html>";
        return message;
    }
}
