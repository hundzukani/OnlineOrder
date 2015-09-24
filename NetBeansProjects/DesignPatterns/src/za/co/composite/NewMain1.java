package za.co.composite;

/**
 *
 * @author hmanganyi
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CompositeException {

        FileSystemComponent dirComp = new DIRComponent("Year2000");
        FileSystemComponent subFolder1 = new DIRComponent("Jan");
        FileSystemComponent subFolder2 = new DIRComponent("Feb");

        FileSystemComponent folder1File1 = new FileComponent("Jan1DataFile.txt", 1000);
        FileSystemComponent folder1File2 = new FileComponent("Jan2DataFile.txt", 2000);
        FileSystemComponent folder2File1 = new FileComponent("Feb1DataFile.txt", 3000);
        FileSystemComponent folder2File2 = new FileComponent("Feb2DataFile.txt", 4000);

  
            dirComp.addComponent(subFolder1);
            dirComp.addComponent(subFolder2);

            subFolder1.addComponent(folder1File1);
            subFolder1.addComponent(folder1File2);

            subFolder2.addComponent(folder2File1);
            subFolder2.addComponent(folder2File2);
            
            System.out.println(dirComp);
         
           
            for(FileSystemComponent mainComp : dirComp.getList()) {
                
                System.out.println(mainComp);
                
                for(FileSystemComponent comp : mainComp.getList()) {
                    System.out.println(comp);
                }
                
            }

        
    }

}
