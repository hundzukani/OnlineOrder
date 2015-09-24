package za.co.io;

import java.io.File;

/**
 *
 * @author hmanganyi
 */
public class FileManager {

    private static FileManager instance;
    private File file;

    private FileManager() {

    }

    public static synchronized FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public synchronized File getFile() {
        if (file == null) {
            file = new File("/home/hmanganyi/Desktop/logger/log.txt");
        }
        return file;
    }
}
