public class StringExamples {
    public static void main(String[] args) {

        String name2 = "Mike";
        String name3 = "Mike";

        System.out.println("hashcode for name2 : "+name2.hashCode());
        System.out.println("hashcode for name3 : "+name3.hashCode());


        String name4 = new String("Mike Tyson");

        String name5 = name4.intern();

        if (name4 == name5){
            System.out.println("name2 and name3 are pointing to same string objets");
        } else {
            System.out.println(" They are holding different addresses");
        }

        //how many objects are created?

    }
}
