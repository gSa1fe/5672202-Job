package week11;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public String getName() { return name; }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String n, double s, double b) {
        super(n, s);
        this.bonus = b;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hours;

    public PartTimeEmployee(String n, double rate, int h) {
        super(n, 0); // เงินเดือนพื้นฐาน 0
        this.hourlyRate = rate;
        this.hours = h;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hours; // Override
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Employee alice = new FullTimeEmployee("Alice", 40000, 2000);
        Employee bob = new PartTimeEmployee("Bob", 300, 60);

        printSalary(alice, "FullTimeEmployee");
        printSalary(bob, "PartTimeEmployee");
    }

    private static void printSalary(Employee e, String type) {
        System.out.printf("%-10s %-16s %.2f%n", e.getName(), type, e.calculateSalary());
    }
}