public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Vikram", 1000, 101,
                new Address("A106", null, null, "Pune", 412307));
        System.out.println(employee);
        employee.getAddress().setCity("Mumbai");
        System.out.println(employee);
        System.out.println(employee);


    }
}