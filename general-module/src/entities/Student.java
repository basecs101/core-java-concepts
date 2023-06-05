package entities;

public class Student {
    String name;
    College college;
    int id;
    Address address;

    public Student() {
    }

    public Student(String name, College college, int id, Address address) {
        this.name = name;
        this.college = college;
        this.id = id;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "entities.Student{" +
                "name='" + name + '\'' +
                ", collegeName=" + college +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
