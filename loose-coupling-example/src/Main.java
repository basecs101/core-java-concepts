interface Person{
    void display();
    default void display2(){
        System.out.println("Default method called");
    }
}

class Employee implements Person{

    @Override
    public void display() {
        System.out.println("Employee display called");
    }
}
class Student implements Person{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Student display called");
    }

}
public class Main {
    public static void main(String[] args)  {

        Person student = new Student("Vivek",24);
        student.display();
        student.display2();

        Person employee = new Employee();
        employee.display();
        employee.display2();


    }
}