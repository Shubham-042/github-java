package oopsExercises.Ques18;
//Create an Employee class with members empNo, name, department, and salary.
// Use a one-dimensional array of Employee objects (size 10) to read the data for 5 employees from command line arguments.
// Display the data and determine which employee has the highest salary.
public class Employee {
     int emNo;
     String name;
     String dept;
     double salary;


    public Employee(int emNo,String name ,String dept,double salary){
        this.emNo=emNo;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Employee number: "+emNo);
        System.out.println("Employee name :"+name);
        System.out.println("Department :"+dept);
        System.out.println("Salary :"+salary);
        System.out.println("-------------------------");
    }
}
