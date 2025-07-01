public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(102, "Bob", "Manager", 75000));
        manager.addEmployee(new Employee(103, "Charlie", "HR", 50000));

        System.out.println("\nAll Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 102:");
        Employee emp = manager.searchEmployee(102);
        System.out.println(emp != null ? emp : "Not Found");

        System.out.println("\nDeleting Employee with ID 101:");
        manager.deleteEmployee(101);

        System.out.println("\nAll Employees After Deletion:");
        manager.traverseEmployees();
    }
}
