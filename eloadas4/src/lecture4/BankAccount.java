package lecture4;

public class BankAccount {
//    unique - egyedi
//    final - konstans!!
//    blank final variable
//    a peldanyhoz tartozik
    private final int id;

//    konstans, ami az osztalyhoz tartozik
//    CSAK EGY!!
    private final static String prefix = "OTP";
    private static int counter = 0;

    public BankAccount() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                '}';
    }
}
