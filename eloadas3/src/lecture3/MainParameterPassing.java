package lecture3;

public class MainParameterPassing {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("a=" + a +", b= " + b);
        swap( a, b);
        System.out.println("a=" + a +", b= " + b);

        MyInteger x1 = new MyInteger( 10 );
        MyInteger x2 = new MyInteger( 20 );
        System.out.println("x1 = " + x1.getValue() +", x2 = " + x2.getValue());
        swap( x1, x2);
        System.out.println("x1 = " + x1.getValue() +", x2 = " + x2.getValue());
        //        Futasideju hiba - NullPointerException
        //        MyInteger i3 = null;
        //        System.out.println(i3.getValue());
    }
// azonos nevu fuggvenyek, kulonbozo parameterlistaval - POLIMORFIZMUS
//    STATIKUS POLIMORFIZMUS - KOMPILALASI IDOBEN ELDOL


// Java - csak ertek szerinti parameteratadas - pass by value

//    primitiv tipusu poarameterek - NEM MUKODIK A CSERE
//    Az IntelliJ is 3 darab WARNING-ot JELEZ!!!
    public static void swap(int x, int y ){
        int temp = x;
        x = y;
        y = temp;
    }

//    referencia tipusu parameterek - A HIVATKOZOTT OBJEKTUMOK ATTRIBUTUMAIT FOGJA CSERELNI
    public static void swap(MyInteger i1, MyInteger i2){
        int temp = i1.getValue();
        i1.setValue( i2.getValue());
        i2.setValue( temp );
    }
}
