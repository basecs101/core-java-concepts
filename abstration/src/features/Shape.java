package features;

/**
 * This interface defines features for different Shape Objects like
 * Circle, Rectangle, Square and Triangle etc.
 * By using this interface the developer wants to hide the implementations
 * of the methods of this interface.
 * By doing so, full abstraction(method implementation hiding) is achieved.
 * This interface can be shared by the developer to other 3rd party developers
 * to write their own shape objects and those shape objects will have their
 * own implementations of these abstract methods.
 *
 * @author Vikram Gupta
 */
public interface Shape {
    float PI = 3.142f;//public static final float PI = 3.142f;

    float calculateArea(int x, int y);//method declaration

    void displayArea(int x, int y);//method declaration
}
