//Streams --> Sequence of Elements(String, Integer, Double, Student, Employee etc)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class EmployeeStreamExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Vikram",1000));
        employeeList.add(new Employee("Vivek",1500));
        employeeList.add(new Employee("Pratik",800));
        employeeList.add(new Employee("Bob",2000));

        System.out.println("**************************");

        employeeList.forEach(employee -> System.out.println("Name : "+
                employee.name +" "+ "Salary : "+employee.salary));

        System.out.println("**************************");


//        Stream<Employee> employeeStream = employeeList.stream();
//
//        Stream<Employee> employeeStream1 = employeeStream.sorted(Comparator.comparing(employee -> employee.name));
//
//        employeeStream1.forEach(employee ->  System.out.println("Name : "+
//                        employee.name +" "+ "Salary : "+employee.salary));
        employeeList.stream()
                .sorted(Comparator.comparing(employee -> employee.salary))
                .forEach(employee ->  System.out.println("Name : "+
                        employee.name +" "+ "Salary : "+employee.salary));
    }
}