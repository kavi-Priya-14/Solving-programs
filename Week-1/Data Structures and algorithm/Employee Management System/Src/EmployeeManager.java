package employees;

public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search employee
    public Employee searchEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse employees
    public void listEmployees() {
        if (size == 0) {
            System.out.println("No employees.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    // Delete employee
    public void deleteEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee " + empId + " deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
