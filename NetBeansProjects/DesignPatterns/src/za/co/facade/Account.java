package za.co.facade;

/**
 *
 * @author hmanganyi
 */
public class Account {
    
    private String firstName;
    private String lastName;
    
    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean isValid() {
        return true;
    }
    
    public void save() {
        System.out.println("Data Saved");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
