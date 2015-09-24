
package za.co.prototype;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person personA = new Person("PersonA", "Civic");
        
        System.out.println("Original (Original Values) " + personA.getName() + " - " + personA.getCar().getName());
        
        Person personC = (Person)personA.clone();
        
        System.out.println("Clone (Before Change) " + personC.getName() + " - " + personC.getCar().getName());
        
        personC.setName("Person-B");
        personC.getCar().setName("Accord");
        
         System.out.println("Clone (After Change) " + personC.getName() + " - " + personC.getCar().getName());
         
           System.out.println("Original (After clone is modified) " + personA.getName() + " - " + personA.getCar().getName());
    }
    
}
