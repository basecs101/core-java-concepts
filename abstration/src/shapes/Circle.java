package shapes;

import features.Shape;

/**
 * This class {@code Circle} is an implementation of Shape interface.
 * This class provides implementations/definition to abstract methods
 * of the interface {@code Shape}.
 * By doing so, abstraction is achieved as this class only knows what
 * methods to override and provide their definitions.
 */
public class Circle implements Shape {

    @Override
    public float calculateArea(int x, int y) {
        return Shape.PI*x*y;
    }

    @Override
    public void displayArea(int x, int y) {
        System.out.println(calculateArea(x,y));
    }
}
