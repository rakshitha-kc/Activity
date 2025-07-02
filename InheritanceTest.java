package InheritanceDemo;

//Base class
class Animal {
 void eat() {
     System.out.println("Animal can eat.");
 }
}

//First derived class
class Mammal extends Animal {
 void walk() {
     System.out.println("Mammal can walk.");
 }
}

//Second derived class
class Dog extends Mammal {
 void bark() {
     System.out.println("Dog can bark.");
 }
}

//Main class
public class InheritanceTest {
 public static void main(String[] args) {
     // Create Dog object
     Dog myDog = new Dog();

     // Access methods from all classes via inheritance
     System.out.println("Dog's Abilities:");
     myDog.eat();   // From Animal
     myDog.walk();  // From Mammal
     myDog.bark();  // From Dog
 }
}



