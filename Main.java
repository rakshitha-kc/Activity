package InheritanceDemo;
//Base class
class Person {
 String name;
 int age;

 // Constructor
 void Main(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display person information
 void displayPersonInfo() {
     System.out.println("Person Information:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Derived class using single inheritance
class Employee extends Main {
 String employeeId;
 double salary;

 // Constructor
 Employee(String name, int age, String employeeId, double salary) {
     super();  // Call the constructor of the base class
     this.employeeId = employeeId;
     this.salary = salary;
 }

 // Method to display employee information
 void displayEmployeeInfo() {
     displayPersonInfo();  // Call base class method
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Salary: $" + salary);
 }

 private void displayPersonInfo() {
	// TODO Auto-generated method stub
	
 }
}

//Main class to run the program
 class Main {
 public static void main(String[] args) {
     // Create an Employee object
     Employee emp = new Employee("Alice", 30, "E101", 75000);

     // Display all information
     emp.displayEmployeeInfo();
 }
}

