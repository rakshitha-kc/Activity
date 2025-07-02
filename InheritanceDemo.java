package InheritanceDemo;

//Base class
class Vehicle {
 String type;
 String color;

 // Constructor
 Vehicle(String type, String color) {
     this.type = type;
     this.color = color;
 }

 void displayVehicle() {
     System.out.println("Vehicle Type: " + type);
     System.out.println("Color: " + color);
 }
}

//Derived class
class Motorcycle extends Vehicle {
 String brand;
 int engineCC;

 
 Motorcycle(String type, String color, String brand, int engineCC) {
     super(type, color); // Call constructor of Vehicle
     this.brand = brand;
     this.engineCC = engineCC;
 }

 void displayMotorcycle() {
     displayVehicle(); // Call method from Vehicle
     System.out.println("Brand: " + brand);
     System.out.println("Engine: " + engineCC + "cc");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     Motorcycle bike = new Motorcycle("Two-Wheeler", "Black", "Yamaha", 150);

     System.out.println("Motorcycle Details:");
     bike.displayMotorcycle();
 }
}
