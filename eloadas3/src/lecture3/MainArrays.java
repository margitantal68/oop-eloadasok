package lecture3;

public class MainArrays {
//    args - tomb tipusu referencia: T[ ]
    public static void main( String[] args ){
//        ***** primitiv tipusu elemeket tartalmazo tombok
//        C-stilusu, intArray1 - tomb referencia
        int intArray1[];
//        Java-stilusu
        int[] intArray2;
//        new Tipusnev[ meret ]
//        a tombelemek automatikusan inicializalodnak! - default ertek
        intArray1 = new int[ 10 ];
        for( int elem: intArray1){
            System.out.print( elem +" ");
        }
        System.out.println();

        boolean [] logicalArray = new boolean[ 3 ];
        for( boolean elem: logicalArray ){
            System.out.print( elem +" ");
        }
        System.out.println();
        //        ***** referencia tipusu elemeket tartalmazo tombok
        Point [] points = new Point[ 3 ];
        for( Point point: points ){
            System.out.print( point + " ");
        }
        System.out.println();

        for( int i=0; i< points.length; ++i){
            points[ i ] = new Point((i+1)*10, (i+1)*10);
            System.out.print( points[ i ]+" ");
        }
        System.out.println();

//        inicializalo kifejezes hasznalata
        String[] names = {"Marika", "Peter", "Klara"};
        for( String name: names ){
            System.out.print( name +" ");
        }
        System.out.println();

        Point[] pointsArray = { new Point(0,0), new Point(1, 1)};
        for( Point point: pointsArray ){
            System.out.print( point +" ");
        }
        System.out.println();

        points = pointsArray;
        for( Point point: points ){
            System.out.print( point +" ");
        }

    }
}
