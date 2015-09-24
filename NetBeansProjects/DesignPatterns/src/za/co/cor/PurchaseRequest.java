package za.co.cor;

/**
 *
 * @author hmanganyi
 */
public class PurchaseRequest {

    private String description;
    private double amount;
    private int id;
    
    public PurchaseRequest(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
