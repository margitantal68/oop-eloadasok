package lecture4;

import java.util.ArrayList;

public class MainStatic {


    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for( int i=0; i<5; ++i){
            accounts.add( new BankAccount());
        }
        System.out.println( accounts );
    }
}
