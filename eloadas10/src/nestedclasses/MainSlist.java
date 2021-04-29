package nestedclasses;

import java.util.Iterator;

public class MainSlist {
    public static void main(String[] args) {
        Slist list = new Slist();
        for( int i=0; i<10;++i){
            list.insertFirst( i );
        }
        System.out.print("Elso bejaro:");
        Iterator it = list.createIterator();
        while( it.hasNext() ){
            System.out.print( it.next()+" ");
        }
        System.out.println();
        System.out.print("Masodik bejaro:");

        Iterator it1 = list.createIterator();
        System.out.print(it1.next()+" ");
        System.out.print(it1.next()+" ");

    }


}
