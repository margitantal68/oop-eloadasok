package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> treeset = new TreeSet<>();
        Random random = new Random(78);
        for( int i=0; i<100; ++i){
            int value = random.nextInt( 50 );
            list.add( value );
            hashset.add( value );
            treeset.add( value );
        }
        System.out.println("List size: " + list.size());
        System.out.println("Hashset size: " + hashset.size());
        System.out.println("Treeset size: " + treeset.size());
    }
}
