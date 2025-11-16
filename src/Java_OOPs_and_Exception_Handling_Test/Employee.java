package Java_OOPs_and_Exception_Handling_Test;

public class Employee {
    //Employee Encapsulation
    //Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
    //
    //Examples:
    //Input:
    //Employee with id=1, name="John Doe", salary=50000
    //Output:
    //Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
    //💡 Explanation:Create private instance variables and provide public getter/setter methods to access and modify them safely.
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + id +
                " Employee Name: " + name +
                " Employee Salary: " + salary);
    }
}
