
package designpatterns;

import za.co.abstractfactory.AbstractFactory;
import za.co.factory.color.Color;

/**
 *
 * @author hmanganyi
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        AbstractFactory factory = AbstractFactory.getFactory("ff");
        Color color = factory.getColor("ggg");
        
        color.paint();
       
    }
    
}
