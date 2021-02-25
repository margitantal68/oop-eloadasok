package lecture2;

public class Main {
    public static void main(String[] args){
        // double - primitiv tipus
        // Double - osztaly (java.lang) - wrapper class
        // double <--> Double  automatikus konverzio

        Double d1 = Double.NEGATIVE_INFINITY;
        if( d1 == Double.NEGATIVE_INFINITY){
            System.out.println("d1: negative Infinity");
        }

        Double d2 = Double.NaN;
        if ( d2.isNaN() ){
            System.out.println("d2: not a number");
        }
        // EZT NE CSINALD!!!
        if( d2 == Double.NaN ){
            System.out.println("d2 is not a number");
        }
    }
}
