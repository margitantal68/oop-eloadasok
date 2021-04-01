import models.Person;
import models.Point;

public class MainEquals {
    public static void main(String[] args) {
        // 1. Person - equals -- NO OVERRIDING
        // az equals referencia szerinti osszehasonlitast vegez (Object osztaly)
        System.out.println("Person: ");
        Person p1 = new Person("X", "Y", 1990);
        Person p2 = new Person("X", "Y", 1990);
        System.out.println( p1 == p2);
        System.out.println( p1.equals(p2));

        // 2. Point - equals -- OVERRIDING
        // az equals tartalom szerinti (a felulirt valtozatnak megfelelo) osszehasonlitast vegez
        System.out.println("Point: ");
        Point point1 = new Point(10, 10);
        Point point2 = new Point(10, 10);

        System.out.println( point1 == point2 );
        System.out.println( point1.equals( point2 ));
        System.out.println("String1: ");
        // 3. String - equals !!!
        // String Pool !!! - ez tartalmazza a String literalokat
        String s1 = "al"+"ma";
        String s2 = "alma";
        System.out.println(s1 == s2);
        System.out.println( s1.equals(s2));

        System.out.println("String2");
        String ss1 = new String("alma");
        String ss2 = new String("alma");
        System.out.println(ss1 == ss2);
        System.out.println( ss1.equals(ss2));



    }
}
