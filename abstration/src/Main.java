import features.Shape;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        String msg = "Area of : ";
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        System.out.println(msg + circle.getClass().getName() + " = " + circle.calculateArea(10,10));
        System.out.println(msg + square.getClass().getName() + " = " + square.calculateArea(10,10));
        System.out.println(msg + rectangle.getClass().getName() + " = " + rectangle.calculateArea(10,20));
        System.out.println(msg + triangle.getClass().getName() + " = " + triangle.calculateArea(10,20));
    }
}