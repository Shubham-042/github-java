package oopsExercises.Ques18;
//Create an Employee class with members empNo, name, department, and salary.
// Use a one-dimensional array of Employee objects (size 10) to read the data for 5 employees from command line arguments.
// Display the data and determine which employee has the highest salary.
public class EmployeeManager {
    public static void main(String[] args) {
        if(args.length<20){
            System.out.println("Please provide data for 5 employees ");
            return;
        }
        Employee[] employees=new Employee[5];

        //Read from command line argument
        for(int i=0; i<5; i++){
            int emNo=Integer.parseInt(args[i*4]);
            String name=args[i*4+1];
            String dept=args[i*4+2];
            double salary=Double.parseDouble(args[i*4+3]);
            employees[i]=new Employee(emNo,name,dept,salary);
        }

        for(Employee employee:employees){
            employee.display();
        }

        Employee highPaid=employees[0];
        for(Employee employee:employees){
            if(employee.salary> highPaid.salary){
                highPaid=employee;
            }
        }
        System.out.println(highPaid.salary);
    }
}
