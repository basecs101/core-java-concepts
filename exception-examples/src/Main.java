import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a= scanner.nextInt();
        System.out.println("Enter second value : ");
        int b= scanner.nextInt();

        try {
            System.out.println(a/b);
        } catch (ArithmeticException arithmeticExceptione){
            System.out.println("ArithmeticException caught");
        }

        System.out.println("After dividing a/b");
    }
}