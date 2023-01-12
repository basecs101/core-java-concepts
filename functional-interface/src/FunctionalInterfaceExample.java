import java.util.Random;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void printElements();

    default void sayHello(){
        System.out.println("Hello");
    }

    static void printRandomNumber(){
        Random random = new Random();
        System.out.println(random.nextInt());
    }

}
