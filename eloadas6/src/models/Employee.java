package models;

public class Employee {
    private String name;
    private double salary;
    private int birthYear;

    public Employee(String name, double salary, int birthYear) {
        this.name = name;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "models.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthYear=" + birthYear +
                '}';
    }
}
