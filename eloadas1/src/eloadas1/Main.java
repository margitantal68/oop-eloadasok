package eloadas1;

public class Main {
    public static void main(String [] args){
        // névtelen objektum - nem tartozik hozzá referencia
        System.out.println("Nevtelen objektum: " + (new Counter(0)).getValue());
        // referencia: refCounter1 (A referencia az objektum kezelője - a pointerhez hasonló)
        Counter refCounter1 = new Counter( 0 );
        refCounter1.inc();
        System.out.println("refCounter1: " + refCounter1.getValue());
        // referencia: refCounter2
        Counter refCounter2 = new Counter( 0 );
        for(int i=0; i<10; ++i){
            refCounter2.inc();
        }
        System.out.println("refCounter2: " + refCounter2.getValue());
    }
}
