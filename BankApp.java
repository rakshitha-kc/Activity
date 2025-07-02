package InheritanceDemo;

//Base class
class Account {
 String accountHolderName;
 String accountNumber;
 double balance;

 // Constructor
 Account(String name, String accNumber, double balance) {
     this.accountHolderName = name;
     this.accountNumber = accNumber;
     this.balance = balance;
 }

 // Method to display basic account details
 void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }
}

//Derived class for Savings Account
class SavingsAccount extends Account {
 double interestRate;

 SavingsAccount(String name, String accNumber, double balance, double interestRate) {
     super(name, accNumber, balance); // Call Account constructor
     this.interestRate = interestRate;
 }

 void displaySavingsDetails() {
     displayAccountDetails(); // Call base class method
     System.out.println("Account Type: Savings");
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

//Derived class for Current Account
class CurrentAccount extends Account {
 double overdraftLimit;

 CurrentAccount(String name, String accNumber, double balance, double overdraftLimit) {
     super(name, accNumber, balance); // Call Account constructor
     this.overdraftLimit = overdraftLimit;
 }

 void displayCurrentDetails() {
     displayAccountDetails(); // Call base class method
     System.out.println("Account Type: Current");
     System.out.println("Overdraft Limit: $" + overdraftLimit);
 }
}

//Main class
public class BankApp {
 public static void main(String[] args) {
     // Create a SavingsAccount object
     SavingsAccount savings = new SavingsAccount("Rakshu", "SAV123", 15000.0, 4.5);

     // Create a CurrentAccount object
     CurrentAccount current = new CurrentAccount("Lekhana", "CUR456", 8000.0, 2000.0);

     // Display details
     System.out.println("=== Savings Account Details ===");
     savings.displaySavingsDetails();

     System.out.println("\n=== Current Account Details ===");
     current.displayCurrentDetails();
 }
}

