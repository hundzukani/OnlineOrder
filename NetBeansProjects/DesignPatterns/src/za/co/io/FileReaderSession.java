
package za.co.io;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author hmanganyi
 */
public interface FileReaderSession {
    
    public List read() throws IOException;
}
