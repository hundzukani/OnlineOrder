package za.co.decorator;

/**
 *
 * @author hmanganyi
 */
public class FileManagerDecorator implements FileManagerTemplate {

    private final FileManagerTemplate fileManagerTemplate;

    public FileManagerDecorator(FileManagerTemplate fileManagerTemplate) {
        this.fileManagerTemplate = fileManagerTemplate;
    }

    @Override
    public void writeToFile(String message) {
        fileManagerTemplate.writeToFile(message);
    }
}
