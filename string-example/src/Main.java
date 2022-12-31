public class Main {
    public static void main(String[] args) {
        String name1 = "Mark";
        System.out.println(name1);

        String name2 = name1 + "Wryn";
        System.out.println(name2);

        if (name1 == name2) {
            System.out.println("Same addresses in name1 and name2");
        } else {
            System.out.println("Different addresses in name1 and name2");
        }
    }
}