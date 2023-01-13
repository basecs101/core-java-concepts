import java.util.ArrayList;
import java.util.List;

/**
 * Functional Interface
 */
interface FuncInterfaceExample {
    int display(int a);
}

/**
 * Class implementing functional interface
 */
//class TestClass implements Test {
//    @Override
//    public int display(int a) {
//        return a*a;
//    }
//} //similar overridden  method written as lambda expression

/**
 * Driver class for above functional interface
 */
public class Main {
    public static void main(String[] args) {
        //FuncInterfaceExample test = a -> a*a;

        //Lambda expression can be used for providing
        //method implementation for functional interface.
        FuncInterfaceExample funcInterfaceExample = a -> {
            System.out.println("Inside Display method");
            return a*a;
        };//this is implementations of display method.

        int result  = funcInterfaceExample.display(10);

        System.out.println("Result from display method : "+result);

        //Another example for lambda expression
        List<String> guestList = new ArrayList<>();
        guestList.add("Vikram");
        guestList.add("Vivek");
        guestList.add("Sam");

        //Print all elements of guestList using for loop
        for (String guestName : guestList){
            System.out.println(guestName);
        }

        //Print all elements of guestList using forEach loop and Lambda exp
        guestList.forEach(guestName -> System.out.println(guestName));
    }
}