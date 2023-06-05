package drivers;

import entities.Address;
import entities.College;
import entities.Employee;
import entities.Student;

public class Driver {
    public static void main(String[] args){

        Address address = new Address();
        address.setFlatNum("A106");
        address.setLineNum("Solapur road");
        address.setTaluka("Haveli");
        address.setDistrict("Pune");
        address.setState("MH");

        College college =  new College();
        college.setName("COE");
        college.setNumOfStaff(200);
        college.setNumOfStudents(2000);

        Employee employee = new Employee();
        employee.setName("Pratik");
        employee.setAge(45);
        employee.setCollege(college);


        Student student = new Student();

        student.setName("Vikram");
        student.setAddress(address);
        student.setCollege(college);
        student.setId(101);

        System.out.println(address.toString());
        System.out.println(college.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());


    }
}
