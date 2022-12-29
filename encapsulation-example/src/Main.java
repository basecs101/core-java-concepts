public class Main {
    public static void main(String[] args) {

        Address address = Address.getInstance();
        address.setFlatNumber("A-106");
        address.setSocietyName("Vista Vintage");
        address.setPinCode(412307);

        Employee emp = Employee.getInstance();
        emp.setName("Rob");
        emp.setSalary(12000);
        emp.setAge(24);
        emp.setAddress(address);

        System.out.println(emp);

        Employee employee1 = Employee.getInstance();
        employee1.setName("Mike");
        employee1.setSalary(9000);
        employee1.setAge(2);
        employee1.setAddress(address);

        System.out.println(employee1);

    }
}