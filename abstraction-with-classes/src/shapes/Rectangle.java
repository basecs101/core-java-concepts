package shapes;

import features.Shape;

public class Rectangle extends Shape {

    float length, breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        area = this.length * this.breadth;
    }
}
