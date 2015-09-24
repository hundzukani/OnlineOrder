package za.co.bridge;

/**
 *
 * @author hmanganyi
 */
public class FileLogger implements Logger {


    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
