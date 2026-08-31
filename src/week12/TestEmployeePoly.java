package week12;

class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hours;

    public PartTimeEmployee(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hours;
    }
}

public class TestEmployeePoly {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Somchai", 30000),
                new PartTimeEmployee("Suda", 200, 80),
                new FullTimeEmployee("Anan", 28000)
        };

        System.out.println("ชื่อพนักงาน\tเงินเดือน");
        System.out.println("--------------------------");
        for (Employee e : employees) {
            System.out.printf("%-10s : %.2f%n", e.name, e.calculateSalary());
        }
    }
}