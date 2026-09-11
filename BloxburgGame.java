import java.util.Scanner;

public class BloxburgGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bloxburg Business Simulator!");

        // Create first business with preset values
        Business pizzaPlace = new Business("Pizza Palace", "Alex", 5000);

        // Hire an employee for the pizza place
        Business.Employee pizzaEmployee = pizzaPlace.hireEmployee("John", "Chef", 15);

        // Get user input for second business
        System.out.print("Enter second business name: ");
        String bName = scanner.nextLine();

        System.out.print("Enter owner name: ");
        String bOwner = scanner.nextLine();

        System.out.print("Enter starting funds: ");
        double bFunds = scanner.nextDouble();

        // Create user-defined business
        Business userBusiness = new Business(bName, bOwner, bFunds);

        // Display total number of businesses created
        System.out.println("Total businesses created: " + Business.getTotalBusinesses());
        System.out.println();

        // Show details for the first business
        System.out.println("Business: " + pizzaPlace.getName());
        System.out.println("Owner: " + pizzaPlace.getOwner());
        System.out.println("Funds before taxes: $" + pizzaPlace.getFunds());

        // Apply taxes to the business
        pizzaPlace.payTaxes();
        System.out.println("Funds after taxes: $" + pizzaPlace.getFunds());

        // Display employee information
        System.out.println("Employee: " + pizzaEmployee.getName() +
                " | Role: " + pizzaEmployee.getRole() +
                " | Salary: $" + pizzaEmployee.getSalary() + "/hour");

        scanner.close();
    }
}
