package za.co.factory.shape;

import za.co.abstractfactory.AbstractFactory;
import za.co.factory.color.Color;
import za.co.factory.color.NullColor;

/**
 *
 * @author hmanganyi
 */
public  class ShapeFactory extends AbstractFactory  {

    @Override
    public  Shape getShape(String shape) {

        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }

    @Override
    public Color getColor(String color) {
        return new NullColor();
    }
}
