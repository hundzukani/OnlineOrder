package za.co.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author hmanganyi
 */
public class FileWriter implements FileWriterSession {

    private final File file = FileManager.getInstance().getFile();
    private java.io.FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    public FileWriter() throws IOException {
    }

    private final void write(String text) throws IOException {
        bufferedWriter.write(text);
    }

    private final void open() throws IOException {
        fileWriter = new java.io.FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);
    }

    private final void close() throws IOException {
        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public synchronized void writeToFile(String text) throws IOException {
        open();
        write(text);
        close();
    }
}
