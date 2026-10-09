package oopsExercises.Ques17;

public class Employee {
    // Data members
    int empNo;
    String name;
    String department;
    double salary;

    // Constructor to initialize data members
    public Employee(int empNo, String name, String department, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    // Main method to accept command line arguments and create Employee object
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide all required command line arguments: empNo name department salary");
            return;
        }

        // Parse command line arguments
        int empNo = Integer.parseInt(args[0]);
        String name = args[1];
        String department = args[2];
        double salary = Double.parseDouble(args[3]);

        // Create an Employee object using the new operator
        Employee employee = new Employee(empNo, name, department, salary);

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
