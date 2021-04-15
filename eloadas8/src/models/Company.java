package models;

import java.util.ArrayList;

public class Company{
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire( Employee e){
        this.employees.add( e );
    }

//    Employee - percent %
//    Manager - (percent + 0.05)
    public void increaseSalary( double percent ){
        for( Employee e: employees){
            // e - referencia - tipusa: Employee (statikus)
            // e - dinamikus tipusa - hivatkozott objektum tipusa
            if( e instanceof Manager ){

                Manager manager = (Manager) e;
                System.out.println( manager.getName() +": " + manager.getDepartment() );
                e.setSalary( e.getSalary() + e.getSalary() * (percent +0.05));
            } else{
                e.setSalary( e.getSalary() + e.getSalary() * percent );
            }
        }
    }

    public void listEmployees(){
        for( Employee e : employees){
//            e.toString() - e referenica - toString() metodus - futasidoben tortenik - Overriding
            System.out.println( e.toString() );
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                " num employees: " + this.employees.size()+
                '}';
    }
}
