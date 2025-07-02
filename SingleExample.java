package InheritanceDemo;

//Base class
class Employe {
 int empId;
 String name;

 // Constructor
 Employe(int empId, String name) {
     this.empId = empId;
     this.name = name;
 }

 // Method to display basic employee details
 void displayEmployee() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Name: " + name);
 }
}

//Derived class using single inheritance
class FullTimeEmployee extends Employe {
 double salary;

 // Constructor
 FullTimeEmployee(int empId, String name, double salary) {
     super(empId, name); // Call base class constructor
     this.salary = salary;
 }

 // Method to display full-time employee details
 void displayFullTimeDetails() {
     displayEmployee(); // Call base class method
     System.out.println("Employment Type: Full-Time");
     System.out.println("Salary: $" + salary);
 }
}

//Main class
public class SingleExample {
 public static void main(String[] args) {
     // Create a FullTimeEmployee object
     FullTimeEmployee emp = new FullTimeEmployee(101, "Anil Kumar", 45000.0);

     System.out.println("=== Full-Time Employee Details ===");
     emp.displayFullTimeDetails();
 }
}


