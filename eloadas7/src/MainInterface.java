import interfaces.IStack;

public class MainInterface {
    public static void main(String[] args) {
        IStack a[] = new IStack[ 3 ];
        for( IStack st: a ){
            System.out.print( st +" " );
        }
        System.out.println();
    }
}
