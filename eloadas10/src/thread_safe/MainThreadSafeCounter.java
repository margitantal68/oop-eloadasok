package thread_safe;

public class MainThreadSafeCounter {
    public static void main(String[] args) {
        int MAX = 10000;
        ThreadSafeCounter counter = new ThreadSafeCounter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i=0; i<MAX; ++i) {
                    counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i=0; i<MAX; ++i) {
                    counter.increment();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Counter: " + counter.getCounter());
    }

}
