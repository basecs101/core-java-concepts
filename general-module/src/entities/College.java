package entities;

public class College {
    String name;
    int numOfStaff;
    int numOfStudents;

    public College() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumOfStaff() {
        return numOfStaff;
    }

    public void setNumOfStaff(int numOfStaff) {
        this.numOfStaff = numOfStaff;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "entities.College{" +
                "name='" + name + '\'' +
                ", numOfStaff=" + numOfStaff +
                ", numOfStudents=" + numOfStudents +
                '}';
    }
}
