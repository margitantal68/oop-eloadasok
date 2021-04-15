import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
//      List<String> l1 = new ArrayList<>();
        List<String> l1 = new LinkedList<>();
        l1.add("Welcome");
        l1.add("to");
        l1.add("Java");
        Iterator<String> it = l1.iterator();
        while( it.hasNext() ){
            System.out.print( it.next()+" ");
        }
        System.out.println();
        for( String str: l1 ){
            System.out.print( str + " ");
        }
        System.out.println();
    }
}
