import features.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.calculateArea(10.2f, 5.1f);
        circle.displayArea();
        rectangle.calculateArea(10, 20);
        rectangle.displayArea();

    }
}