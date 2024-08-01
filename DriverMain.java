package task_3;

import java.util.Scanner;

interface Taxable {
 double SALES_TAX = 0.07; 
 double INCOME_TAX = 0.105; 

 double calcTax();
}

class Employee implements Taxable {
 private int empId;
 private String name;
 private double salary;

 public Employee(int empId, String name, double salary) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
 }

 @Override
 public double calcTax() {
     return salary * INCOME_TAX;
 }

 @Override
 public String toString() {
     return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary + ", Income Tax: " + calcTax();
 }
}


class Product implements Taxable {
 private int pid;
 private double price;
 private int quantity;

 public Product(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }

 @Override
 public double calcTax() {
     return price * SALES_TAX;
 }

 @Override
 public String toString() {
     return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity + ", Sales Tax (per unit): " + calcTax();
 }
}

public class DriverMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter employee information:");
     System.out.print("Employee ID: ");
     int empId = scanner.nextInt();
     scanner.nextLine(); // Consume newline
     System.out.print("Name: ");
     String name = scanner.nextLine();
     System.out.print("Salary: ");
     double salary = scanner.nextDouble();

     Employee employee = new Employee(empId, name, salary);
     System.out.println(employee);
     System.out.println("\nEnter product information:");
     System.out.print("Product ID: ");
     int pid = scanner.nextInt();
     System.out.print("Price: ");
     double price = scanner.nextDouble();
     System.out.print("Quantity: ");
     int quantity = scanner.nextInt();

     Product product = new Product(pid, price, quantity);
     System.out.println(product);

     scanner.close();
 }
}