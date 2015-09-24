package za.co.io;

import java.io.IOException;
import java.util.List;
import sun.font.Decoration;

/**
 *
 * @author hmanganyi
 */
public class FileFacade {

    private final FileWriterSession writer;
    private final FileReaderSession reader;
    private final FileWriterDecorator decorator;

    public FileFacade() throws IOException {
        writer = new FileWriter();
        reader = new FileReader();
        decorator = new FileWriterDecorator(writer);
    }

    public void writeToFile(String text) throws IOException {
        decorator.writeToFile(text);
    }

    public List read() throws IOException {
        return reader.read();
    }
}
