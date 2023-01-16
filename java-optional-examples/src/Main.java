import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final String name = "ABCDEF";

        if (name != null && !name.isEmpty() && name.length() > 3){
            System.out.println("Length of String is greater than 3");
        } else {
            System.out.println("String is either null or empty or length less 3");
        }

        Optional<String> name2 = Optional.ofNullable(name);

        if (!name2.isEmpty() && name2.get().length()>3){
            System.out.println("Length of String is greater than 3");
        } else {
            System.out.println("String is either null or empty or length less 3");
        }
    }
}