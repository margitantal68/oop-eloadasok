import models.Company;
import models.Employee;
import models.Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainCompany {
    public static void main(String[] args) {
        Company comp = new Company("Sapi");

        System.out.println( comp );
        comp.hire( new Employee("Koble Melinda", 1000, 1998));
        comp.hire( new Employee("Derzsi Daniel", 1200, 2001));
        comp.hire( new Manager("Vasi Andras", 1500, 2001, "Mobile development"));
        comp.hire( new Manager("Bodor Benjamin", 1400, 2001, "Web development"));

        comp.listEmployees();
        System.out.println();
        comp.increaseSalary(0.1);
        System.out.println();
        comp.listEmployees();

    }
}
