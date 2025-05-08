package Assignment_2_May07;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {

    private String name;
    private double salary;
    private String jobTitle;

    public Employee(String name, double salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String employeeDetails() {
        return "Name: " + name +
                "\nSalary: " + String.format("%.2f", salary) + " $" +
                "\nJob Title: " + jobTitle +
                "\nJob Duty: " + jobDuty();
    }

    abstract double calculateBonus();
    abstract String jobDuty();
}


class Manager extends Employee {
    private List<Employee> subOrdinate;

    public Manager(String name, double salary, String jobTitle) {
        super(name, salary, jobTitle);
        subOrdinate = new ArrayList<>();
    }

    @Override
    double calculateBonus() {
        double bonusPercentage = 0.20;
        return getSalary() * bonusPercentage;
    }

    @Override
    String jobDuty() {
        return "Manage People";
    }

    public void addSubordinate(Employee e) {
        subOrdinate.add(e);
    }

    public List<Employee> getSubOrdinate() {
        return subOrdinate;
    }
}


class Developer extends Employee {

    public Developer(String name, double salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        double bonusPercentage = 0.10;
        return getSalary() * bonusPercentage;
    }

    @Override
    String jobDuty() {
        return "Build Applications";
    }
}


class Tester extends Employee {

    public Tester(String name, double salary, String jobTitle) {
        super(name, salary, jobTitle);
    }

    @Override
    double calculateBonus() {
        double bonusPercentage = 0.05;
        return getSalary() * bonusPercentage;
    }

    @Override
    String jobDuty() {
        return "Test Applications";
    }
}


public class Assignment_2_3 {

    public static double calculateTotalBonus(List<Employee> employees) {
        double total = 0.0;
        for (Employee e : employees) {
            total += e.calculateBonus();
        }
        return total;
    }

    public static void main(String[] args) {

        Manager manager = new Manager("Harsha", 7000, "Manager");
        Developer developer = new Developer("Harry", 5000, "Developer");
        Tester tester = new Tester("Vivek", 4000, "Tester");
        Manager manager2 = new Manager("Bob", 7200, "Manager");
        Developer developer2 = new Developer("Mathew", 5100, "Developer");
        Tester tester2 = new Tester("Alice", 4000, "Tester");
        Manager manager3 = new Manager("C", 7000, "Manager");
        Developer developer3 = new Developer("S", 5100, "Developer");
        Tester tester3 = new Tester("M", 3000, "Tester");


        manager.addSubordinate(developer);
        manager.addSubordinate(developer2);
        manager.addSubordinate(developer3);
        manager.addSubordinate(tester);
        manager.addSubordinate(tester2);
        manager.addSubordinate(tester3);



        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);
        employees.add(tester);
        employees.add(manager2);
        employees.add(developer2);
        employees.add(tester2);
        employees.add(manager3);
        employees.add(developer3);
        employees.add(tester3);


        for (Employee emp : employees) {
            System.out.println(emp.employeeDetails());
            System.out.println("Bonus for " + emp.getName() + ": " + String.format("%.2f", emp.calculateBonus()) + " $");


            if (emp instanceof Manager) {
                Manager m = (Manager) emp;
                System.out.println("Subordinates of " + m.getName() + ":");
                for (Employee subordinate : m.getSubOrdinate()) {
                    System.out.println("- " + subordinate.getName());
                }
            }

            System.out.println("------------------------");

        }


        double totalBonus = calculateTotalBonus(employees);
        System.out.println("Total Bonus Handed Out: " + String.format("%.2f", totalBonus) + " $");
    }
}
