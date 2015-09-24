package za.co.facade;

/**
 *
 * @author hmanganyi
 */
public class CreditCard {

    private String cardType;
    private String cardNumber;
    private String cardExpDate;

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardExpDate = cardExpDate;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public boolean isValid() {
        return true;
    }

    public void save() {
        System.out.println("Data Saved");
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

}
