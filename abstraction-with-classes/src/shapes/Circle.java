package shapes;

import features.Shape;

public class Circle extends Shape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Shape.PI * this.radius * this.radius;
    }
}
