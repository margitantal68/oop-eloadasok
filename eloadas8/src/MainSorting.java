import models.Employee;
import models.Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainSorting {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add( new Employee("Koble Melinda", 1000, 1998));
        emps.add( new Employee("Derzsi Daniel", 1200, 2001));
        emps.add( new Manager("Vasi Andras", 1500, 2001, "Mobile development"));
        emps.add( new Manager("Bodor Benjamin", 1400, 2001, "Web development"));

        for( Employee e: emps ){
            System.out.println( e );

        }
        System.out.println();
        Collections.sort( emps );
        for( Employee e: emps ){
            System.out.println( e );

        }

        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return (int)(employee2.getSalary() - employee1.getSalary());
            }
        });
        System.out.println();
        for( Employee e: emps ){
            System.out.println( e );

        }

    }
}
