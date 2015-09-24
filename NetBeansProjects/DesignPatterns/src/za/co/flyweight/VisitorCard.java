package za.co.flyweight;

/**
 *
 * @author hmanganyi
 */
public class VisitorCard {

    private final String name;
    private final String title;
    private final IntrinsicVisitorData instrinsicData;
    
    public VisitorCard(String name, String title, IntrinsicVisitorData instrinsicData) {
        this.name = name;
        this.title = title;
        this.instrinsicData = instrinsicData;
    }
    
    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Title : " + this.title);
        System.out.println("Company : " + instrinsicData.getCompany());
        System.out.println("City : " + instrinsicData.getCity());
        System.out.println("State : " + instrinsicData.getState());
        System.out.println("Code : " + instrinsicData.getZipCode());
    }
}
