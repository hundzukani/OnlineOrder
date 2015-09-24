package za.co.decorator;

/**
 *
 * @author hmanganyi
 */
public class FileLogger implements Logger {

    private final FileManagerDecorator fileManagerDecorator;

    public FileLogger() {
        fileManagerDecorator = new FileManagerDecorator(FileManager.getInstance());
    }

    @Override
    public void log(String message) {
        fileManagerDecorator.writeToFile(message);
    }
}
