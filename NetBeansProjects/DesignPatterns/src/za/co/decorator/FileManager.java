package za.co.decorator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hmanganyi
 */
public class FileManager implements FileManagerTemplate {

    private static FileManager instance;
    private File file;
    private FileWriter fileWriter;
    private LoggerManager loggerManager;

    private FileManager() {

    }

    public synchronized void openFile() {

        if (loggerManager == null) {
            loggerManager = LoggerManager.getInstance();
        }

        try {
            file = new File(loggerManager.getProperty("file"));

            if (file.length() > 20) {
                fileWriter = new FileWriter(file);
            } else {
                fileWriter = new FileWriter(file, true);
            }

        } catch (IOException io) {
            throw new RuntimeException("problem occured");
        }
    }

    public synchronized void closeFile() {
        try {
            fileWriter.close();
        } catch (IOException io) {
            throw new RuntimeException("problem occured");
        }
    }

    public synchronized void write(String message) {
        try {
            message += "\r\n";
            fileWriter.write(message);
        } catch (IOException io) {
            throw new RuntimeException("Failed to log message");
        }
    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    @Override
    public void writeToFile(String message) {
        openFile();
        write(message);
        closeFile();
    }
}
