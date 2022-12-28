import features.Shape;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

/**
 * This is a Driver class to drive the functionality of
 * abstraction module.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();


        circle.displayArea(10,10);
        square.displayArea(10,10);
        rectangle.displayArea(10,20);
        triangle.displayArea(10,20);

    }
}