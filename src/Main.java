public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Shrijana", 1, 50000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Monika", 2, 20, 150.0);

        payrollSystem.addEmployee(fullTimeEmployee);
        payrollSystem.addEmployee(partTimeEmployee);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing employees");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees details:");
        payrollSystem.displayEmployees();

    }
}