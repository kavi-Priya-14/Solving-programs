import java.util.*;

class Account {
    int accountId;
    double balance;

    Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
}

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

class Customer {
    int customerId;
    String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}

public class ErrorHandlingDemo {
    static Map<Integer, Account> accounts = new HashMap<>();
    static Map<Integer, Employee> employees = new HashMap<>();
    static Map<Integer, Customer> customers = new HashMap<>();

    // Scenario 1: Safe fund transfer
    public static void safeTransferFunds(int fromId, int toId, double amount) {
        try {
            Account from = accounts.get(fromId);
            Account to = accounts.get(toId);

            if (from == null || to == null) {
                throw new Exception("Account not found.");
            }

            if (from.balance < amount) {
                throw new Exception("Insufficient funds in account " + fromId);
            }

            from.balance -= amount;
            to.balance += amount;
            System.out.println("Transferred $" + amount + " from A/C " + fromId + " to A/C " + toId);

        } catch (Exception e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }
    }

    // Scenario 2: Update salary with error handling
    public static void updateSalary(int empId, double percentage) {
        try {
            if (!employees.containsKey(empId)) {
                throw new Exception("Employee ID not found.");
            }
            Employee emp = employees.get(empId);
            emp.salary += emp.salary * (percentage / 100);
            System.out.println("Updated salary of " + emp.name + " to " + emp.salary);
        } catch (Exception e) {
            System.err.println("Salary update error: " + e.getMessage());
        }
    }

    // Scenario 3: Add new customer safely
    public static void addNewCustomer(int id, String name) {
        try {
            if (customers.containsKey(id)) {
                throw new Exception("Customer with ID " + id + " already exists.");
            }
            customers.put(id, new Customer(id, name));
            System.out.println("Customer " + name + " added successfully.");
        } catch (Exception e) {
            System.err.println("Error adding customer: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Initial Data
        accounts.put(1, new Account(1, 1000));
        accounts.put(2, new Account(2, 500));
        employees.put(101, new Employee(101, "Alice", 70000));
        customers.put(1, new Customer(1, "John Doe"));

        System.out.println("--- Scenario 1: Fund Transfer ---");
        safeTransferFunds(1, 2, 300); // Should succeed
        safeTransferFunds(2, 1, 1000); // Should fail

        System.out.println("\n--- Scenario 2: Update Salary ---");
        updateSalary(101, 10); // Should succeed
        updateSalary(999, 5);  // Should fail

        System.out.println("\n--- Scenario 3: Add Customer ---");
        addNewCustomer(2, "Jane Smith"); // Should succeed
        addNewCustomer(1, "Duplicate John"); // Should fail
    }
}
