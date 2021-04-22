import models.Employee;
import models.Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainSorting {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Koble Melinda", 1200, 1998));
        emps.add(new Employee("Derzsi Daniel", 1200, 2001));
        emps.add(new Manager("Vasi Andras", 1500, 2001, "Mobile development"));
        emps.add(new Manager("Bodor Benjamin", 1400, 2001, "Web development"));

        for (Employee e : emps) {
            System.out.println(e);

        }
        System.out.println();
        Collections.sort(emps);
        for (Employee e : emps) {
            System.out.println(e);

        }

        Collections.sort(emps, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        if( e1.getSalary() == e2.getSalary() ){
                            return e1.getName().compareTo(e2.getName());
                        }
                        return (int)(e1.getSalary() - e2.getSalary());
                    }
                });

        System.out.println();
        for (Employee e : emps) {
            System.out.println(e);

        }

    }
}
