public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Tom", 102, "MIT");

        Student s3 = new Student("Bob");

        Student s4 = new Student(s2);

        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}