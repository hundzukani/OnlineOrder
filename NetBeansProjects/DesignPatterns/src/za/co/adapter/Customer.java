package za.co.adapter;

/**
 *
 * @author hmanganyi
 */
public class Customer {

    private static final String SA = "SA";
    private static final String ZIMBABWE = "ZIMBABWE";

    public boolean isValidAddress() {
        AddressValidator validator = getValidator("");

        return validator.isAddressValid("Johannesburg", "1709");
    }

    private AddressValidator getValidator(String type) {

        if (type.equals(Customer.SA)) {
            return new SAAddress();
        }
        return new ZimabbweAddressAdapter();
    }
}
