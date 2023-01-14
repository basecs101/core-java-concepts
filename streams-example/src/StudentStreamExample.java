import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Student {
    String firstName;
    String lastName;
    int rollNumber;
    char division;

    public Student(String firstName, String lastName, int rollNumber, char division) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.division = division;
    }
}
public class StudentStreamExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Vikram","Gupta",1,'A'));
        studentList.add(new Student("Vivek","Gupta",11,'A'));
        studentList.add(new Student("Vishal","Gupta",13,'C'));
        studentList.add(new Student("Vinod","Gupta",4,'D'));
        studentList.add(new Student("Vikram","Gupta",5,'B'));

        Stream<Student> studentStream = studentList.stream();

        Stream<Student> studentStream1 = studentStream.filter((student) -> {
            return student.rollNumber > 10;
        });

        studentStream1.forEach(student -> System.out.println("First Name : " + student.firstName+
                " Roll Number: " + student.rollNumber));

        Stream<Student> studentStreamNew = studentList.stream();

        long numberOfElements = studentStreamNew.count();
        System.out.println(numberOfElements);
    }
}
