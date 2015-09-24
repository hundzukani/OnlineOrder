package za.co.abstractfactory;

import za.co.factory.color.Color;
import za.co.factory.color.ColorFactory;
import za.co.factory.shape.Shape;
import za.co.factory.shape.ShapeFactory;

/**
 *
 * @author hmanganyi
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

    public static AbstractFactory getFactory(String factory) {

        switch (factory) {

            case "shape":
                return new ShapeFactory();

            case "color":
                return new ColorFactory();
            default:
                return new NullAbstractFactory();
        }
    }
}
