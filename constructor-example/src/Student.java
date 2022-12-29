public class Student {
    //object fields
    private String name;
    private int id;
    private String collegeName;

    //no-arg constructor
    public Student() {
        name = "Mike";
        id = 101;
        collegeName = "Stanford";
    }

    //parameterized
    //this is a reference for current object.
    //basically this holds the address for the object that calls the constructor
    //different number of arguments
    public Student(String name, int id, String collegeName) {
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
    }

    //parameterized constructor with different sequence of parameters
    public Student(int id, String name, String collegeName) {
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
    }

    private Student(int id, String collegeName) {
        this.id = id;
        this.collegeName = collegeName;
    }

    public Student(String name) {
        this(1000, "COEP");
        this.name = name;
    }

    //Type different example for constructor overloading
    public Student(int id) {
        this.id = id;
    }

    //copy constructor
    // fields must primitive or immutable
    // name and collegeName are immutable because of String class
    // id is primitive
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.collegeName = student.collegeName;
    }

    //fields getters
    public String getName() {
        return name;
    }

    //fields setters
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Id : " + id + " College Name " + collegeName;
    }
}
