package za.co.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hmanganyi
 */
public abstract class FileSystemComponent {

    private String name;
    private List<FileSystemComponent> list;

    public FileSystemComponent(String cName) {
        name = cName;
        list = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component)
            throws CompositeException {
        throw new CompositeException(
                "Invalid Operation. Not Supported");
    }

    public FileSystemComponent getComponent(int componentNum)
            throws CompositeException {
        throw new CompositeException(
                "Invalid Operation. Not Supported");
    }

    public abstract long getComponentSize();

    public String getName() {
        return name;
    }

    public List<FileSystemComponent> getList() {
        return list;
    } 
}
