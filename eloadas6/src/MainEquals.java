import models.Employee;
import models.Manager;

public class MainEquals {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Burszan Hunor", 5000, 2000);
        Employee emp2 = new Employee("Burszan Hunor", 5000, 2000);
        Manager man1 = new Manager("Burszan Hunor", 5000, 2000, "Backend");
        // Employee - nincs felulirva az equals! --> az Object osztalytol orokolt equals hivodik
        // emp1.equals( emp2 ) : Oject osztalytol orokolt equals() metodusa --> false
//        System.out.println( emp1.equals( emp2 ));

        // Employee - felulirjuk az equals metodust - tartalmi osszehasonlitast vegzunk
        System.out.println( emp1.equals( man1 ));
        System.out.println( man1.equals( emp1 ));
    }
}
