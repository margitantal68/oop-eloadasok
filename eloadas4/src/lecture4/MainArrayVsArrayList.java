package lecture4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainArrayVsArrayList {
    /**
     *
     * 1. Muveletek: add, get, set, remove, size, sort, for-each
     * 2. Szoveges allomanyok feldolgozasa - Scanner osztaly
     */
    public static final int N = 5;

    public static void main(String[] args){
        String[] array1 = new String[ N ];
        Random rnd = new Random();
        System.out.println( array1.length);


        for( int i=0; i<N; ++i ){
            array1[ i ] = "String" + rnd.nextInt(100);
        }
        for( String str: array1 ){
            System.out.print( str +" ");
        }
        System.out.println();



        Arrays.sort( array1 );
        for( String str: array1 ){
            System.out.print( str +" ");
        }
        System.out.println();

//        2.
//        ArrayList<String> array2 = new ArrayList<>();
//        System.out.println( array2.size());
//
//        for( int i=0; i<N; ++i){
//            array2.add( "String" + i);
//        }
//
//        System.out.println(array2);
//        array2.remove(2);
//        System.out.println ("Torles utan - 2-es pozicio ");
//
//        System.out.println(array2);
//        System.out.println("array2[ 0 ]: " + array2.get(0));
//
//        array2.set(0, "String100");
//        System.out.println(array2);
//        array2.set(3, "Abc");
//        System.out.println(array2);
//        Collections.sort(array2);
//        System.out.println(array2);
//
//        ArrayList<Integer> intArray = new ArrayList<>();
//
//        for( int i=0; i<10; ++i){
//            intArray.add( rnd.nextInt(100));
//        }
//        System.out.println( intArray );
//// Integer osztaly
//        Collections.sort( intArray );
//        System.out.println( intArray );

    }
}
