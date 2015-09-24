package za.co.composite;

/**
 *
 * @author hmanganyi
 */
public class CompositeException extends Exception {
    
    private String message;
    
    public CompositeException(String message) {
        this.message = message;
    }
    
    
}
