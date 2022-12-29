public class Employee {

    private String name;
    private int salary;
    private int age;

    private Address address;

    private Employee() {
    }

    public static Employee getInstance() {
        return new Employee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //logic to set age
        if (age > 14) {
            this.age = age;
        } else {
            this.age = 22;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", address=" + address.toString() +
                '}';
    }
}
