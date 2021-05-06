package thread_unsafe;

public class ThreadUnsafeCounter {
    private volatile int counter;

    public void increment(){
            ++counter;
    }

    public int getCounter(){
        return counter;
    }

}
