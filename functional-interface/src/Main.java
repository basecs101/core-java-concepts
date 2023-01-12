public class Main {
    public static void main(String[] args) {

        FunctionalInterfaceExample a = new A();
        FunctionalInterfaceExample b = new B();

        a.printElements();
        b.printElements();

        a.sayHello();
        b.sayHello();

        FunctionalInterfaceExample.printRandomNumber();

    }
}