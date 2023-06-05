package entities;

public class Employee {
    String name;
    College college;

    int age;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public Employee(String name, College college, int age) {
        this.name = name;
        this.college = college;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "entities.Employee{" +
                "name='" + name + '\'' +
                ", collegeName=" + college +
                ", age=" + age +
                '}';
    }
}
