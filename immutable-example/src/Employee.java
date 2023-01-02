/**
 * Demonstrate immutable class creation and its rules
 */
public final class Employee {
    private final String name;
    private final int salary;
    private final int id;
    private final Address address;

    public Employee(String name, int salary, int id, Address address) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.address = new Address(address.flatNum, address.lane1, address.lane2
                , address.city, address.postCode);//deep clone
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }


    public Address getAddress() {
        return new Address(address.flatNum, address.lane1,
                address.lane2, address.city, address.postCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
