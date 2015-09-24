package za.co.io;

import java.io.IOException;

/**
 *
 * @author hmanganyi
 */
public interface FileWriterSession {
    
    public void writeToFile(String text) throws IOException;
}
