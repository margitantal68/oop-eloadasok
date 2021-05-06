package executorservice1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // number of increments to be made
        int n = 10000;
        Counter counter = new Counter();
        // Factory method
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for( int i=0; i<n; ++i) {
                    counter.getNextValue();
                }
            }
        };
        executor.execute( task );
        executor.execute( task );
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {

        }

        System.out.println(Thread.currentThread().getName()+" Counter: " + counter.getValue());
    }
}
