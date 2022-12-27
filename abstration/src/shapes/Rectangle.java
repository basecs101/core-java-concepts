package shapes;

import features.Shape;

public class Rectangle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }
}
