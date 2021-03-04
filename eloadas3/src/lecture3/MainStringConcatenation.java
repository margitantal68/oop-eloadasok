package lecture3;

public class MainStringConcatenation {
    // Execute with N = 10000, N = 100000, N = 1000000

    public static final int N = 1000000;
    public static void main(String[] args) {
        System.out.println("N: "+N);
        /* StringBuffer  - mutable (Thread safe)*/
        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; ++i) {
            sb.append("bla");
        }
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println("StringBuffer: "+elapsedTime2 + " ms");

        /* StringBuilder  - mutable (not Thread safe)*/
        long startTime3 = System.currentTimeMillis();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            sb3.append("bla");
        }
        long stopTime3 = System.currentTimeMillis();
        long elapsedTime3 = stopTime3 - startTime3;
        System.out.println("StringBuilder: "+elapsedTime3 + " ms");

        /* String - immutable*/
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; ++i) {
            s += "bla";
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("String: "+elapsedTime  + " ms");
    }
}
