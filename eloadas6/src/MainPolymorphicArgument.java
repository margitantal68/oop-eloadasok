import models.Employee;
import models.Manager;

public class MainPolymorphicArgument {
    public static void main(String[] args) {
        Employee e1 = new Employee("Burszan Hunor", 5000,  2000);
        Manager m1 = new Manager("Kovacs Bence", 5500,  2001, "UI department");
//        Szukebb helyett mehet a bovebb!!
        System.out.println( createMessage( e1 ));
        System.out.println( createMessage( m1 ));

//        Bovebb helyett nem mehet a szukebb
//        System.out.println( createMessageSecond( e1 ));
        System.out.println( createMessageSecond( m1 ));
    }

    /**
     *
     * @param e - polymorphic argument
     *          Liskov susbstitution - Liskov helyettesithetoseg
     *          ososztaly tipusu argumentumot lehet helyettesiten szarmaztatott osztaly tipusuval
     *          models.Employee (Alkalmazott), models.Manager
     *          Minden manager egyben alkalmazott is, tehat az alkalmazottat helyettesitheti a manager
     *          Forditva nem igaz! Nem minden alkalmazott manager. Tehat, ahova manager szukseges, oda nem lehet kozonseges alkalmazottat delegalni.
     * @return
     */
    public static String createMessage( Employee e ){
        return "Hello, " + e.getName();
    }

    public static String createMessageSecond( Manager m ){
        return "Hello, " + m.getName();
    }
}
