package shapes;

import features.Shape;

public class Rectangle implements Shape {
    @Override
    public float calculateArea(int x, int y) {
        return x*y;
    }
    @Override
    public void displayArea(int x, int y) {
        System.out.println(calculateArea(x,y));
    }
}
