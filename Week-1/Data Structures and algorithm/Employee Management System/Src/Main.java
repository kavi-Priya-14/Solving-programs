package employees;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        // Adding employees
        manager.addEmployee(new Employee("E101", "Alice", "Manager", 60000));
        manager.addEmployee(new Employee("E102", "Bob", "Engineer", 40000));
        manager.addEmployee(new Employee("E103", "Charlie", "HR", 35000));

        System.out.println("=== All Employees ===");
        manager.listEmployees();

        System.out.println("\n=== Searching for E102 ===");
        Employee found = manager.searchEmployee("E102");
        System.out.println(found != null ? found : "Not found");

        System.out.println("\n=== Deleting E102 ===");
        manager.deleteEmployee("E102");

        System.out.println("\n=== All Employees After Deletion ===");
        manager.listEmployees();
    }
}
