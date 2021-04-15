package models;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, int birthYear, String department) {
        super(name, salary, birthYear);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "models.Manager{" +
                "name: " + this.getName() +", " +
                "salary: " + this.getSalary() +", " +
                "birthYear: " + this.getBirthYear() +", " +
                "department='" + department + '\'' +
                '}';
    }
}
