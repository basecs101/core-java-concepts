import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String name1 = "cat";
        String name2 = name1.toUpperCase();//CAT
        System.out.println(name2);//CAT
        System.out.println(name2.length());//3
        System.out.println(name2.hashCode());//hashcode
        System.out.println(name1.hashCode());//hashcode
        System.out.println(name2.charAt(2));//T
        System.out.println(name2.equals(name1));//false
        System.out.println(name2.equalsIgnoreCase(name1));//true
        String name3 = name2.concat(name1);
        System.out.println(name3);//CATcat
        System.out.println(name3.hashCode());
        String name4 = name3.toLowerCase();
        System.out.println(name4);
    }
}
