package eloadas5;

public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, int birthYear, String department) {
        super(name, salary, birthYear);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                "name: " + this.getName() +", " +
//                "salary: " + this.getSalary() +", " +
//                "birthYear: " + this.getBirthYear() +", " +
//                "department='" + department + '\'' +
//                '}';
//    }

//    Feluliras
    @Override
    public String toString() {
        System.out.println("MANAGER");
        return "Manager{" +
                super.toString() +" " +
                "department='" + department + '\'' +
                '}';
    }
}
