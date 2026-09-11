import java.util.ArrayList;
import java.util.List;

public class Business {
    // Basic business information
    private String name;
    private String owner;
    private double funds;

    // Static field to track total number of businesses created
    private static int totalBusinesses = 0;

    // Constant tax rate applied to all businesses
    public static final double TAX_RATE = 0.1;

    // List to store employees (composition)
    private List<Employee> employees;

    // Overloaded constructor: only name provided
    public Business(String name) {
        this(name, "Unknown", 1000.0); // Default owner and funds
    }

    // Overloaded constructor: name + starting funds
    public Business(String name, double startingFunds) {
        this(name, "Unknown", startingFunds);
    }

    // Main constructor: initializes all fields
    public Business(String name, String owner, double startingFunds) {
        this.name = name;
        this.owner = owner;
        this.funds = startingFunds;
        this.employees = new ArrayList<>();
        totalBusinesses++; // Increase static counter
    }

    // Getter methods for encapsulation
    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public double getFunds() {
        return funds;
    }

    public static int getTotalBusinesses() {
        return totalBusinesses;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Apply tax deduction to business funds
    public void payTaxes() {
        funds -= funds * TAX_RATE;
    }

    // Hire a new employee and add them to the list
    public Employee hireEmployee(String empName, String role, double salary) {
        Employee newEmp = new Employee(empName, role, salary);
        employees.add(newEmp);
        return newEmp;
    }

    // Nested Employee class representing workers in the business
    public class Employee {
        private String name;
        private String role;
        private double salary;

        // Constructor for employee details
        public Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public double getSalary() {
            return salary;
        }
    }
}
