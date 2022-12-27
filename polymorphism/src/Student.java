public class Student {
    private String name;
    private int rollNumber;
    private int id;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String name, int rollNumber, int id) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.id = id;
    }

    public Student(int id, int rollNumber, String name) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", id=" + id +
                '}';
    }

    public void doStudy(){
        System.out.println("Student is Studying");
    }

    public void doStudy(String subject){
        System.out.println("Student is studying " + subject);
    }

//    private int doStudy(String subject){
//        System.out.println("Student is studying " + subject);
//        return 10;
//    }

    public void commute(){
        System.out.println("Student is commuting");
    }

    void play(){
        System.out.println("Student is Playing");
    }

    Object studentDetails(){
        return this;
    }
}
