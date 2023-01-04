public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Mike");
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 =  stringBuilder1.append("Tyson");
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder2.insert(4," "));
        System.out.println(stringBuilder2.length());
    }
}
