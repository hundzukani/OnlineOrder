
package za.co.adapter;

/**
 *
 * @author hmanganyi
 */
public class ZimabbweAddressAdapter extends ZimabbweAddress implements AddressValidator {

    @Override
    public boolean isAddressValid(String city, String zipCode) {
        return isValidZimbabweanAddress(city, zipCode);
    }
    
}
