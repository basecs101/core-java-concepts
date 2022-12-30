package features;

/**
 * This class {@code Shape} is an abstract class to demonstrate partial abstraction
 * and features of abstract class.
 *
 * @author Vikram Gupta
 */
public abstract class Shape {
    public static final float PI = 3.142f;
    public float area;

    public Shape() {
    }

    public abstract void calculateArea(float x, float y);

    public void displayArea() {
        System.out.println("Area of " + this.getClass().getName() + " is " + area);
    }
}
