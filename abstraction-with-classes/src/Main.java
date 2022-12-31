import features.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10.0f);
        Shape rectangle = new Rectangle(10.0f, 20.0f);
        circle.calculateArea();
        circle.displayArea();
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}