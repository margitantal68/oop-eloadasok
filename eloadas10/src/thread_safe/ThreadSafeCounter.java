package thread_safe;

public class ThreadSafeCounter {
    private int counter;

    public void increment(){
        synchronized( this ) {
            ++counter;
        }
    }

    public int getCounter(){
        return counter;
    }

}
