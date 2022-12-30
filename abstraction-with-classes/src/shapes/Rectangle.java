package shapes;

import features.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
    }

    @Override
    public void calculateArea(float x, float y) {
        area = x * y;
    }
}
