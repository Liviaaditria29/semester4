/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan4;

/**
 *
 * @author Lenovo
 */
import java.util.Date;

class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String Name = "";
    private double Salary = 0.0;
    private Date birthDate;
    
    public Employee(){}
    public Employee(String name, double salary, Date DoB){
        this.Name = name;
        this.Salary = salary;
        this.birthDate = DoB;
    }
    public Employee(String name, double salary){
        this(name, salary, null);
    }
    public Employee(String name, Date DoB){
        this(name, BASE_SALARY, DoB);
    }
    public Employee(String name){
        this(name, BASE_SALARY);
    }

    public String getName() {
      return Name;
    }

    public double getSalary() {
      return Salary;
    }
}

class Manager extends Employee{
    // tambahan attribute untuk kelas manager;
    private String department;

    public Manager(String name, double salary, String dept){
        super(name, salary);
        department = dept;
    }

    public Manager(String n, String dept){
        super(n);
        department = dept;
    }

    public Manager(String dept){
        super();
        department = dept;
    }

    public String getDept() {
      return department;
    }
}

public class TestManager {
    public static void main(String[] args) throws Exception {
        Manager Utama = new Manager("John", 5000000, "Financial");
        System.out.println("Name:" + Utama.getName());
        System.out.println("Salary:" + Utama.getSalary());
        System.out.println("Department:" + Utama.getDept());
        
        Utama = new Manager("Michael", "Accouting");
        System.out.println("Name:" + Utama.getName());
        System.out.println("Salary:" + Utama.getSalary());
        System.out.println("Department:" + Utama.getDept());
    }
}
