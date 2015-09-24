package za.co.factory.color;

import za.co.abstractfactory.AbstractFactory;
import za.co.factory.shape.Shape;

/**
 *
 * @author hmanganyi
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {

        switch (color) {
            case "red":
                return new Red();

            case "green":
                return new Green();

            case "blue":
                return new Blue();

            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
