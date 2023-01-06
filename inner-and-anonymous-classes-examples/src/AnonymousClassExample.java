/**
 * Anonymous inner class example.
 */
interface ExampleInterface {
    void display();
}

/*
class TestImp implements Test{
    @Override
    public void display() {
        System.out.println("display");
    }
}
*/

public class AnonymousClassExample {

    public static void main(String[] args) {

        /*
            1. The left side type should be an Interface e.g. Test exampleInterface
            2. The right side must be an anonymous class body e.g. new ExampleInterface() { ... };
            where {...} this is anonymous class that implements ExampleInterface interface
            and also creates its object and finally assigns the address the object to the
            exampleInterface variable.

            In practice, while creating a thread we can use anonymous class to pass runnable object
            to thread constructor.
         */
        ExampleInterface exampleInterface = new ExampleInterface() {
            @Override
            public void display() {
                System.out.println("Hello from anonymous class method");
            }
        };
//      Test exampleInterface = () -> System.out.println("Hello from anonymous class display method");
        exampleInterface.display();
    }
}



