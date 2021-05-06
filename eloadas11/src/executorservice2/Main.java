package executorservice2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int n = 1000000;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<n; ++i){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                System.out.println( Thread.currentThread().getName() + " finished");
            }
        };
        int numTasks = 4;
        for( int i=0; i<numTasks; ++i) {
            executor.execute(task);
        }
        executor.shutdown();
    }
}
