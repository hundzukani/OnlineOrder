
package za.co.decorator;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.getLogger();
        
        logger.log("test decorator message");
    }
    
}
