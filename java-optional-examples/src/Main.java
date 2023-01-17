import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final String name = "ABCDEF";

        if (name != null && !name.isEmpty() && name.length() > 3){
            System.out.println("Length of String is greater than 3");
        } else {
            System.out.println("String is either null or empty or length less 3");
        }

        Optional<String> name2 = Optional.ofNullable(name);
//        Optional<String> name2 = Optional.of(name);
//        Optional<String> name2 = Optional.empty();



        if (name2.isPresent()){
            System.out.println("Value is present in optional object");
        } else {
            System.out.println("No value present in optional object");
        }

        if (!name2.isEmpty() && name2.get().length()>3){
            System.out.println("Length of String is greater than 3");
        } else {
            System.out.println("String is either null or empty or length less 3");
        }
    }
}