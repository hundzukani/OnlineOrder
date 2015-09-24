package za.co.adapter;

/**
 *
 * @author hmanganyi
 */
public class SAAddress implements AddressValidator {

    @Override
    public boolean isAddressValid(String city, String zipCode) {
        
        return true;
    }
    
}
