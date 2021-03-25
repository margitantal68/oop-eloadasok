package models;

import java.util.Objects;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(employee.salary, salary) == 0 && birthYear == employee.birthYear && Objects.equals(name, employee.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && birthYear == employee.birthYear && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, birthYear);
    }
}
