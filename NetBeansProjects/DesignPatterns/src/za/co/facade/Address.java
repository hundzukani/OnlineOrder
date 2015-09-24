package za.co.facade;

/**
 *
 * @author hmanganyi
 */
public class Address {

    private String address;
    private String city;
    private String state;

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public boolean isValid() {
        return true;
    }

    public void save() {
        System.out.println("Data Saved");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
