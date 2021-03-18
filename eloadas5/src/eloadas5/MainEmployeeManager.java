package eloadas5;

import java.util.ArrayList;

public class MainEmployeeManager {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Manager m = new Manager("Pap Janos", 10000, 1999, "eladasi");
//        System.out.println( m );

        for( int i=0; i<5; ++i){
            employees.add( new Employee("Name"+i, (i+1) * 1000, 1990 + i));
        }
        for( Employee e: employees){
            System.out.println( e );
        }
        System.out.println();
        employees.add( m );

        for( Employee e: employees){
            //        POLIMORFIZMUS!!!! - toString()
            System.out.println( e.toString() );
        }
    }
}
