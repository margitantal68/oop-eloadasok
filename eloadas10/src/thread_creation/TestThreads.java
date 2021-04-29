package thread_creation;

public class TestThreads {
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for( int i=0; i<10; ++i){
                System.out.println(Thread.currentThread().getName()+ ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread( runnable );
        Thread t2 = new Thread( runnable );
        t1.start();
        t2.start();

    }
}
