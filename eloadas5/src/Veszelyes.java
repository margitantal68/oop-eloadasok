import java.util.ArrayList;

public class Veszelyes {
    public static void main(String[] args) {
        for( Specialisation spec: Specialisation.values()){
            System.out.println( spec.name );
        }
        Specialisation.create("PUBLIC HEALTH");
        Specialisation.create("INFORMATICS");
        System.out.println("**********");
        for( Specialisation spec: Specialisation.values()){
            System.out.println( spec.name );
        }
        // Torles aminek nem kellene mukodnie!!!!
        ArrayList<Specialisation> list = Specialisation.values1();
        list.clear();
        System.out.println("**********");
        System.out.println("Torles utan!!!");
        for( Specialisation spec: Specialisation.values()){
            System.out.println( spec.name );
        }
    }
}

class Specialisation {
    public final String name;
    private static ArrayList<Specialisation> specialisations = new ArrayList<>();
    // static code block
    // egyszer hajtodik vegre - az osztaly betoltesekor
    static{
        create("INFORMATICS");
        create("COMPUTER SCIENCE");
        create("AUTOMATION");
        create("TELECOMMUNICATIONS");
    }

    // static factory method
    public static Specialisation create(String name) {
        return new Specialisation(name);
    }

    // private constructor
    private Specialisation(String name) {
        this.name = name;
        if( !exist(name )){
            specialisations.add(this);
        }
    }

    private boolean exist( String name ){
        for( Specialisation spec: specialisations ){
            if( spec.name.equals( name )){
                return true;
            }
        }
        return false;
    }

    // Correct
    public static Specialisation[] values() {
        Specialisation[] result = new Specialisation[specialisations.size()];
        // Convert ArrayList<T> to T[ ]
        result = specialisations.toArray(result);
        return result;
    }

    // Incorrect. WHY?
    public static ArrayList<Specialisation> values1() {
        return specialisations;
    }

}


