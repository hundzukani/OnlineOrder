package za.co.abstractfactory;

import za.co.factory.color.Color;
import za.co.factory.color.NullColor;
import za.co.factory.shape.NullShape;
import za.co.factory.shape.Shape;

/**
 *
 * @author hmanganyi
 */
public class NullAbstractFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return new NullShape();
    }

    @Override
    public Color getColor(String color) {
        return new NullColor();
    }

}
