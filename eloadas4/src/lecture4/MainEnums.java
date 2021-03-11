package lecture4;

import java.util.ArrayList;

/**
 * Konstansgyujtemenyek
 * enum: values(), name(), ordinal()
 * 1. enum Month
 * 2. enum Specialisation
 *
 */

public class MainEnums {

    public static void main( String[] args ){
//        Specialisation spec1 = new Specialisation("Informatics");
//        Specialisation spec2 = new Specialisation("Computer Science");
//        Specialisation spec3 = new Specialisation("Automation");
//        Specialisation spec4 = new Specialisation("Telecommunication");
        Specialisation.create("Informatics");
        Specialisation.create("Computer Science");
        Specialisation.create("Automation");
        Specialisation.create("Telecommunication");

        for( String spec: Specialisation.values()){
            System.out.println( spec );
        }
    }
}




class Specialisation{
    public final String name;

    public static Specialisation create(String name ){
        return new Specialisation(name);
    }

    private Specialisation(String name) {
        this.name = name;
        specialisations.add( name );
    }

    private static ArrayList<String> specialisations = new ArrayList<>();

    public static String[] values(){
        String[] result = new String[ specialisations.size()];
        int i = 0;
        for( String value: specialisations){
            result[ i++] = value;
        }
        return result;
    }

}
