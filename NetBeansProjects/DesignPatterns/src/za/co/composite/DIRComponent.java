package za.co.composite;

/**
 *
 * @author hmanganyi
 */
public class DIRComponent extends FileSystemComponent {

   
    private final String name;
    private long size = 0;
    
    public DIRComponent(String cName) {
        super(cName);
        this.name = cName;
    }

    @Override
    public long getComponentSize() {
      
        for(FileSystemComponent components : getList()) {
            size += components.getComponentSize();
        }
        
        return size;
    }

    @Override
    public void addComponent(FileSystemComponent component) {
        getList().add(component);
    }

    @Override
    public FileSystemComponent getComponent(int location) {
        return getList().get(location);
    }

    @Override
    public String toString() {
        return "[Dir Component] : Name : " + name + " - Size : " + size;
    }
}
