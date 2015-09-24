package za.co.io;

import java.io.IOException;

/**
 *
 * @author hmanganyi
 */
public class FileWriterDecorator implements FileWriterSession {

    private final FileWriterSession session;
    
    public FileWriterDecorator(FileWriterSession session) {
        this.session = session;
    }
    
    @Override
    public void writeToFile(String text) throws IOException {
        text = messageFormatter(text);
        session.writeToFile(text);
    }
    
    private String messageFormatter(String message) {
        message = message + "\r\n";
        return message;
    }
}
