package za.co.composite;

/**
 *
 * @author hmanganyi
 */
public class FileComponent extends FileSystemComponent {

    private final long size;
    private final  String name;
    
    public FileComponent(String cName, long size) {
        super(cName);
        this.size = size;
        this.name = cName;
    }

    @Override
    public long getComponentSize() {        
        return size;
    }

    @Override
    public String toString() {
        return "[File Component : ] Name : " + name + " Size : " + size ; 
    }
    
    
}
