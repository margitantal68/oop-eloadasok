package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> treeset = new TreeSet<>();
        Random random = new Random(78);
        for( int i=0; i<30; ++i){
            int value = random.nextInt( 50 );
            list.add( value );
            hashset.add( value );
            treeset.add( value );
        }
        System.out.println("List size: " + list.size());
        System.out.println("Hashset size: " + hashset.size());
        System.out.println("Treeset size: " + treeset.size());
        System.out.print("Treeset: ");
        for( Integer i: treeset){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Arraylist: ");
        for( Integer i: list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Hashset: ");
        for( Integer i: hashset){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
