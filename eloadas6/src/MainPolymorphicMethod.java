import models.Employee;
import models.Manager;

import java.util.ArrayList;

public class MainPolymorphicMethod {
    public static void main(String[] args) {
        // toString - tobbalaku, polimorfikus metodus
        // models.Employee - toString
        // models.Manager - toString - overriding (feluliras)
        // models.Manager osztaly - 2 darab toString metodus
        //          1 orokolt - super.toString()
        //          1 sajat - this.toString() vagy toString()

        // polimorfikus tarolo -> ososztaly tipusu
        // employees, mint tomb referenciakat (cimeket)  tartalmaz --> HOMOGEN
        // a  tombelemek (referenciak) hivatkozhatnak kulonbozo tipusu objektumokra -->HETEROGEN
        ArrayList<Employee> employees = new ArrayList<>();
        for( int i=0; i<10; ++i){
            if( i % 2 == 0 ) {
                employees.add(new Employee("Name" + i, (i + 1) * 1000, 1990 + i));
            } else{
                employees.add(new Manager("Name" + i, (i + 1) * 1000, 1990 + i, "department" + i));
            }
        }
        for( Employee e: employees){
            // e - referencia az employees tomb aktualis elemere
            // e - statikus tipusa models.Employee
            // ha az e referencia models.Employee tipusura hivatkozik --> e.toString() az models.Employee osztaly toString metodusat hivja
            // ha az e referencia models.Manager  tipusura hivatkozik --> e.toString() a models.Manager osztaly toString metodusat hivja
            System.out.println( e.toString() ); // ekvivalens ezzel: System.out.println( e );
        }

        int numManagers = 0;
        for( Employee e: employees){
            if( e instanceof Manager ){
                ++numManagers;
            }
        }
        System.out.println("Num. managers: " + numManagers);
   }
}
